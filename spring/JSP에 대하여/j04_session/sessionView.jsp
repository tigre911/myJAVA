<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>session data view</h1>
<ul>
	<li>아이디 : <%=session.getAttribute("userid") %></li>
	<li>이름 : <%=session.getAttribute("username") %></li>
	<li>성적 : <%=session.getAttribute("grade") %></li>
</ul>
<a href="/webJSP/index.jsp">홈으로</a>
</body>
</html>