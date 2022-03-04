<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%!
// 2. 드라이브로딩
// 3. db연결
public Connection getConnection(){
   Connection con = null;
   try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3307/demo","root","0000");         
   }catch(Exception e){
      System.out.println("DB연결 에러 발생...");
      e.printStackTrace();
   }
   return con;
}
%>

<%
   //dept테이블의 deptno, dname을 선택한다.
   Connection conn = getConnection();
   String sql = "select deptno, dname from dept order by dname asc";
   PreparedStatement pstmt = conn.prepareStatement(sql);
   
   ResultSet rs = pstmt.executeQuery();
   
   
   
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--                           webJSP 이부분을 뺀다면 HTML파일로 만들어도 무관. 하지만 이 부분을 사용해야하기에 HTML파일로 만들면 안됨-->
<form method="post" action="<%=request.getContextPath()%>/j02_response_jdbc/empFormOk.jsp">
    사원번호 : <input type="text" name="empno"/><br/>
    사원명 : <input type="text" name="ename"/><br/>
    부서코드 : <input type="text" name="deptno"/><br/>
    <input type="submit" value="사원등록"/>
</form>
</body>
</html>