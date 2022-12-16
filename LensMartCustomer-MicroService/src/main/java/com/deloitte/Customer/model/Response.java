package com.deloitte.Customer.model;

import java.util.List;

import com.deloitte.Customer.entity.Customer;

public class Response {
	
	private Customer customer;
	private List<Order> orders;
	
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Response(Customer customer, List<Order> orders) {
		super();
		this.customer = customer;
		this.orders = orders;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	

}
