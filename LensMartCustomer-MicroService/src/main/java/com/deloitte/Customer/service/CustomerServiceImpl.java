package com.deloitte.Customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.deloitte.Customer.dao.CustomerRepository;
import com.deloitte.Customer.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getCustomer(@PathVariable("id") Integer id) {
		
		return (List<Customer>) customerRepository.findByLensId(id);
	}

	
	@Override
	public List<Customer> getCustomers() {
		
		return customerRepository.findAll();
	}

}
