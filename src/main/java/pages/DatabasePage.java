package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	
	  Connection connection;
	  Statement statement;
	  ResultSet resultSet;
	  String columnValue;
	
	public String getData(String columnName) {
		
	
//	set the properties of mySQL, call mySQL driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sqlUrl= "jdbc:mysql://localhost:3306/december2021";
		String sqlUserName = "root";
		String sqlPassword = "root";
		String sqlQuery = "select * from bankAndCashForm;";
		
//		create a connection to local database by calling connection interface
	    connection = DriverManager.getConnection(sqlUrl, sqlUserName, sqlPassword);
		
//		Empower the connection reference variable to execute queries by calling statement interface
		statement = connection.createStatement();
		
//		Deliver the query by calling interface resultset
		resultSet = statement.executeQuery(sqlQuery);
		
		while(resultSet.next()) {
		columnValue = resultSet.getString(columnName);
		}
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		if(resultSet!=null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	return columnValue;
	
	}
	

}
