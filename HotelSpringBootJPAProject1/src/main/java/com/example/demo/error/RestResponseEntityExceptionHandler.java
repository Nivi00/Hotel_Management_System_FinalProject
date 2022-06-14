package com.example.demo.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.entity.ErrorMessage;

@ControllerAdvice
@ResponseStatus
	public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	
	
	@ExceptionHandler(HotelNotFoundException.class) 
	    
	 
	    //here the hotel exceptions are handling
	    public ResponseEntity<ErrorMessage> hotelNotFoundException(HotelNotFoundException exception,WebRequest request){
	    	ErrorMessage message=new ErrorMessage(HttpStatus.NOT_FOUND,exception.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
	    	
	    }
	  //here the customer exceptions are handling
	  		@ExceptionHandler(CustomerNotFoundException.class)
	  		public ResponseEntity<ErrorMessage>CustomerNotFoundException(CustomerNotFoundException exception,WebRequest request) {
	  			ErrorMessage message=new ErrorMessage(HttpStatus.NOT_FOUND,exception.getMessage());//constructor
	  		  return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
	  	    }

	
		
	}
