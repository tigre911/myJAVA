<%@page import="com.eud.air.reservation.vo.ReservationVo"%>
<%@page import="com.eud.air.member.vo.MemberVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="../resources/css/common.css" type="text/css" rel="stylesheet">
<link href="../resources/css/adminReservationModifyForm.css" type="text/css" rel="stylesheet">

<script type="text/javascript" src="../resources/js/adminReservationModifyForm.js"></script>
</head>
<body>

	<%
		session = request.getSession();
		if (session.getAttribute("admin") != null) {
			
			%>
			
			<div class="top_menu_wrap">
				<div class="content">
					<ul>
						<li><a href="<%=request.getContextPath()%>/admin/logout">admin logout</a></li>
					</ul>
				</div>
			</div>
			
			<div class="top_section_wrap">
				<div class="content">
					
					<div class="menuWrap">
						<a href="<%=request.getContextPath()%>/admin/members">members</a>
						<a href="<%=request.getContextPath()%>/admin/reservations">reservations</a>
					</div>
					
					
					
				</div>
			</div>
			
			<%
			
		} else {
			
			%>
			
			<div class="top_menu_wrap">
				<div class="content">
					<ul>
						<li><a href="<%=request.getContextPath()%>/admin/">admin login</a></li>
					</ul>
				</div>
			</div>
			
			<div class="top_section_wrap">
				<div class="content">
					
				</div>
			</div>
			
			<%
			
		}
	%>

	
	<div class="top_footer_wrap">
		<div class="content">
			미래융합교육원 ㈜ &nbsp;&nbsp;|&nbsp;&nbsp;대표이사 홍길동&nbsp;&nbsp;|&nbsp;&nbsp;사업자등록번호 000-00-00000
		</div>
	</div>

</body>
</html>