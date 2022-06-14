package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.example.demo.entity.Customer;

import com.example.demo.error.CustomerNotFoundException;

public interface CustomerService {

	Customer saveCustomer(Customer customer);

	
	//select customers
	List<Customer> fetchCustomerList();
       
	//select customers by id
	Customer fetchCustomerById(Long cid) throws CustomerNotFoundException;

	//update customer by id
	Customer updateCustomerById(Long cid, Customer customer) throws CustomerNotFoundException;

    //delete customers using id
   void deleteCustomerById(Long cid) throws CustomerNotFoundException;


	

	
	
	
	

	
}	
		
	

	
		
	


