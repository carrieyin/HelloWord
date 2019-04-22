package com.ydd.demo.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection conn = ConnectionDao.getConnection();
		
		addUserInfo(conn, "yy", "shandong");
		DaoUtil.close(conn, null);
	}

	private static void addUserInfo(Connection conn, String name,
			String addr) {
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement("INSERT INTO userinfo(name, addr) VALUES(?,?)");
			stmt.setString(1, name);
			stmt.setString(2, addr);
			stmt.executeUpdate();
			stmt.clearParameters();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DaoUtil.close(null, stmt);
		}
	}



}
