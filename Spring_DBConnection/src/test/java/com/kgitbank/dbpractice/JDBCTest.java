package com.kgitbank.dbpractice;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {

	@Before
	public void testConfig() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("@Before�� �����");
	}

	@Test
	public void testGetConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String user = "java1";
		String password = "1234";

		try (Connection conn = DriverManager.getConnection(url, user, password);) {
			log.info(conn);
			assertNotNull(conn);
		} catch (SQLException e) {
			fail(e.getMessage());
		}

	}

}