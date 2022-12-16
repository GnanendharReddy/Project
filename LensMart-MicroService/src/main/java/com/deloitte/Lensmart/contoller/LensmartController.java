package com.deloitte.Lensmart.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.Lensmart.model.Response;
import com.deloitte.Lensmart.entity.Lensmart;
import com.deloitte.Lensmart.model.Customer;
import com.deloitte.Lensmart.service.LensmartService;

@RestController
@RequestMapping("/lensmart")
public class LensmartController {

	@Autowired
	LensmartService lensmartService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Lensmart> getByLensId(@PathVariable("id") Integer id)
	{
		Lensmart lensmart=lensmartService.getByLensId(id);
		List<Customer> customerList=restTemplate.getForObject("http://localhost:8081/customers/get/"+id, List.class);
		Response response = new Response(lensmart,customerList);
		
		return new ResponseEntity<Lensmart>(lensmart,HttpStatus.OK);
	}

	
	@GetMapping("/getAll")								
	public ResponseEntity<List<Lensmart>> getLens()
	{
		List<Lensmart> lensList=lensmartService.getLens();
		return new ResponseEntity<List<Lensmart>>(lensList,HttpStatus.OK);
	}
	
	@PostMapping("/addLens")
	public ResponseEntity<Lensmart> addLens(@RequestBody Lensmart lensmart)
	{
		Lensmart lensmart1 = lensmartService.addLens(lensmart);
		return new ResponseEntity<Lensmart>(lensmart1,HttpStatus.OK);
	}
	
	
}
