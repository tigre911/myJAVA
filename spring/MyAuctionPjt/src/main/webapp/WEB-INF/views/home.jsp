<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
<link rel="stylesheet" href="/myapp/css/main.css" type="text/css">
<link rel="stylesheet" href="/myapp/css/common.css" type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
</head>
<body>

    <div class="top_menu_wrap">
        <div class="content">
            <div class="logo" style="clear: both;">
                <a href="/myapp"><img src="/myapp/img/logo.jpg" class="logo_img"/>
                <h1>우리 동네 경매마켓</h1></a>

            </div>
        </div>
    </div>

    <div class="login_menu_wrap">
        <ul>
            <c:if test="${logStatus !='Y' }">
                <li><a href="/myapp/member/loginForm">로그인</a></li>
                <li><a href="/myapp/member/join">회원가입</a></li>
            </c:if>
            <c:if test="${logStatus =='Y' }">
                <li><a href="/myapp/member/logout">로그아웃</a></li>
                <li><a href="/myapp/member/memberEdit">회원정보수정</a></li>
            </c:if>
        </ul>
    </div>
    
    <div class="search_menu_wrap">
        <div class="content">
            <input type="text" id="searchBox" placeholder="동네 이름, 물품명 등을 검색해 보세요!">
            <input type="button" id="searchButton" value="🔎" onclick="">
        </div>
    </div>
    
    <div class="section_menu_wrap">
        <div class="content">
            <h3>현재 인기 경매 상품</h3><br><br>
            <div class="products" style="clear: both;">
                <ul>
                    <li><a href=""><img src="img/1.jpg" id="p_img"><h2 id="p_time">${time}</h2></a></li>
                    <li><a href=""><img src="img/2.jpg" id="p_img"><h2 id="p_time">09:28:24</h2></a></li>
                    <li><a href=""><img src="img/3.jpg" id="p_img"><h2 id="p_time">11:25:37</h2></a></li>
                    <li><a href=""><img src="img/4.jpg" id="p_img"><h2 id="p_time">11:46:48</h2></a></li>
                </ul>
                <br><br>
                <ul>
                    <li><a href=""><img src="img/5.jpg" id="p_img"><h2 id="p_time">12:22:21</h2></a></li>
                    <li><a href=""><img src="img/6.jpg" id="p_img"><h2 id="p_time">14:36:22</h2></a></li>
                    <li><a href=""><img src="img/7.jpg" id="p_img"><h2 id="p_time">14:47:01</h2></a></li>
                    <li><a href=""><img src="img/8.jpg" id="p_img"><h2 id="p_time">18:00:57</h2></a></li>
                </ul>
            </div>
        </div>
    </div>
    
    <div class="page_menu_wrap">
        <div class="content">
            <ul>
                <li><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
            </ul>
        </div>
    </div>
    
    <div>
        <button><a href="post.html">게시물 등록하기</a></button>
    </div>
   
</body>
</html>