package com.deloitte.Customer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.Customer.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

	List<Customer> findByLensId(Integer lensId);
}
