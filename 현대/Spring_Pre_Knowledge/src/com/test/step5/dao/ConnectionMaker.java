package com.test.step5.dao;

import java.sql.Connection;

public interface ConnectionMaker {

	// UserDAO가 이interface를 통해서 실제 Connection을 생성하는 class와 연결 되는것
	// 즉, 해당 interface의 method를 통해서 두 클래스가 서로 연동될 수 있다.
	
	// UserDAO는 이 interface의 구현체의 method를 통해서 데이터베이스 connection 획득
	Connection makeConnection() throws Exception;
	
}
