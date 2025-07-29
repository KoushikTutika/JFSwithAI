package com.batch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.util.JdbcUtil;

public class BatchProcessing {
	public static void main(String[] args) throws SQLException {

		JdbcUtil jdbcUtil = new JdbcUtil();

		Connection connection = jdbcUtil.getConnection();

		PreparedStatement statement = connection.prepareStatement("Insert into employees values (?,?,?)");

		statement.setInt(1, 11);
		statement.setString(2, "uma11@flm.com");
		statement.setDouble(3, 200000.00);
		
//		 bulk processing
		statement.addBatch();

		statement.setInt(1, 12);
		statement.setString(2, "uma12@flm.com");
		statement.setDouble(3, 200000.00);
		
		statement.addBatch();

		statement.executeBatch();

		System.out.println("added batch...!");


		}

		
	}


