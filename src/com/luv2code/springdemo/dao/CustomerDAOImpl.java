package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	
	//need to inject the session factory
	@Autowired
	
	
	
	
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
