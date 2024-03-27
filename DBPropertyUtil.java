package com.util;

public class DBPropertyUtil {
	
	public static String getConnectionString(String fileName) {
		
		String conString = "jdbc:mysql://127.0.0.1:3306/"+fileName+"\", \"root\", \"phoenix\"";
		return conString;
	}

}
