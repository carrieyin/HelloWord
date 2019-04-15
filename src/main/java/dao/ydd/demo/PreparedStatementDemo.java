package dao.ydd.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection conn = ConnectionDao.getConnection();
		
		addUserInfo(conn, "yy", "shandong");
	}

	private static void addUserInfo(Connection conn, String name,
			String addr) {
		try {
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO userinfo(name, addr) VALUES(?,?)");
			stmt.setString(1, name);
			stmt.setString(2, addr);
			stmt.executeUpdate();
			stmt.clearParameters();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



}
