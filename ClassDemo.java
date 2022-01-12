package com.cognizant;


	import java.sql.Connection;
	import java.sql.Driver;
	import java.sql.DriverManager;
	import java.sql.SQLException;



	public class ClassDemo {

	public static void main(String[]args) throws SQLException {


	Driver driver = new com.mysql.cj.jdbc.Driver();

	DriverManager.registerDriver(driver);

	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dd","root","12345");

	System.out.println("SERVER BACK ONLINE");
	}



	}
	
