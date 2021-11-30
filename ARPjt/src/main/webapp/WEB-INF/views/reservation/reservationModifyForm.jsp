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
			
			<div class="formWrap">
			
				<%
					ReservationVo reservationVo = (ReservationVo)request.getAttribute("reservationVo");
				%>
			
				<form action="<%=request.getContextPath()%>/reservation/reservationModifyConfirm" method="post" name="reservationModifyForm">
				
				<input type="hidden" name="r_no" value="<%=reservationVo.getR_no()%>">
						
					<div class="reservationList">
						<a href="<%=request.getContextPath()%>/reservation/reservationList">reservation list</a>
					</div>
					
					<table>
						<tr>
							<td colspan="4">Air reservation</td>
						</tr>
						<tr>
							<td>이름</td>
							<td><input type="text" name="r_name" value="<%=reservationVo.getR_name() %>" placeholder="예약자 이름을 입력하세요."></td>
							<td>메일</td>
							<td><input type="text" name="r_mail" value="<%=session.getAttribute("loginMember")%>" readonly></td>
						</tr>
						<tr>
							<td>출발지</td>
							<td>
								<select name="r_start_location">
									<option value="">선택</option>
									<option value="인천" <%if(reservationVo.getR_start_location().equals("인천")) {%>selected<%} %>>인천</option>
									<option value="김포" <%if(reservationVo.getR_start_location().equals("김포")) {%>selected<%} %>>김포</option>
									<option value="제주" <%if(reservationVo.getR_start_location().equals("제주")) {%>selected<%} %>>제주</option>
								</select>
							</td>
							<td>도착지</td>
							<td>
								<select name="r_end_location">
									<option value="">선택</option>
									<option value="괌" <%if(reservationVo.getR_end_location().equals("괌")) {%>selected<%} %>>괌</option>
									<option value="다낭" <%if(reservationVo.getR_end_location().equals("다낭")) {%>selected<%} %>>다낭</option>>
									<option value="하와이" <%if(reservationVo.getR_end_location().equals("하와이")) {%>selected<%} %>>하와이</option>>
									<option value="상하이" <%if(reservationVo.getR_end_location().equals("상하이")) {%>selected<%} %>>상하이</option>>
									<option value="멜버른" <%if(reservationVo.getR_end_location().equals("멜버른")) {%>selected<%} %>>멜버른</option>>
									<option value="오클랜드" <%if(reservationVo.getR_end_location().equals("오클랜드")) {%>selected<%} %>>오클랜드</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>가는날</td>
							<td><input type="text" value="<%=reservationVo.getR_start_date() %>" name="r_start_date" placeholder="가는날을 입력하세요."></td>
							<td>오는날</td>
							<td><input type="text" value="<%=reservationVo.getR_end_date() %>" name="r_end_date" placeholder="오는날을 입력하세요."></td>
						</tr>
						<tr>
							<td>성인<br>(12세 이상)</td>
							<td>
								<select name="r_adult_cnt">
									<option value="">선택</option>
									<option value=0 <%if(reservationVo.getR_adult_cnt() ==0){%>selected<%}%>>0</option>
									<option value=1 <%if(reservationVo.getR_adult_cnt() ==1){%>selected<%}%>>1</option>
									<option value=2 <%if(reservationVo.getR_adult_cnt() ==2){%>selected<%}%>>2</option>
									<option value=3 <%if(reservationVo.getR_adult_cnt() ==3){%>selected<%}%>>3</option>
									<option value=4 <%if(reservationVo.getR_adult_cnt() ==4){%>selected<%}%>>4</option>
								</select>
							</td>
							<td>소아<br>(12세 미만)</td>
							<td>
								<select name="r_infant_cnt">
									<option value="">선택</option>
									<option value=0 <%if(reservationVo.getR_infant_cnt() ==0){%>selected<%}%>>0</option>
									<option value=1 <%if(reservationVo.getR_infant_cnt() ==1){%>selected<%}%>>1</option>
									<option value=2 <%if(reservationVo.getR_infant_cnt() ==2){%>selected<%}%>>2</option>
									<option value=3 <%if(reservationVo.getR_infant_cnt() ==3){%>selected<%}%>>3</option>
									<option value=4 <%if(reservationVo.getR_infant_cnt() ==4){%>selected<%}%>>4</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>유아<br>(24개월 미만)</td>
							<td>
								<select name="r_child_cnt">
									<option value="">선택</option>
									<option value=0 <%if(reservationVo.getR_child_cnt() ==0){%>selected<%}%>>0</option>
									<option value=1 <%if(reservationVo.getR_child_cnt() ==1){%>selected<%}%>>1</option>
									<option value=2 <%if(reservationVo.getR_child_cnt() ==2){%>selected<%}%>>2</option>
									<option value=3 <%if(reservationVo.getR_child_cnt() ==3){%>selected<%}%>>3</option>
									<option value=4 <%if(reservationVo.getR_child_cnt() ==4){%>selected<%}%>>4</option>
								</select>
							</td>
							<td>좌석</td>
							<td>
								<select name="r_seat_type">
									<option value="">선택</option>
									<option value="일반석"<%if(reservationVo.getR_seat_type().equals("일반석")){%>selected<%}%>>일반석</option>
									<option value="비지니스석"<%if(reservationVo.getR_seat_type().equals("비지니스석")){%>selected<%}%>>비지니스석</option>
									<option value="일등석"<%if(reservationVo.getR_seat_type().equals("일등석")){%>selected<%}%>>일등석</option>
								</select>
							</td>
						</tr>
						<tr>
							<td colspan="4">
								<input type="button" value="reservation" onclick="reservationModifyFun()">
								&nbsp;
								<input type="reset" value="reset">
							</td>
						</tr>
					</table>
					
				</form>
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