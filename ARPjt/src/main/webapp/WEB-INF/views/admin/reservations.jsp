
<%@page import="com.our.arp.reservation.vo.ReservationVo"%>
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