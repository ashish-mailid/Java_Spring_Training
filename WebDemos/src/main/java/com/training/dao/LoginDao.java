package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.classes.Admin;
import com.training.classes.Book;
import com.training.classes.Customer;
import com.training.classes.User;
import com.training.dbconnection.DbConnection;

public class LoginDao {

	private static Connection connection;

	public LoginDao()
	{
		connection = DbConnection.getConnection();
		if(connection != null)
			System.out.println("Connection Successful");
		else
			System.out.println("Not connected");

	}
	public User validate(String username, String password) {
		User user;
		PreparedStatement pstmt;
		String template = "select * from users where username=? and password = ?";

		try {
			pstmt = connection.prepareStatement(template);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			if(!rs.next())
				return null;
			else
			{
				String role= rs.getString(3);

				if(role.equalsIgnoreCase("ROLE_CUSTOMER")) 
				{
					pstmt = connection.prepareStatement("select * from customer where username=?");
					pstmt.setString(1, username);
					ResultSet rs1 =pstmt.executeQuery();
					if(!rs1.next())
						return null;
					else
					{
						user = new Customer(rs1.getString("name"), rs1.getString("email"), 
								rs1.getString("phoneNo"),rs1.getString("username"));
						return user;
					}
				}
				else
				{
					return new Admin();
				}

			}


		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}


		return null;
	}

}
