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
<link href="../resources/css/adminMembers.css" type="text/css" rel="stylesheet">

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
						<a href="<%=request.getContextPath()%>/admin/members">members</a> | 
						<a href="<%=request.getContextPath()%>/admin/reservations">reservations</a>
					</div>
					
					<div class="membersWrap">
						<table>
							<tr>
								<td>번호</td>
								<td>메일</td>
								<td>비번</td>
								<td>등록일</td>
							</tr>
							
							<%
								List<MemberVo> memberVos = (List<MemberVo>) request.getAttribute("memberVos");
								for(int i=0; i<memberVos.size(); i++) {
									
							%>
							
							<tr>
								<td><%=(i+1)%></td>
								<td><%=memberVos.get(i).getM_mail()%></td>
								<td><%=memberVos.get(i).getM_pw()%></td>
								<td><%=memberVos.get(i).getM_reg_date()%></td>
							</tr>
							
							<%
								}
							%>
						</table>
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