package com.test.step4.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SimpleConnectionMaker {
	protected Connection getConnection() throws Exception {
		// Pure JDBC를 이용해서 처리할 꺼에요
		// 1. 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 2. 데이터베이스 접속
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String id = "ace";
		String pw = "me";
		Connection conn = DriverManager.getConnection(jdbcUrl, id, pw);
		
		return conn;
	}
}
