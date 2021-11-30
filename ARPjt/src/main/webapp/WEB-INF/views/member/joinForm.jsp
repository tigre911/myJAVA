<%@page import="com.our.arp.member.vo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../resources/css/common.css" type="text/css" rel="stylesheet">
<link href="../resources/css/adminloginForm.css" type="text/css" rel="stylesheet">
<script src="../resources/js/joinForm.js" type="text/javascript"></script>
</head>
<body>



<div class="top_wrap">
	<div class="content">
		<ul>
		<li><a href="<%=request.getContextPath()%>/">home</a></li>
		<li><a href="<%=request.getContextPath()%>/member/loginForm">log-in</a></li>
		<li><a href="<%=request.getContextPath()%>/member/joinForm">join</a></li>
		</ul>
	</div>
</div>

<div class="section_wrap">
		<div class="content">
			<form action="<%=request.getContextPath()%>/member/joinConfirm" name="joinForm" method="post">
				<div class="form_wrap">
					<div><input type="text" name="m_mail" placeholder="메일 입력"></div>
					<div><input type="password" name="m_pw" placeholder="비밀번호 입력"></div>
					<div>
						<input type="button" value="join" onclick="joinFun()">
						<input type="reset" value="reset">
					</div>
				</div>
			</form>
		</div>
	</div>

<div class="footer_wrap">
	<div class="content">
	
	</div>






</body>
</html>