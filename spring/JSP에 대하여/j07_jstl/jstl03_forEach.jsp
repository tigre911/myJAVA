<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>forEach 반복분</h1>
<c:set var="dan" value="${8 }"/>
<!-- 		변수		시작값		종료값		증감량(생략시 기본값이1) -->
<c:forEach var="i" begin="2" end="9" step="1">
	${dan }*${i } = ${dan*i }<br>
</c:forEach>

<h1>배열을 이용한 반복문</h1>
<c:set var="arr"  value="<%= new int[]{20,36,62,95,84,32,72,62} %>"/>
<!-- 				  items: 배열 또는 컬렉션을 넣을 수 있음 -->
<c:forEach var="data" items="${arr }">
	[${data}],
</c:forEach>

<h1>컬렉션을 이용한 반복문</h1>
<%
	List<String> lst = new ArrayList();
	lst.add("강남구");
	lst.add("어쩌라구");
	lst.add("강속구");
	lst.add("아구");
	lst.add("대구");
%>
<c:set var="city" value="<%=lst%>"/>
<ol>
<c:forEach var="v" items="${city}">
	<li>${v}</li>
</c:forEach>
</ol>

<hr>
<%
	HashMap<String, String> hm = new HashMap<String, String>();
	hm.put("userid","goguma");
	hm.put("username","고구마");
	hm.put("tel","010-1234-1234");
	hm.put("addr","서울시 강남구 역삼동");
%>
<c:set var="info" value="<%=hm%>"/>
<ul>
<c:forEach var="vvv" items="${info}">
	<li>key : ${vvv.key}, value : ${vvv.value }</li>
</c:forEach>
</ul>
</body>
</html>