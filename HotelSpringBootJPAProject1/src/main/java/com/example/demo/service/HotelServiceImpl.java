package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Hotel;
import com.example.demo.error.CustomerNotFoundException;
import com.example.demo.error.HotelNotFoundException;
import com.example.demo.repository.HotelRepository;
	

	

	@Service
	public class HotelServiceImpl implements HotelService{

		@Autowired
		HotelRepository hotelRepo;
		
		
           //save all the hotels
		@Override
		public Hotel saveHotel(@Valid Hotel hotel) {
			// TODO Auto-generated method stub
			return hotelRepo.save(hotel);
		}
		
       //list all the hotels
		@Override
		public List<Hotel> fetchHotelList() {
			// TODO Auto-generated method stub
			return hotelRepo.findAll();
		}
		
		//select the hotel by name
		@Override
		public Hotel fetchHotelByName(String hname) {
			// TODO Auto-generated method stub
			return hotelRepo.getByHotelName(hname);
		}

		//select the hotel by code
		@Override
		public Hotel fetchHotelByCode(String hcode) {
			// TODO Auto-generated method stub
			return hotelRepo.getByHotelCode(hcode);
		}

		//select the hotel by address
		@Override
		public Hotel fetchHotelByAddress(String haddress) {
			// TODO Auto-generated method stub
			return hotelRepo.getByHotelAddress(haddress);
		}

		//select the hotels by phno
		@Override
		public Hotel fetchHotelByPhno(int hphno) {
			// TODO Auto-generated method stub
			return hotelRepo.getByHotelPhno(hphno);
		}

			//select the hotels by id
	     @Override
		public Hotel fetchHotelById(Long hid) throws HotelNotFoundException {
			// TODO Auto-generated method stub
			Optional<Hotel> hotel=hotelRepo.findById(hid);
			if(!hotel.isPresent()) {
				throw new HotelNotFoundException("Hotel Not Available");
			}
			
			// TODO Auto-generated method stub
			return hotelRepo.findById(hid).get();
		}
			
	     //delete hotels using id
		@Override
		public void deleteHotelById(Long hid) throws HotelNotFoundException  {
			// TODO Auto-generated method stub
			Optional<Hotel>optinal=hotelRepo.findById(hid);
			if(optinal.isEmpty())throw new HotelNotFoundException("Hotel not found");
			 hotelRepo.deleteById(hid);
		}
		
        //update hotels by id
		@Override
		public Hotel updateHotelById(Long hid, Hotel hotel) throws HotelNotFoundException {
			// TODO Auto-generated method stub
			Optional<Hotel> hotel1=hotelRepo.findById(hid);
			Hotel hotDB=null;
				if(hotel1.isPresent()) {
					hotDB=hotelRepo.findById(hid).get();
					if(Objects.nonNull(hotel.getHotelName()) && !"".equalsIgnoreCase(hotel.getHotelName())) {
						hotDB.setHotelName(hotel.getHotelName());
					}
					if(Objects.nonNull(hotel.getHotelAddress()) && !"".equalsIgnoreCase(hotel.getHotelAddress())) {
						hotDB.setHotelAddress(hotel.getHotelAddress());
						System.out.println(hotel.getHotelAddress());
					}
					if(Objects.nonNull(hotel.getHotelCode()) && !"".equalsIgnoreCase(hotel.getHotelCode())) {
						hotDB.setHotelCode(hotel.getHotelCode());
						System.out.println(hotel.getHotelCode());
					}
					return hotelRepo.save(hotDB);
				}
				else {
					
					
					throw new HotelNotFoundException("Hotel Not Available");
				}
			
			}

		}



	
	
	
		
	

	
	
	
		
	
	
	

	
	


			
		

		
		
		
