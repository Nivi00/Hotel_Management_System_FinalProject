package com.example.demo.service;

import java.util.List;
import javax.validation.Valid;

import com.example.demo.entity.Hotel;
import com.example.demo.error.HotelNotFoundException;

/**
 * This customer interface is used to create the abstract methods
 * @author sahaj
 *
 */

public interface HotelService {
    
   public Hotel saveHotel(@Valid Hotel hotel);
   
   //select hotels
	public List<Hotel> fetchHotelList();
	
	//select hotels using id
	public Hotel fetchHotelById(Long hid) throws HotelNotFoundException;
	
	//delete hotels using id
	public void  deleteHotelById(Long hid) throws HotelNotFoundException;
	
	//update hotels using id
	public  Hotel updateHotelById(Long hid, Hotel hotel) throws HotelNotFoundException;
	
	//select hotels using name
	public Hotel fetchHotelByName(String hname);
	
	//select hotels using code
	public Hotel fetchHotelByCode(String hcode);
	
	//select hotels using address
	public Hotel fetchHotelByAddress(String haddress);
	
	//select hotels using phno
	public Hotel fetchHotelByPhno(int hphno);

}

