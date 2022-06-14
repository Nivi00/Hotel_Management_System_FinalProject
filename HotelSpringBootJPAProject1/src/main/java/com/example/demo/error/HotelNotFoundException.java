package com.example.demo.error;

/**
 * This hotel not found exception class is 
 * used to display the hotel operation serror message in the output screen
 * 
 */
   public class HotelNotFoundException extends Exception {
		private static final long serialVersionUID =1L;
		public HotelNotFoundException(String s) {
		super(s);
		}
	}