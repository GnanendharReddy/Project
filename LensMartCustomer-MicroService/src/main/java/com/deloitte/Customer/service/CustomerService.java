package com.deloitte.Customer.service;

import java.util.List;
import com.deloitte.Customer.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomer(Integer id);
	public List<Customer> getCustomers();
	

}
