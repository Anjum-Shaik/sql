package com.cognizant;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {
		

	public static void main(String[]args) throws SQLException {



	Driver driver = new com.mysql.cj.jdbc.Driver();



	DriverManager.registerDriver(driver);



	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dd","root","12345");



	try {
	String qry = "create table associates (id int primary key, name varchar(30),email varchar(20),mobile int )";



	Statement statement = connection.createStatement();
	// execute



	statement.execute(qry);




	}catch (Exception e) {
	System.out.println("error : " +e);



	}



	}	



	}

