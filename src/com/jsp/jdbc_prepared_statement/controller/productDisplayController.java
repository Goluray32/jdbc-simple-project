package com.jsp.jdbc_prepared_statement.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;
           public class productDisplayController {
            static Connection connection=null;
			public static void main(String[] args) {
				
				try {
					// step-1 Load/register driver
					// Register Driver
					Driver driver = new Driver();
					DriverManager.registerDriver(driver);

					// step-2 create connection
					String url = "jdbc:mysql://localhost:3306/jdbc_preparedstatement";
					String user = "root";
					String pass = "root";

					connection = DriverManager.getConnection(url, user, pass);

					// step-3 create statement
					Statement statement = connection.createStatement();

					// step-4 executeQuery

					String displayQuery = "SELECT * FROM product";

					ResultSet resultSet = statement.executeQuery(displayQuery);

						while(resultSet.next()) {
					
						
						int productid = resultSet.getInt("productid");
						
						String productname = resultSet.getString("productname");
						
					    double productprice = resultSet.getDouble("productprice");
						
						String productcolor = resultSet.getString("productcolor");
						
						System.out.println("productid = "+productid);
						System.out.println("productname = "+productname);
						System.out.println("productprice = "+productprice);
						System.out.println("productcolor = "+productcolor);
						System.out.println("________________________________________");
						
						}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		

	}