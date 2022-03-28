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
		// 파일 개수 처리하기 위한 변수생성
		var fileCount = ${fileCount};
		
		
		// 새로추가되는 첨부파일
		$("#dataFrm b").click(function(){
			$(this).parent().css("display","none");		//파일명숨기기
			$(this).parent().next().attr("name","delFile");	// 삭제파일정보 name을 deFile로 변경
			$(this).parent().next().next().attr("type","file");	// 새로운파일을 선택할 수 있도록 
			// 파일의 갯수 줄어들어야 한다.
			fileCount--;
		});
		
		
	
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
<div class="top_menu_wrap">
    <div class="content">
        <div class="logo" style="clear: both;">
            <a href="/myapp"><img src="/myapp/img/logo.jpg" class="logo_img"/>
            <h1>우리 동네 경매마켓</h1></a>     
    </div>
</div>
<div class="container" style="padding: 60px">
	<h1>경매 글 수정 하기</h1>
	<!-- 파일 업로드의 기능이 있는 폼은 반드시 enctype속성을 명시하여야한다.!!! -->
	<form id="dataFrm" method="post" action="/myapp/data/editOk" enctype="multipart/form-data">
		<input type="hidden" name="no" value="${vo.no }"/>
		<ul>
			<li>제목</li>
			<li><input type="text" name="subject" id="subject" value="${vo.subject }" style="width: 1000px"/></li>
			<li>글내용</li>
			<li><textarea name="content" id="content" style="width: 1000px; height: 400px;">${vo.content}</textarea></li>
			<li>첨부파일</li>
			<li>
				<!-- 첫번째 첨부파일 -->
				<div>${vo.filename1 } &nbsp; &nbsp; <b>X</b></div>
				<!-- X를 누르면 삭제 파일명이 있는 input의 name의 속성 값을 del파일로 준다. -->
				<input type="hidden" name="" value="${vo.filename1 }"/>
				<!-- X를 누르면 파일이 삭제되고 새로운 파일 선택이 선택가능하도록 input만들어 준다. -->
				<input type="hidden" name="filename" id="filename1"/>
			</li>
			
			<li>
				<!-- 두번째 첨부파일이 있을 때 -->
				<c:if test="${vo.filename2!=null && vo.filename2!='' }">
					<div>${vo.filename2 } &nbsp; &nbsp; <b>X</b></div>
					<input type="hidden" name="" value="${vo.filename2}"/>
					<input type="hidden" name="filename" id="filename2"/>
				</c:if>
				<!-- 두번째 첨부파일이 없을 때 -->
				<c:if test="${vo.filename2==null || vo.filename2=='' }">
					<input type="file" name="filename" id="filename2"/>
				</c:if>
			</li>
			
			<li><input type="submit" value="자료실 글수정"/></li>
		</ul>
	</form>
</div>
</body>
</html>