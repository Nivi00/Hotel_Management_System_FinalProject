package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;


/**
 * This customer not found exception class is 
 * used to display the customer operation serror message in the output screen
 * 
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

	

}

	
	

	
	
	
	

	
	


