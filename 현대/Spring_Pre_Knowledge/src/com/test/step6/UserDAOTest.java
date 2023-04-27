package com.test.step6;

import com.test.step6.dao.ConnectionMaker;
import com.test.step6.dao.NConnectionMaker;
import com.test.step6.dao.UserDAO;
import com.test.step6.vo.User;

public class UserDAOTest {
	public static void main(String[] args) throws Exception{
		
		User user = new User("hong", "1234", "홍길동");
		
		ConnectionMaker connectionMaker = new NConnectionMaker();
		
		// Dependency Injection 생성자를 통한 주입
		// class 간의 연관관계를 없앨 수 있고 runtime object 관계를 설정
		UserDAO dao = new UserDAO(connectionMaker);
		
		dao.insert(user);
		
		System.out.println("새로운 사용자가 등록되었어요");
		
		User result = dao.select("hong");
		
		System.out.println(result);
	}
}
                                                                                   