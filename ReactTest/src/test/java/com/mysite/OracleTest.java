package com.mysite;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

public class OracleTest {
	@Test
	public void ConnectionTest() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = 
		DriverManager.getConnection(url, "user1", "1111");
	
		System.out.println(conn);
		conn.close();
	}
}
