package com.test.step6.dao;

import java.sql.Connection;
import java.sql.DriverManager;

// UserDAO를 재활용하고싶은 사람이 interface를 기반으로 구현체를만든 class
public class NConnectionMaker implements ConnectionMaker{

	@Override
	public Connection makeConnection() throws Exception {
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
