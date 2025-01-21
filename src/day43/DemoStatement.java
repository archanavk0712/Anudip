package day43;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoStatement 
{
	public static void main(String[] args) 
	{
		String jdbcUrl = "jdbc:mysql://localhost:3306/anudip";
		String username="root";
		String password="admin@123";
		
		try
		{
			Connection connection=DriverManager.getConnection(jdbcUrl, username, password);
			Statement statement =connection.createStatement();
			String createTableSQL="CREATE TABLE users(id INT PRIMARY KEY, name VARCHAR(250))";
			statement.execute(createTableSQL);
			System.out.println("Table created successfully");
			
			String insertData="INSERT INTO users(id,name) VALUES (101,'Archana')";
			int rowsaffect =statement.executeUpdate(insertData);
			System.out.println(rowsaffect +" rows affected");
			
			String selectData="SELECT * FROM users";
			statement.executeQuery(selectData);
			
			statement.close();
			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
