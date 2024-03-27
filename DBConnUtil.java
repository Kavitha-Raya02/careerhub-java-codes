package com.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnUtil {
public static Connection getConnection() {
		
		// Load jdbc the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// Get a connection object
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/career_hub", "root", "Kavitha#2108");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
