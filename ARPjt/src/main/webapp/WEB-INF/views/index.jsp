<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./resources/css/common.css" type="text/css" rel="stylesheet">
<link href="./resources/css/adminloginForm.css" type="text/css" rel="stylesheet">
</head>
<body>

<%
session = request.getSession();
if(session.getAttribute("loginMember") != null){
%>
	<div class="top_wrap">
		<div class="content">
			<ul>
				<li><a href="<%=request.getContextPath()%>/member/logout">logout</a></li>
				<li><%=session.getAttribute("loginMember")%>님 안녕하세요</li>
				<li><a href="<%=request.getContextPath()%>/reservation/reservationForm">reservation</a></li>
				<li><a href="<%=request.getContextPath()%>/">home</a></li>
			</ul>
		</div>
	</div>
		
<%
}else{
%>
	<div class="top_wrap">
		<div class="content">
			<ul>
				<li><a href="<%=request.getContextPath()%>/member/loginForm">log-in</a></li>
				<li><a href="<%=request.getContextPath()%>/reservation/reservationForm">reservation</a></li>
				<li><a href="<%=request.getContextPath()%>/">home</a></li>
			</ul>
		</div>
	</div>
		
<%
}
%>


<div class="section_wrap">
	<div class="contents">
		비행기 예약 프로그램
	</div>
</div>

<div class="footer_wrap">
	<div class="contents">
	
	</div>
</div>
</body>
</html>