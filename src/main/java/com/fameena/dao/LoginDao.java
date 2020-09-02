package com.fameena.dao;
import java.sql.*;

public class LoginDao 
{
	String sql="select * from members where uname=? and password=?";
	String sqluname="root";
	String sqlpwd="root";
 String url="jdbc:mysql://localhost:3306/house";

	public  boolean check(String username,String password) 
	
	{
		System.out.println("i am inside loginDao");
	
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,sqluname,sqlpwd);

			System.out.println("i am inside loginDao1");
		
			PreparedStatement st=conn.prepareStatement(sql);

			System.out.println("i am inside Preparedstatement");
		
			st.setString(1, username);
			st.setString(2, password);
			ResultSet rs=st.executeQuery();
			System.out.println("i am inside rsnext");
			if(rs.next()) {

				System.out.println("i am inside rsnext");
			
				return true;
				
			
			
			}else {
				
				return false;
			}
			
			
		}
			
		catch(Exception e) {
			
			e.printStackTrace();
		}
		return false;
	
		
		
}

}