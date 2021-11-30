<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../resources/css/common.css" type="text/css" rel="stylesheet">
<link href="../resources/css/adminloginForm.css" type="text/css" rel="stylesheet">
<script src="../resources/js/loginForm.js" type="text/javascript"></script>
</head>
<body>

<%
session = request.getSession();
if(session.getAttribute("admin")!=null){
%>

	<div class="top_wrap">
		<div class="contents">
			<ul>
			<a href="<%=request.getContextPath()%>/admin/members">members</a>
				<a href="<%=request.getContextPath()%>/admin/reservations">reservation</a>
			<li><a href="<%=request.getContextPath()%>/admin/logout">log-out</a></li>
			</ul>
		</div>
	</div>
	
	<div class="section_wrap">
		<div class="contents">
			로그인 완료
		</div>
	</div>

	<div class="footer_wrap">
		<div class="contents">
			air reservation system ver.2021-10-06
		</div>
	</div>
<%
}else{
%>
	<div class="top_menu_wrap">
		<div class="content">
			<ul>
				<li><a href="<%=request.getContextPath()%>/admin/loginForm">admin log-in</a></li>
				
			</ul>
		</div>
	</div>
	
	<div class="section_wrap">
		<div class="contents">
			<form action="<%=request.getContextPath()%>/admin/loginConfirm" method="post" name="adminloginForm">
				<div><input type="text" name="a_mail" placeholder="메일 입력"></div>
				<div><input type="password" name="a_pw" placeholder="비밀번호 입력"></div>
				<div>
					<input type="button" value="login" onclick="adminloginFun()">
					<input type="reset" value="reset">
				</div>
			</form>
		</div>
	</div>

	<div class="footer_wrap">
		<div class="contents">
			air reservation system ver.2021-10-06
		</div>
	</div>
<%
}
%>

</body>
</html>