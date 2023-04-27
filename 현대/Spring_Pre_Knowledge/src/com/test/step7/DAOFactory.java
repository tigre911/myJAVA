package com.test.step7;

import com.test.step7.dao.ConnectionMaker;
import com.test.step7.dao.NConnectionMaker;
import com.test.step7.dao.UserDAO;

public class DAOFactory {
//	ConnectionMaker connectionMaker = new NConnectionMaker();
//	
//	// Dependency Injection 생성자를 통한 주입
//	// class 간의 연관관계를 없앨 수 있고 runtime object 관계를 설정
//	UserDAO dao = new UserDAO(connectionMaker);
	
	
	public UserDAO userDAO() {
		UserDAO dao = new UserDAO(connectionMaker());
		return dao;
	}

	public ConnectionMaker connectionMaker() {
		return new NConnectionMaker();
	}
}
