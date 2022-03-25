<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
<link rel="stylesheet" href="/myapp/css/common.css" type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
<style>
	#subject{width:99%;}
</style>
<script src="https://cdn.ckeditor.com/4.17.2/standard/ckeditor.js"></script>
<script>
	$(function(){
		CKEDITOR.replace("content");
	
		$("#dataFrm").submit(function(){
			
			if($("#subject").val()==""){
				alert("제목을 입력하세요");
				return false;
			}
			if(CKEDITOR.instances.content.getData()==""){
				alert("글내용을 입력하세요");
				return false;
			}
			//첨부파일 선택 갯수
			let fileCount=0;
			if($("#filename1").val()!=''){	//파일을 선택했다
				fileCount++;
			}
			if($("#filename2").val()!=''){
				fileCount++;
			}
			if(fileCount<1){
				alert("첨부파일은 반드시 1개 이상이어야 합니다.");
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
<div class="container" style="padding: 60px">
	<h1>경매 물품 등록하기</h1>
	<!-- 파일 업로드의 기능이 있는 폼은 반드시 enctype속성을 명시하여야한다.!!! -->
	<form id="dataFrm" method="post" action="/myapp/data/writeOk" enctype="multipart/form-data">
		<ul>
			<li>제목</li>
			<li><input type="text" name="subject" id="subject" style="width: 1000px"/></li>
			<li>글내용</li>
			<li><textarea name="content" id="content" style="width: 1000px; height: 400px;"></textarea></li>
			<li>첨부파일</li>
			<li>
				<input type="file" name="filename" id="filename1"/><br/>
				<input type="file" name="filename" id="filename2"/>
			</li>
			<li><input type="submit" value="자료실 글등록"/></li>
		</ul>
	</form>
</div>
</body>
</html>