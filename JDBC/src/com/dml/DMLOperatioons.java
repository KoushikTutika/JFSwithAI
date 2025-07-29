package com.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DMLOperatioons {
	public static void main(String[] args) { //throws ClassNotFoundException, SQLException {
		
		try {
		// Register the Driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		above line driver class is removed in latest versions of JAVA

		System.out.println("Driver Registered");
		// Establish Connection
		String url = "jdbc:mysql://localhost:3306/flm_jfs_db";
		String userName = "root";
		String password = "Koushik@11";

		Connection connection = DriverManager.getConnection(url, userName, password);
		// create statement
		Statement statement = connection.createStatement();
		// prepare query
		String query = "insert into employees values(7,'amma@flm.com',400000)";
		
		// Execute Query
		statement.executeUpdate(query);
		
		System.out.println("Inserted Data...!");
		
		//Update query
		String query2 ="Update employees set salary = 20000 where empId =7";
		//statement.executeUpdate(query2);
		
		System.out.println("Updated Data...!");
		
		//Delete query
		String query3 ="Delete from employees where empId =7";
		//statement.executeUpdate(query3);
		
		System.out.println("Deleted Data...!");
		

	
	}
		catch(Exception e){
			System.out.println("Error:"+ e.getMessage());
			
		}

	}
}
