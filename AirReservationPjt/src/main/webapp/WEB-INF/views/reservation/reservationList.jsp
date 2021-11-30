<%@page import="com.eud.air.reservation.vo.ReservationVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../resources/css/common.css" type="text/css" rel="stylesheet">
<link href="../resources/css/reservationList.css" type="text/css" rel="stylesheet">

<script src="../resources/js/reservationForm.js" type="text/javascript"></script>
</head>
<body>

	<%
		session = request.getSession();
		if(session.getAttribute("loginMember")!=null){
	%>
		<div class="top_menu_wrap">
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
			response.sendRedirect(request.getContextPath() + "/member/loginForm");
			
		%>
			<div class="top_menu_wrap">
				<div class="content">
					<ul>
						<li><a href="<%=request.getContextPath()%>/member/loginForm">login</a></li>
						<li><a href="<%=request.getContextPath()%>/reservation/reservationForm">reservation</a></li>
						<li><a href="<%=request.getContextPath()%>/">home</a></li>
					</ul>
				</div>
			</div>
			
		<%
		}
	%>
	
	<div class="top_section_wrap">
		<div class="content">
			
			<div class="listWrap">
				<table>
					<tr>
						<td>번호</td>
						<td>예약자</td>
						<td>출발지</td>
						<td>도착지</td>
						<td>가는날</td>
						<td>오는날</td>
						<td>성인</td>
						<td>소아</td>
						<td>유아</td>
						<td>좌석구분</td>
						<td>예약등록일</td>
						<td>예약수정일</td>
						<td>수정 / 취소</td>
					</tr>
					
					<%
						List<ReservationVo> reservationVos = (List<ReservationVo>) request.getAttribute("reservationVos");
							
						for(int i = 0; i<reservationVos.size(); i++) {
					%>					
					<tr>
						<td><%=(i+1)%></td>
						<td><%=reservationVos.get(i).getR_name() %></td>
						<td><%=reservationVos.get(i).getR_start_location() %></td>
						<td><%=reservationVos.get(i).getR_end_location() %></td>
						<td><%=reservationVos.get(i).getR_start_date() %></td>
						<td><%=reservationVos.get(i).getR_end_date() %></td>
						<td><%=reservationVos.get(i).getR_adult_cnt() %></td>
						<td><%=reservationVos.get(i).getR_infant_cnt() %></td>
						<td><%=reservationVos.get(i).getR_child_cnt() %></td>
						<td><%=reservationVos.get(i).getR_seat_type() %></td>
						<td><%=reservationVos.get(i).getR_reg_date() %></td>
						<td><%=reservationVos.get(i).getR_mod_date() %></td>
						<td>
							<a href="<%=request.getContextPath()%>/reservation/reservationModifyForm?r_no=<%=reservationVos.get(i).getR_no()%>">수정</a> 
							/ 
							<a href="<%=request.getContextPath()%>/reservation/reservationCancel?r_no<%=reservationVos.get(i).getR_no()%>">취소</a>
						</td>
					</tr>
					<%		
						}
					%>					
				</table>
			</div>
			
		</div>
	</div>
	
	<div class="footer_menu_wrap">
		<div class="content">
		진우네항공㈜ 대표이사 김진우 사업자등록번호 104-81-17480 통신판매업 신고 제 16-2822
		
		</div>
	</div>
	
</body>
</html>