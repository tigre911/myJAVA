package com.test.step3;

import com.test.step3.dao.NUserDAO;
import com.test.step3.dao.UserDAO;
import com.test.step3.vo.User;

public class UserDAOTest {
	public static void main(String[] args) throws Exception{
		User user = new User("hong", "1234", "홍길동");
		UserDAO dao = new NUserDAO();
		
		dao.insert(user);
		
		System.out.println("새로운 사용자가 등록되었어요");
		
		User result = dao.select("hong");
		
		System.out.println(result);
	}
}
