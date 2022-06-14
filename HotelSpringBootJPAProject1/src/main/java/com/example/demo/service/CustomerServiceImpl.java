package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Customer;
import com.example.demo.error.CustomerNotFoundException;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	CustomerRepository customerRepo;

	

	@Override
	//save the customers
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	
	//list all customers
	public List<Customer> fetchCustomerList() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

	@Override
	//select customer by id
	public Customer fetchCustomerById(Long cid) throws CustomerNotFoundException {
		Optional<Customer> hotel=customerRepo.findById(cid);
		if(!hotel.isPresent()) {
			throw new CustomerNotFoundException("Customer Not Available");
		}
		
		// TODO Auto-generated method stub
		return customerRepo.findById(cid).get();
	}

	
	

	@Override
	//delete customer by id
	public void deleteCustomerById(Long cid) throws CustomerNotFoundException  {
		// TODO Auto-generated method stub
		Optional<Customer>optional=customerRepo.findById(cid);
	 	 if(optional.isEmpty())throw new CustomerNotFoundException("Customer not found");
		customerRepo.deleteById(cid);
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	
	//update customer by id
	public Customer updateCustomerById(Long cid, Customer customer) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		Optional<Customer> hotel1=customerRepo.findById(cid);
		Customer customerDB=null;
			if(hotel1.isPresent()) {
				customerDB=customerRepo.findById(cid).get();
				if(Objects.nonNull(customer.getCname()) && !"".equalsIgnoreCase(customer.getCname())) {
					customerDB.setCname(customer.getCname());
				}
				if(Objects.nonNull(customer.getCaddress()) && !"".equalsIgnoreCase(customer.getCaddress())) {
					customerDB.setCaddress(customer.getCaddress());
					System.out.println(customer.getCaddress());
				}
				if(Objects.nonNull(customer.getCphno()) && !"".equals(customer.getCphno())) {
					customerDB.setCphno(customer.getCphno());
					System.out.println(customer.getCaddress());
				}
			
				if(Objects.nonNull(customer.getCroomno()) && !"".equalsIgnoreCase(customer.getCaddress())) {
					customerDB.setCroomno(customer.getCroomno());
					System.out.println(customer.getCaddress());
				}
				
				return customerRepo.save(customerDB);
			}
			else {
				
				
				throw new CustomerNotFoundException("Customer Not Available");
			}
		
		}

	
	}
	
	
	
	
	
		
	

	
	
	
		
	
	
	

	
	

