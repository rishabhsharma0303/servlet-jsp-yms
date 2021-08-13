package com.customerapp.service;

import java.util.List;
import java.util.Optional;

import com.customerapp.dao.Customer;
import com.customerapp.dao.CustomerDao;
import com.customerapp.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao customerDao;
	
	public CustomerServiceImpl() {
		customerDao=new CustomerDaoImpl();
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
	}

	@Override
	public void deleteCustomer(int id) {
		customerDao.deleteCustomer(id);
	}

	@Override
	public void updateCustomer(int id, Customer customer) {
		customerDao.updateCustomer(id, customer);
	}

	@Override
	public Optional<Customer> getCustomerById(int id) {
		return customerDao.getCustomerById(id);
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

}
