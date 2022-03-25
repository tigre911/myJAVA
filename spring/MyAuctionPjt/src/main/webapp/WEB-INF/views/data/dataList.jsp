<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
<link rel="stylesheet" href="/myapp/css/common.css" type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
<style>
	.container{
		padding: 60px;
	}

	#dataList>li{
		float:left; width:10%; height:40px; line-height:40px; border-bottom:1px solid gray;
	}
	#dataList>li:nth-child(5n+2){
		width:60%;
	}
</style>
<script type="text/javascript">
	$(function() {
		$("#searchFrm").submit(function() {
			if ($("#searchWord").val() == "") {
				alert("검색어를 입력하세요");
				return false;
			}
		});
	});
</script>
</head>
<body>

<div class="top_menu_wrap">
    <div class="content">
        <div class="logo" style="clear: both;">
            <a href="/myapp"><img src="/myapp/img/logo.jpg" class="logo_img"/>
            <h1>우리 동네 경매마켓</h1></a>     
    </div>
</div>
<div class="container">
	<h1>경매 물품 보기</h1><hr><br>
	<button><a href="/myapp/data/write">글쓰기</a></button>
	<ul id="dataList">
		<li>번호</li>
		<li>제목</li>
		<li>글쓴이</li>
		<li>첨부파일</li>
		<li>등록일</li>
		
		<c:forEach var="vo" items="${lst}">
			<li>${vo.no }</li>
			<li><a href="/myapp/data/view?no=${vo.no}">${vo.subject}</a></li>
			<li>${vo.userid }</li>
			<li><!-- 다운로드 가능하게 해줄거임 -->
				<!-- 첫번째 첨부파일(무조건있음) -->
				<a href="/myapp/upload/${vo.filename1}" download><img src="/myapp/img/disk.png" title="${vo.filename1}"/></a>
				<!-- 두번재 첨부파일 -->
				<c:if test="${vo.filename2!=null && vo.filename2!=''}">
					<a href='/myapp/upload/${vo.filename2}' download><img src='/myapp/img/disk.png' title='${vo.filename2}'></a>
				</c:if>
			</li>
			<li>${vo.writedate }</li>
		</c:forEach>
		
	</ul>
	
	<div>
      <form method="get" action="/myapp/data/dataList" id="searchFrm">
         <select name="searchKey">
            <option value="subject">제목</option>
            <option value="content">글내용</option>
            <option value="userid">글쓴이</option>
         </select> <input type="text" name="searchWord" id="searchWord"> 
         <input type="submit" value="search">
      </form>
   </div>
</div>

</body>
</html>