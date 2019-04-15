package dao.ydd.demo;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionDao {
	private static Connection conn;
	public static Connection getConnection() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		
		try {
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		} catch (SQLException e) {
			// TODO Au5to-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	};
	
	
}
