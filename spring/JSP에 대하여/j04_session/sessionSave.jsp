<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session 데이터 저장하기</title>
</head>
<body>
<h1>session 데이터 저장하기</h1>
<p>할당된 sessionID : <%=session.getId() %></p>
<%
	// session 내장 객체
	//						변수명		데이터
	session.setAttribute("userid", "goguma");
	session.setAttribute("username", "고구가");
	session.setAttribute("grade", "A");
%>
<a href="sessionView.jsp">세션 값 확인하기</a>
</body>
</html>