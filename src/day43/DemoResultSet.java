package day43;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoResultSet 
{
	public static void main(String[] args) 
	{
		String jdbcUrl = "jdbc:mysql://localhost:3306/anudip";
		String username="root";
		String password="admin@123";
		
		try(Connection connection=DriverManager.getConnection(jdbcUrl, username, password);
				Statement statement =connection.createStatement())
		{
			String selectDataSQL = "SELECT StudentID, FristName, LastName From student";
			ResultSet resultSet= statement.executeQuery(selectDataSQL);
			
			while(resultSet.next()) 
			{
				String id=resultSet.getString("StudentID");
				String fname=resultSet.getString("FristName");
				String lname=resultSet.getString("LastName");
				System.out.println("ID: "+id+" , Name: "+fname+" "+lname);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
