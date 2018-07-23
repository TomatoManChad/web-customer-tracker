package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// need to inject the session factory
	@Autowired
	public SessionFactory sessionFactory;

	@Override
	//@Transactional -moved to service
	public List<Customer> getCustomers() {
	//1.get current hibernate session
	//2. create quiery.
	//3. exe query and get result list
	//4. return results
		
	Session currentSession = sessionFactory.getCurrentSession();
	
	Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);

	List<Customer> customers = theQuery.getResultList();	
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		//get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer
		currentSession.save(theCustomer);
		
		
	}

}
