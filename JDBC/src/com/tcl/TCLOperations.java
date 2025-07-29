package com.tcl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.util.JdbcUtil;

public class TCLOperations {
	public static void main(String[] args) throws SQLException {// throws SQLException {
		Connection connection =null;
		try {
		JdbcUtil jdbcUtil = new JdbcUtil();
		connection = jdbcUtil.getConnection();
		connection.setAutoCommit(false);//whatever changes doing in table it will not update 
		PreparedStatement statement = connection.prepareStatement("update Employees set salary =? where empId =?");
		statement.setDouble(1, 1000000);
		statement.setInt(2,  1);
		statement.executeUpdate();
		System.out.println("Updated ...!");
		connection.commit();//it will update the changes in DB table
		}catch(Exception e) {
			connection.rollback();//it will roll back the changes
			System.out.println("transaction failed please try Again");
		}
	}
	
	
	

}
