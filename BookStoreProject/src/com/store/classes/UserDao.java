package com.store.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.store.db.DbConnection;
import com.store.interfaces.UserDaoI;

public class UserDao implements UserDaoI{

	private Connection connection;
	
	public UserDao()
	{
		connection=DbConnection.getConnection();
	}
	@Override
	public User validateUser(String email, String password) {
		String template = "select * from user where email=? and password=?";
		User user=new User();
		try{
			PreparedStatement pstmt=connection.prepareStatement(template);
			pstmt.setString(1, email);pstmt.setString(2, password);
			ResultSet rs= pstmt.executeQuery();
			if(rs.next())
			{
				user.setEmail(rs.getString("email"));// rs.getString(1)
				user.setPassword(rs.getString("password"));
				user.setRole(rs.getString("role")); return user;
			}
			else
			{
				return null;
			}
			
		}catch(SQLException e){ System.out.println(e);}
		return null;
	}

}
