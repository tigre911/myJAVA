<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	// 서버에서 클라이언트가 보낸 데이터를 가져오기
	String name = request.getParameter("name");
	//네이트워크로 전송되는 데이터는 기본이 문자열
	int num = Integer.parseInt(request.getParameter("num"));
	String addr = request.getParameter("addr");
	
	System.out.println("name" + name);
	System.out.println("num" + num);
	System.out.println("addr" + addr);
	
	%>