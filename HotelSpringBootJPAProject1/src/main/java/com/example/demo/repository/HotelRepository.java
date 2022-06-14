package com.example.demo.repository;


/**
 * This customer not found exception class is 
 * used to display the customer operation serror message in the output screen
 * 
 */

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Hotel;


public interface HotelRepository extends JpaRepository<Hotel,Long> {

	Hotel getByHotelName(String hname);

	Hotel getByHotelCode(String hcode);

	Hotel getByHotelAddress(String haddress);

	Hotel getByHotelPhno(int hphno);
	
	
	//custom method
    
    
	
	
}