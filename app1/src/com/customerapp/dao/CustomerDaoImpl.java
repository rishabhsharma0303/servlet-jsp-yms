package com.customerapp.dao;
import java.sql.*;
import java.util.List;
import java.util.Optional;

import com.customerapp.dao.factory.DbConnectionFactory;
import com.customerapp.exceptions.DataAccessException;

public class CustomerDaoImpl implements CustomerDao {

	private Connection connection;
	
	
	
	public CustomerDaoImpl() {
		connection=DbConnectionFactory.getConnection();
	}

	@Override
	public List<Customer> getAllCustomers() {
		return null;
	}

	@Override
	public void deleteCustomer(int id) {
	}

	@Override
	public void updateCustomer(int id, Customer customer) {

	}

	@Override
	public Optional<Customer> getCustomerById(int id) {
		return null;
	}

	@Override
	public void addCustomer(Customer customer) {

		try {
			PreparedStatement pstmt = connection
					.prepareStatement("insert into customer(name, address, mobile ,email) values(?,?,?,?)");
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getAddress());
			pstmt.setString(3, customer.getMobile());
			pstmt.setString(4, customer.getEmail());
			pstmt.executeUpdate();
			
		}catch(SQLException ex) {
			ex.printStackTrace();
			throw new DataAccessException("some jdbc problem");
		}


	}

}
