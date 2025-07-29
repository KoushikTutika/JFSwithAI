package com.ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.util.JdbcUtil;

public class Login {
	
	public static void main(String[] args) throws SQLException {
		
		preparedStatement();
		//createStatement();
		
		
			
	}

	private static void createStatement() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  user name ..!");
		String username = sc.nextLine();
		
		System.out.println("Please Enter the Password...!");
		String password = sc.nextLine();
		
		JdbcUtil jdbcUtil = new JdbcUtil();
		Connection connection = jdbcUtil.getConnection();
	    Statement statement = connection.createStatement();
	    
		
		
		String query = "Select * from users where username ='"+username+"' and password = '"+password+"'";
		
		ResultSet resultSet = statement.executeQuery(query);
		
		if (resultSet.next()) {
			System.out.println("User LoggedIn..!");
					
		}else {
			System.out.println("Invalid Credentials...!");
		}
	}
	
	public static void preparedStatement() throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  user name ..!");
		String username = sc.nextLine();
		
		System.out.println("Please Enter the Password...!");
		String password = sc.nextLine();
		
		JdbcUtil jdbcUtil = new JdbcUtil();
		Connection connection = jdbcUtil.getConnection();
	    String query ="select * from users where username = ? and password = ?";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, username);
		statement.setString(2, password);
		
		ResultSet resultSet = statement.executeQuery();
	
		if (resultSet.next()) {
			System.out.println("User LoggedIn..!");
					
		}else {
			System.out.println("Invalid Credentials...!");
		}
	}

}
