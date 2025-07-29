package com.dql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.JdbcUtil;

public class DQLOperators {
	public static void main(String[] args) {// throws SQLException {

		try {
			JdbcUtil jdbcUtil = new JdbcUtil();

			Connection connection = jdbcUtil.getConnection();
			Statement statement = connection.createStatement();

			String query = "Select * from employees";

			ResultSet rs = statement.executeQuery(query);
			System.out.println("Employess Id\tEmail\tSalary");
			

			while (rs.next()) {
				int empId = rs.getInt(1);
				String email = rs.getString(2);
				double salary = rs.getDouble("salary");
				
				System.out.println(empId+"\t"+email+"\t"+salary);
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
