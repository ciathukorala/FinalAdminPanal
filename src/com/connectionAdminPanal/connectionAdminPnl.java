package com.connectionAdminPanal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionAdminPnl {
	public Connection Get_Connection() throws Exception
	{
		try
		{
		String connectionURL = "jdbc:mysql://localhost/parking";
		Connection connection = null;
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection(connectionURL, "root", "");
	    return connection;
		}
		catch (SQLException e)
		{
		throw e;	
		}
		catch (Exception e)
		{
		throw e;	
		}
	}
}
