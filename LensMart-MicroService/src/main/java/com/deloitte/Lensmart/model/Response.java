package com.deloitte.Lensmart.model;

import java.util.List;

import com.deloitte.Lensmart.entity.Lensmart;

public class Response {
	
	private Lensmart lensmart;
	private List<Customer> customerList;
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response(Lensmart lensmart, List<Customer> customerList) {
		super();
		this.lensmart = lensmart;
		this.customerList = customerList;
	}
	public Lensmart getLensmart() {
		return lensmart;
	}
	public void setLensmart(Lensmart lensmart) {
		this.lensmart = lensmart;
	}
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

		
	

}
