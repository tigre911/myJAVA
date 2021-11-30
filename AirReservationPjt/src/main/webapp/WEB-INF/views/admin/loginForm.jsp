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
<!--  상단    -->
	<div class="top_menu_wrap">
		<div class="content">
			<ul>
				<li><a href="<%=request.getContextPath()%>/admin/logout">admin log-out</a></li>
				
			</ul>
		</div>
		
		<div class = "top_section_wrap">
			<div class = "menuwrap">
				<a href="<%=request.getContextPath()%>/admin/members">members</a>
				<a href="<%=request.getContextPath()%>/admin/reservation">reservation</a>
			</div>
		</div>
		
	</div>
		<%
	}else{
		%>
<!--  상단    -->
		<div class="top_menu_wrap">
		<div class="content">
			<ul>
				<li><a href="<%=request.getContextPath()%>/admin/loginForm">admin log-in</a></li>
				
			</ul>
		</div>
	</div>
<!--  중간    -->
	<div class="section_menu_wrap">
		<div class="content">
			<div class="form_wrap">
			<form action="<%=request.getContextPath()%>/admin/loginConfirm" method="post" name="adminloginForm">
				<div><input type="text" name="a_mail" placeholder="메일 입력+++++++"></div>
				<div><input type="password" name="a_pw" placeholder="비밀번호 입력"></div>
				<div>
					<input type="button" value="login" onclick="adminloginFun()">
					<input type="reset" value="reset">
				</div>
				
			</div>
			</form>
			
		</div>
	</div>
	
	<%	
	}
%>
<!--  하단    -->	
	
	<div class="footer_menu_wrap">
		<div class="content">
		진우네항공㈜ 대표이사 김진우 사업자등록번호 104-81-17480 통신판매업 신고 제 16-2822
		
		</div>
	</div>
	
	<!-- <div class="">
		<div class="content">
		
		</div>
	</div> -->

</body>
</html>