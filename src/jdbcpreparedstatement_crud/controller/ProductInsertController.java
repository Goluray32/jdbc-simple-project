package jdbcpreparedstatement_crud.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 
 * @author Mr golu ray ghvakj, nb zm
 *
 *         sajvkjsdbnvk.
 */
public class ProductInsertController {

	/*
	 * ghfasjbligdjnmjbckvufdh;ogjakjhf
	 */
	public static void main(String[] args) {

		Connection connection=null;
		try {

			/*
			 * shjdsgkfhrgl
			 */
			// step-1 load/register driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/jdbc_preparedstatement";
			String user = "root";
			String pass = "root";

		    connection = DriverManager.getConnection(url, user, pass);

			String insertQuery = "insert into product values(?,?,?,?)";
			// step-3 create statement
			PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
			
			preparedStatement.setInt(1, 100);
			preparedStatement.setString(2, "pen");
			preparedStatement.setDouble(3, 20);
			preparedStatement.setString(4, "Black");
			
			preparedStatement.setInt(1, 101);
			preparedStatement.setString(2, "laptop");
			preparedStatement.setDouble(3, 2000);
			preparedStatement.setString(4, "white");
			
			preparedStatement.setInt(1, 102);
			preparedStatement.setString(2, "Bag");
			preparedStatement.setDouble(3, 200);
			preparedStatement.setString(4, "white");
			
			preparedStatement.setInt(1, 1001);
			preparedStatement.setString(2, "mobile");
			preparedStatement.setDouble(3, 20000);
			 preparedStatement.setString(4, "blue");
			
		 	preparedStatement.setInt(1, 104);
			preparedStatement.setString(2, "Tv");
			preparedStatement.setDouble(3, 15000);
			preparedStatement.setString(4, "Darkblue");
			
			preparedStatement.setInt(1, 107);
			preparedStatement.setString(2, "book");
			preparedStatement.setDouble(3, 60);
			preparedStatement.setString(4, "skyblue");
			
			preparedStatement.execute();
			
			System.out.println("Data---stored");	

		} catch (ClassNotFoundException | SQLException e) {
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