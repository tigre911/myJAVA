<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
<link rel="stylesheet" href="/myapp/css/join.css" type="text/css">
<link rel="stylesheet" href="/myapp/css/common.css" type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">

<style>

#subject {
	width: 98%;
}

#boardFrm li {
	padding: 10px 5px;
}
</style>
<script src="https://cdn.ckeditor.com/4.17.2/standard/ckeditor.js"></script>
<script>
   $(function() {
      CKEDITOR.replace("content");

      $("#boardFrm").submit(function() {
         if ($("#subject").val() == '') {
            alert("글 제목을 입력하세요");
            return false;
         }
         if (CKEDITOR.instances.content.getData() == '') {
            alert("글내용을 입력하세요");
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
	<h1>물건 등록하기</h1>
	<form method="post" action="/myapp/board/boardWriteOk" id="boardFrm">
		<ul>
			<li>제목</li>
			<li><input type="text" name="subject" id="subject" style="width: 1000px;"/></li>
			<li><textarea name="content" id="content" style="width: 1000px; height: 400px;"></textarea></li>
			<li><input type="submit" value="등록" /></li>
		</ul>
	</form>

</div>

</body>
</html>