<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>
	.boardList{
		overflow: auto;
	}

	.boardList>li{
		float: left; height: 40px; line-height:40px; border-bottom: 1px solid #ddd;
		width:10%;
	}
	
	.boardList>li:nth-child(5n+2){
		width:60%;
		white-space: nowrap;/*줄 안바꿈*/
		overflow:hidden;/*넘친내용 숨기기*/
		text-overflow: ellipsis;/*넘침시 ...표시*/
	}
	
	/*paging*/
	.paging{
		margin: 30px 0px; height:30px; overflow: auto;
	}
	
	.paging>li{
		float: left; width:30px; text-align: center;
	}
	
	/*search*/
	#searchFrm{
		padding: 20px 200px; text-align: center;
	}
</style>

<div class="container">
	<h1>게시판 목록</h1>
	<div>
		<a href="<%=request.getContextPath()%>/board/boardWrite">글쓰기</a>
	</div>
	<div>
		총 레코드수 : ${pVO.totalRecord },  ${pVO.totalPage}/${pVO.pageNum}
	</div>
	<ul class="boardList">
		<li>번호</li>
		<li>제목</li>
		<li>글쓴이</li>
		<li>조회수</li>
		<li>등록일</li>
		<c:forEach var="vo" items="${list}">
			<li>${vo.no }</li>
			<li><a href="#">${vo.subject }</a></li>
			<li>${vo.userid}</li>
			<li>${vo.hit}</li>
			<li>${vo.writedate}</li>
		</c:forEach>
		
	</ul>
	
	<!-- 페이징 -->
	<ul class="paging">
		<li><a href="#">prev</a></li>
		<li><a href="#">1</a></li>
		<li><a href="#">2</a></li>
		<li><a href="#">3</a></li>
		<li><a href="#">4</a></li>
		<li><a href="#">5</a></li>
		<li><a href="#">next</a></li>
	</ul>
	
	<!-- 검색 -->
	<div>
		<form method="get" action="" id="searchFrm">
			<select name="searchKey">
				<option value="">제목</option>
				<option value="">글내용</option>
				<option value="">글쓴이</option>
			</select>
			<input type="text" name="serarchWord" id="serarchWord">
			<input type="submit" value="search">
		</form>
	</div>
</div>