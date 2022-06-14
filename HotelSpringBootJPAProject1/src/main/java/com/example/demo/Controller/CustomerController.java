package com.example.demo.Controller;


/**
 * In this customer controller Some annotations are used
 * @RestController->used for defining the class is controller
 * @Autowired->used for object injection
 * @GetMapping->used for select operation 
 * @PutMapping->used for update operation
 * @DeleteMapping->used for delete operation 
 */


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;

import com.example.demo.error.CustomerNotFoundException;

import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	
           @Autowired	
          CustomerService customerService;
           //save
         
          
         //Gets all records
   	    @GetMapping("/customers/get")
   	 	public List<Customer> fetchCustomerList() {
   	 		return customerService.fetchCustomerList();
   	 	}
   	    
   	  //get records by id
	 	@GetMapping("/customers/{cid}")
	 	public Customer fetchCustomerById(@PathVariable("cid")Long cid) throws CustomerNotFoundException 
	 		{
	 		return customerService.fetchCustomerById(cid);
	 	}
	 	
		
	    //delete Record by id
	 	@DeleteMapping("/customers/{cid}")
	 	public String deleteCustomerById(@PathVariable("cid")Long cid) throws CustomerNotFoundException 
	 	{
	 	
	 	 customerService.deleteCustomerById(cid);
	 	 return "customer id is deleted";
	 		 
	 	}
	 	
	 	//update Record by id
	 	@PutMapping("/customers/{cid}")
	 	public  Customer updateCustomerById(@PathVariable("cid")Long cid, @RequestBody Customer customer) throws CustomerNotFoundException 
	 	{
	 		return customerService.updateCustomerById(cid,customer);
	 	}
	 	

}