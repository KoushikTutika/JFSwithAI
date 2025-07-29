package com.batch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.util.JdbcUtil;

public class BatchProcessingUsingLoops {
	
	
	public static void main(String[] args) throws SQLException {

		JdbcUtil jdbcUtil = new JdbcUtil();

		Connection connection = jdbcUtil.getConnection();

		PreparedStatement statement = connection.prepareStatement("Insert into employees values (?,?,?)");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter how many employes you need to add :");
		int count = sc.nextInt();
		
		for (int i = 1; i <= count; i++) {
			System.out.println("Please enter the employee Id:");
			int id = sc.nextInt();
			
			System.out.println("Please enter the employee Email:");
			String email = sc.next();
			
			System.out.println("Please enter the employee Salary:");
			double salary = sc.nextDouble();
			
			statement.setInt(1, id);
			statement.setString(2, email);
			statement.setDouble(3, salary);
			
			statement.addBatch();
		}

		statement.executeBatch();

		System.out.println("added batch...!");

	}

}

