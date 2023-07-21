package com.jsp.jdbc_prepared_statement.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductUpdateController {

	 public static void main(String[] agrgs) {
		Connection connection=null;
		
		try {
			
			// Step-1 load/register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// step-2 create connection
			
			String url = "jdbc:mysql://localhost:3306/jdbc_preparedstatement";
			String user = "root";
			String pass = "root";
						
			connection=DriverManager.getConnection(url, user, pass );
			    
			//Step-3 create Statement
			String updateColorQuery ="update product set product-color = ? where productid=?"; 
			
			PreparedStatement preparedStatement=connection.prepareStatement(updateColorQuery);
			
			preparedStatement.setString(2, "white");
			preparedStatement.setInt(1, 200);
			
			int a=preparedStatement.executeUpdate();
			
			if (a==1){
				System.out.println("Data is update");
			}else {
				System.out.println("given id is not present");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	 }
	
}
