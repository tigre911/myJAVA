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
<c:set var="n" value="${1234}"/>
<c:set var="x" value="${1000}"/>
<h1>조건문 사용하기</h1>
<c:if test="${n>x}">
	<p>
		${n}는 ${x}보다 큰값이다
	</p>
</c:if>

<c:if test="${true }">
	<h2>무조건 실행됨</h2>
</c:if>

<h1>jstl에서 request하기</h1> <!-- request.getParameter("변수") -->
<ul>
	<li> 페이지 번호 : ${param.pageNum}</li>
	<li> 제목 : ${param.title}</li>
	<li> 핫키 : ${param.hotKey}</li>
</ul>
</body>
</html>