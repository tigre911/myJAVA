<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
<link rel="stylesheet" href="/myapp/css/common.css" type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
<script>
	function dataDelCheck(){
		if(confirm("삭제하시겠습니까?")){
			location.href="/myapp/data/dataDel?no=${dataVO.no}";
		}
	}
</script>
<script type="text/javascript">
var img = document.getElementsByTagName("img");
    for (var x = 0; x < img.length; x++) {
      img.item(x).onclick=function() {window.open(this.src)}; 
    }
</script>

<style type="text/css">
.container{
	padding: 60px;
}
</style>
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
	<h1>NO.${dataVO.no} 판매 품목 : ${dataVO.subject}</h1>
	<ul>
		<li>번호 : ${dataVO.no}</li>
		<li>작성자 : ${dataVO.userid }</li>
		<li>등록일 : ${dataVO.writedate }</li>
		<hr/>
		<li>제목 : ${dataVO.subject }</li>
		<hr/>
		<li><h3>글내용</h3></li>
		<li>${dataVO.content }</li>
		<hr/>
		<li>첨부파일 : <a href="/myapp/upload/${dataVO.filename1 }" download>${dataVO.filename1 }</a>
			<c:if test="${dataVO.filename2 != null && dataVO.filename2 != '' }">
				, <a href='/myapp/upload/${dataVO.filename2 }' download>${dataVO.filename2 }</a>
			</c:if>
		</li>
		<li><img src="/myapp/upload/${dataVO.filename1}" width="300" height="300">
			<c:if test="${dataVO.filename2 != null && dataVO.filename2 != '' }">
			<img src="/myapp/upload/${dataVO.filename2}" width="300" height="300">
			</c:if>
		</li>	
	</ul>
	<c:if test="${dataVO.userid==logId }">
		<a href="/myapp/data/dataEdit?no=${dataVO.no }">수정</a>
		<a href="javascript:dataDelCheck()">삭제</a>
	</c:if>
</div>
</body>
</html>