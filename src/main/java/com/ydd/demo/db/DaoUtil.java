package com.ydd.demo.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoUtil {
public static void close(Connection conn, Statement stmt){
	try {
		if(stmt != null){
			stmt.close();
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	try {
		if(conn != null){
			conn.close();
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
