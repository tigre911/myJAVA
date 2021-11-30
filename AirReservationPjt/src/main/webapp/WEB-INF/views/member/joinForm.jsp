<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../resources/css/common.css" type="text/css" rel="stylesheet">
<link href="../resources/css/joinForm.css" type="text/css" rel="stylesheet">
<script src="../resources/js/joinForm.js" type="text/javascript"></script>
</head>
<body>

<!--  상단    -->

	<div class="top_menu_wrap">
		<div class="content">
			<ul>
				<li><a href="<%=request.getContextPath()%>/member/loginForm">log-in</a></li>
				<li><a href="<%=request.getContextPath()%>/reservationForm">reservation</a></li>
				<li><a href="<%=request.getContextPath()%>/">home</a></li>
			</ul>
		</div>
	</div>


<!--  중간    -->

	<div class="section_menu_wrap">
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