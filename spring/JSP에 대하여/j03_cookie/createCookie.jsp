<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성하기</title>
<script>
	// 쿠키 생성하기
	document.cookie = "food=pizza;path=/;expries=2023";
	document.cookie = "notice=yes";
</script>
</head>
<body>
<h1>jsp에서 쿠키 만들기</h1>
<%
	// jsp에서 사용자 컴퓨터에 쿠키 저장하기
	// 1. Cookie 객체를 생성하고
	Cookie cookie = new Cookie("username", "홍길동");
	cookie.setMaxAge(300); // 쿠키의 생명주기 설정 (초단위)
	// 2. response 내장객체를 이용하여 client에게 쿠키 정보를 보낸다.
	response.addCookie(cookie);
%>
<a href="cookieView.jsp">쿠키 확인하기</a>
</body>
</html>