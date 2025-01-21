package day42;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection 
{
	public static void main(String[] args) 
	{
		String jdbcUrl = "jdbc:mysql://localhost:3306/anudip";
		String username="root";
		String password="admin@123";
		
		try
		{
		 //  A connection object represents a connection to a relational database. 
		 //  It allows you to interact with the database, execute SQL QUERIES, Update data, and perform other database operations.
			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
			System.out.println("Connection successful");
			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
