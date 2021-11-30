<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../resources/css/common.css" type="text/css" rel="stylesheet">
<link href="../resources/css/isOldMember.css" type="text/css" rel="stylesheet">

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
			
				이미 사용중인 메일 (<%=request.getAttribute("m_mail")%>) 입니다.<br>
				<a href="<%=request.getContextPath()%>/member/joinForm">join</a>
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