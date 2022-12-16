package com.deloitte.Customer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private Integer cid;
	private Integer lensId;
	private String cname;
	private String city;
	private String lensType;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Customer(Integer cid, Integer lensId, String cname, String city, String lensType) {
		super();
		this.cid = cid;
		this.lensId = lensId;
		this.cname = cname;
		this.city = city;
		this.lensType = lensType;
	}



	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLensType() {
		return lensType;
	}

	public void setLensType(String lensType) {
		this.lensType = lensType;
	}

	public Integer getLensId() {
		return lensId;
	}

	public void setLensId(Integer lensId) {
		this.lensId = lensId;
	}
		
	
	
}
