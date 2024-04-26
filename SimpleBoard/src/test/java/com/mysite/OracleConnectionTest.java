package com.mysite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class OracleConnectionTest {
	@Test
	public void OracleConnectionTest() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = 
		DriverManager.getConnection(url, "user1", "1111");
		conn.close();
		}
}
