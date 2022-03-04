<!-- 지시부 -->
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!-- jsp 코드가 있던 곳은 space가 존재하기 때문에 space를 없앨수 있다. -->
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%!
      //선언부 : 변수 또는 메소드     
      String userName = "홍길동";
      public String gugudan(int dan){
         String r = "";
         for(int i = 2; i<10; i++){
            r += dan+  " * " + i + " = " + (dan*i)+" <br/>";
         }
         return r;       
      }
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
   h1 {
      color: blue;
   }
</style>
<script type="text/javascript">
   document.write("자바스크립트 출력 전 문자");
</script>
</head>

<body>
   <h1>홈페이지</h1>
   <ul>
      <li>
         <!-- session객체의 userid 변수에 값이 있으면 로그인 상태
                     userid 변수에 값("",null)이 없으면 로그아웃상태 ,  ""은 equals로 문자가있을 수 도 있으므로
          -->
         <%if(session.getAttribute("userid")!= null && !session.getAttribute("userid").equals("")){%>   
         <a href="/webJSP/j04_session/sessionDel.jsp">로그아웃</a> 
      
         <%} else{ %>
         <a href="/webJSP/j04_session/sessionSave.jsp">로그인</a>
         <%} %>
      </li>
      
      <li><a   href="<%=request.getContextPath()%>/j02_response_jdbc/empForm.jsp">사원등록</a></li>
   </ul>
   <hr>
   jsp에서 세션변수 값 출력<br>
   userid : <%=session.getAttribute("userid") %><br>
   username : <%=session.getAttribute("username") %><br>
   grade : <%=session.getAttribute("grade") %><br>
   jstl에서 세션 변수 값 출력<br>
   userid => ${userid}<br>
   username => ${username}<br>
   grade => ${grade}<br>
   <h1>jstl을 이용한 로그인 로그아웃</h1>
   <c:if test="${userid==null || userid==''}">
   		<a href="/webJSP/j04_session/sessionSave.jsp">로그인</a>
   </c:if>
   <c:if test="${userid!=null && userid!=''}">
   		<a href="/webJSP/j04_session/sessionDel.jsp">로그아웃</a> 
   </c:if>
   <hr>
   <%
      //스크립트릿
      //변수 선언
      //계산
      //객체 생성
      int num = 2000;
      String tel = "010-1234-1234";
      
      //내장 객체: request, response, session, out, application,
      //out 내장 객체 : client에게 보내기
      out.println("이름=" + userName);
      out.println("<br/>번호 = " + num);
      out.println("<br/>연락처 = " + tel);
   %>
   <br />
   <img alt="" src="img/penguin.jpg" width="100">
   <br />
   <hr />
      이름 =
      <%=userName%><br /> 번호 =
      <%=num+100%><br /> 연락처 =
      <%=tel%><br />
      <%  
         out.print(gugudan(5));     
         System.out.println(gugudan(8));
      %>
      <hr />
      <%=gugudan(7) %>
      <% 
         Calendar now = Calendar.getInstance();
         out.println("<p>"+now+"</p>");
      %>
      <ul>
         <% 
         for(int i=1; i<=10; i++){
            out.println("<li>"+i+"</li>");   
         }
      %>
      </ul>
   <ul>
      <%
         for(int i=1; i<=10; i++){
      %>

      <li><%= i %></li>
      <% 
      }         
      %>
   </ul>

</body>
</html>