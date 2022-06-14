package com.example.demo.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
/**
 * This customer class is converted as table and the variables are converted into columns
 * Here some annotations are used like entity,id,table,column,generated value...
 * Some of validations also performed not blank,not null,length 
 */


//This annotation is used to convert the class into the tables.
     @Entity
     @Table(name="hotel_table")
	public class Hotel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(name="seq",initialValue=1000)
	private Long hotelid;
	@NotBlank(message="please add hotel name")
	private String hotelName;
	private String hotelCode;
	private String hotelAddress;
	private String hotelPhno;
	@OneToMany(targetEntity=Customer.class,cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private List<Customer> customer;
	public Hotel() {
		super();
	}
	public Hotel(Long hotelid, @NotBlank(message = "please add hotel name") String hotelName, String hotelCode,
			String hotelAddress, String hotelPhno, List<Customer> customer) {
		super();
		this.hotelid = hotelid;
		this.hotelName = hotelName;
		this.hotelCode = hotelCode;
		this.hotelAddress = hotelAddress;
		this.hotelPhno = hotelPhno;
		this.customer = customer;
	}
	public Long getHotelid() {
		return hotelid;
	}
	public void setHotelid(Long hotelid) {
		this.hotelid = hotelid;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelCode() {
		return hotelCode;
	}
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	public String getHotelPhno() {
		return hotelPhno;
	}
	public void setHotelPhno(String hotelPhno) {
		this.hotelPhno = hotelPhno;
	}
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Hotel [hotelid=" + hotelid + ", hotelName=" + hotelName + ", hotelCode=" + hotelCode + ", hotelAddress="
				+ hotelAddress + ", hotelPhno=" + hotelPhno + ", customer=" + customer + "]";
	}
    }
