package com.test.step3.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.test.step3.vo.User;

public abstract class UserDAO {
	
	// access modifier 는 protected로 설정해야하고
	// 내용을 확장할 method는 abstract method로 지정해야 한다.
	// 당연히 우리 class는 abstract class(추상 클래스)가 되어야 한다.
	protected abstract Connection getConnection() throws Exception ;
	
	
//	private Connection getConnection() throws Exception {
//		
//		// Pure JDBC를 이용해서 처리할 꺼에요
//		// 1. 드라이버 로딩
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		
//		// 2. 데이터베이스 접속
//		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521/xepdb1";
//		String id = "ace";
//		String pw = "me";
//		Connection conn = DriverManager.getConnection(jdbcUrl, id, pw);
//		
//		return conn;
//	}
	
	
	public void insert(User user) throws Exception {
		// VO를 전달받아서 Table에 insert 처리
		
		Connection conn = getConnection();
		
		// 3. PreparedStatement
		String sql = "INSERT INTO users VALUES(?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, user.getId());
		pstmt.setString(2, user.getPassword());
		pstmt.setString(3, user.getName());
		
		// 4. 실행
		// 만약 수행되는 SQL구문이 insert, update, delete인 경우에는 
		// 리턴되는 정수는 테이블안에서 영향을 받은 rows의 수.
		int result = pstmt.executeUpdate();
		
		// 5. 결과처리
		
		// 6. resource 해제
		pstmt.close();
		conn.close();
		
	}
	
	// id를 이용해서 사용자 정보를 리턴하는 method
	public User select(String userId) throws Exception {
		Connection conn = getConnection();
		
		// 3. PreparedStatement
		String sql = "SELECT * from users WHERE id = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		
		// 4. 실행
		// 만약 수행되는 SQL구문이 select 인 경우에는 
		// 리턴이 결과 레코드 집합에 대한 pointer인 resultset으로 나온다.
		ResultSet rs = pstmt.executeQuery();
		
		
		// 5. 결과처리
		User user = new User();
		if (rs.next()) {
			user.setId(rs.getString("id"));
			user.setPassword(rs.getString("password"));
			user.setName(rs.getString("name"));
		}
		
		
		
		// 6. resource 해제
		rs.close();
		pstmt.close();
		conn.close();
		
		return user;
	}
	
}
