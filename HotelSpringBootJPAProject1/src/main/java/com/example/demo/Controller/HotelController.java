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




	import org.springframework.beans.factory.annotation.Autowired;

	
	
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

	import com.example.demo.entity.Hotel;
    import com.example.demo.error.HotelNotFoundException;
     import com.example.demo.service.HotelService;

	@RestController
   public class HotelController {
	     @Autowired
	     HotelService hotelService;
	     //save
	     
	     @PostMapping("/hotels/insert")
	     public Hotel saveHotel( @RequestBody Hotel hotel) {
	    	 return hotelService.saveHotel(hotel);
	     }
	     
	     //Gets all records
	    @GetMapping("/hotels/get")
	 	public List<Hotel> fetchHotelList() {
	 		return hotelService.fetchHotelList();
	 	}
	 

	    //get records by id
	 	@GetMapping("/hotels/{id}")
	 	public Hotel fetchHotelById(@PathVariable("id")Long hid) throws HotelNotFoundException
	 		{
	 		return hotelService.fetchHotelById(hid);
	 	}
	    
	 	//get record by name
	 	@GetMapping("/hotels/name/{name}")
	 	public Hotel fetchHotelByName(@PathVariable("name")String hname)
	 	{
	 		return hotelService.fetchHotelByName(hname);
	 	}
	     
	 	//get record by code
	 	@GetMapping("/hotels/code/{code}")
	 	public  Hotel fetchHotelByCode(@PathVariable("code")String hcode) 
	 	{
	 		return hotelService.fetchHotelByCode(hcode);
	 	}
	 	
	 	
	 	//get record by address
	 	@GetMapping("/hotels/address/{address}")
	 	public  Hotel fetchHotelByAddress(@PathVariable("address")String haddress) 
	 	{
	 		return  hotelService.fetchHotelByAddress(haddress);
	 	}
	 	
	    //get record by phone no
	 	@GetMapping("/hotels/phno/{phno}")
	 	public Hotel fetchHotelByPhno(@PathVariable("phno")int hphno)
	 	{
	 		return hotelService.fetchHotelByPhno(hphno);
	 	}
	     
	   //delete Record by id
	 	@DeleteMapping("/hotels/{id}")
	 	public String   deleteHotelById(@PathVariable("id")Long hid) throws HotelNotFoundException
	 	{
	 		 hotelService.deleteHotelById(hid);
	 		 return "Hotel is deleted";
	 	}
	 	
	 	//update Record by id
	 	@PutMapping("/hotels/{id}")
	 	public  Hotel updateHotelById(@PathVariable("id")Long hid, @RequestBody Hotel hotel)throws HotelNotFoundException
	 	{
	 		return hotelService.updateHotelById(hid,hotel);
	 	}
	 	
	}
	
	



