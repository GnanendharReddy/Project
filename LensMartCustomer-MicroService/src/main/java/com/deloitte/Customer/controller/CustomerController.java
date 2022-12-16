package com.deloitte.Customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.deloitte.Customer.entity.Customer;
import com.deloitte.Customer.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("/get/{id}")
	public ResponseEntity<List<Customer>> getCustomer(@PathVariable("id") Integer id)
	{
		List<Customer> customer=customerService.getCustomer(id);
//		List<Order> ordersList=restTemplate.getForObject("http://localhost:8081/orders/getOrder/"+id, List.class);
//		Response response = new Response(customer,ordersList);
//		
		return new ResponseEntity<List<Customer>>(customer,HttpStatus.OK); 
	}
	
//	public ResponseEntity<?> orderFailureFallBack(@PathVariable("id") Integer id)
//	{
//		Customer customer=customerService.getCustomer(id);
//		FailureResponse response = new FailureResponse(customer,"Currently Service is Down.");
//		return new ResponseEntity<FailureResponse>(response,HttpStatus.OK);
//	}
//	
	@GetMapping("/getAll")								
	public ResponseEntity<List<Customer>> getCustomers()
	{
		List<Customer> customerList=customerService.getCustomers();
		return new ResponseEntity<List<Customer>>((List<Customer>) customerList,HttpStatus.OK);
	}

}
