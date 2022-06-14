package com.example.demo.error;


/**
 * This customer not found exception class is 
 * used to display the customer operation serror message in the output screen
 * 
 */

public class CustomerNotFoundException extends Exception {
	private static final long serialVersionUID =1L;
	public CustomerNotFoundException(String s) {
	super(s);
	}

}
