package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;
/**
 * This customer class is converted as table and the variables are converted into columns
 * Here some annotations are used like entity,id,table,column,generated value...
 * Some of validations also performed not blank,not null,length 
 */


//This annotation is used to convert the class into the tables.
@Entity
@Table(name="customer_table")
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long cid;
	
	@NotBlank(message="Customer name cannot be blank")
	private String cname;
	@Range(message="Customer room cannot be less than 4 digits")
	private int croomno;
	@Column(length=10)
	@NotBlank(message="Phno cannot be null")
	private String cphno;
	private String caddress;
	public Customer() {
		super();
	}
	public Customer(Long cid, @NotBlank(message = "Customer name cannot be blank") String cname,
			@Range(message = "Customer room cannot be less than 4 digits") int croomno,
			@NotBlank(message = "Phno cannot be null") String cphno, String caddress) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.croomno = croomno;
		this.cphno = cphno;
		this.caddress = caddress;
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCroomno() {
		return croomno;
	}
	public void setCroomno(int croomno) {
		this.croomno = croomno;
	}
	public String getCphno() {
		return cphno;
	}
	public void setCphno(String cphno) {
		this.cphno = cphno;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", croomno=" + croomno + ", cphno=" + cphno + ", caddress="
				+ caddress + "]";
	}
}