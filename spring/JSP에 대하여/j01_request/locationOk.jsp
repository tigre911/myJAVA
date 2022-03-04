<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String pageNum = request.getParameter("pageNum");
	String searchWord = request.getParameter("searchWord");
	
	System.out.println("pageNum : " + pageNum);
	System.out.println("searchWord : " + searchWord);
%>

페이지번호 = <%=pageNum%><br>
검색어 = <%=searchWord%>