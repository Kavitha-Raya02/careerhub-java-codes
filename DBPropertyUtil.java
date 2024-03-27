package com.util;

import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

public class DBPropertyUtil {
    private static final String path = "db.properties";
    public static String getPropertyString() 
    {
    	 String connectionString = null;
        Properties properties = new Properties();
        try (InputStream inputStream = DBPropertyUtil.class.getResourceAsStream(path)) {
           
                properties.load(inputStream);
                connectionString = "jdbc:mysql://" +
                        properties.getProperty("hostname") +
                        ":" + properties.getProperty("port") +
                        "/" + properties.getProperty("dbname") +
                        "?user=" + properties.getProperty("username") +
                        "&password=" + properties.getProperty("password");
                return connectionString;
            } 
         catch (IOException e) {
            e.printStackTrace();
        
        }
		return connectionString;
		
    }
    
   
}