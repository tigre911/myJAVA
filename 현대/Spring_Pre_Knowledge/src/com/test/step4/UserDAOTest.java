package com.test.step4;

import com.test.step4.dao.UserDAO;
import com.test.step4.vo.User;

public class UserDAOTest {
	public static void main(String[] args) throws Exception{
		User user = new User("hong", "1234", "홍길동");
		UserDAO dao = new UserDAO();
		
		dao.insert(user);
		
		System.out.println("새로운 사용자가 등록되었어요");
		
		User result = dao.select("hong");
		
		System.out.println(result);
	}
}
