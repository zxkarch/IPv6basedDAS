package com.iton.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseUtil {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	public DataBaseUtil() {
		connect();
	}

	private void connect() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:"
				+ Constants.DATABASE_PORT + "/" + Constants.DATABASE_NAME;
		String user = Constants.DATABASE_USER;
		String password = Constants.DATABASE_PWD;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
		} catch (Exception e) {
			try{
				Class.forName(driver);
				url = "jdbc:mysql://localhost:"
						+ Constants.DATABASE_PORT + "/" + Constants.DATABASE_NAME;
				conn = DriverManager.getConnection(url, user, password);
				stmt = conn.createStatement();
			} catch(Exception e1){
				e1.printStackTrace();
			}
		}
	}

	public ResultSet query(String command) {
		try {
			rs = stmt.executeQuery(command);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public int update(String command) {
		int code = 0;
		try {
			code = stmt.executeUpdate(command);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return code;
	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
