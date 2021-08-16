package com.customerapp.dao.factory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
//Better to go for connection pool (will do tomcat)
public class DbConnectionFactory {
	private static Connection  connection=null;
	
	private DbConnectionFactory() {}
	
	public static Connection getConnection() {
		
		InputStream is=DbConnectionFactory.class.getClassLoader()
				.getResourceAsStream("db.properties");
			
		Properties properties=new Properties();
		try {
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String url=properties.getProperty("jdbc.url");
		String driverName=properties.getProperty("jdbc.driverName");
		String username=properties.getProperty("jdbc.username");
		String password=properties.getProperty("jdbc.password");
		
		//load the driver
		try {
			Class.forName(driverName);
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		try {
			connection=DriverManager.getConnection(url, username, password);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		//conn object
		return connection;
		
	}
}
