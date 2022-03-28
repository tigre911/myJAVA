<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
<link rel="stylesheet" href="/myapp/css/login.css" type="text/css">
<link rel="stylesheet" href="/myapp/css/common.css" type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
<script src="/myapp/js/login.js" type="text/javascript"></script>
</head>
<body>

    <div class="top_menu_wrap">
        <div class="content">
            <div class="logo" style="clear: both;">
                <a href="/myapp"><img src="/myapp/img/logo.jpg" class="logo_img"/>
                <h1>우리 동네 경매마켓</h1></a>     
        </div>
    </div>
    
    
    <div class="loginform">
        <h1>login</h1>
        <form action="/myapp/member/loginOk" method="post" id="logfrm" onsubmit="return logFormCheck()">
            <input type="text" name="userid" id="userid" placeholder="&nbsp;&nbsp;아이디">
            <input type="password" name="userpwd" id="userpwd" placeholder="&nbsp;&nbsp;비밀번호">

            <input type="submit" value="LOGIN" onclick="loginCheck()">
        </form>
    </div>
  

    <div class="section_menu_wrap">
        <div class="content">
            <ul>
                <li><a href="#">아이디 찾기</a></li>
                <li>&nbsp;|&nbsp;</li>
                <li><a href="#">비밀번호 찾기</a></li>
                <li>&nbsp;|&nbsp;</li>
                <li><a href="join.jsp">회원 가입</a></li>
            </ul>
        </div>
    </div>
    
    
</body>
</html>