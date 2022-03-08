<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
	#mFrm li{
		float: left; height:40px; line-height:40px; width:20%;
		border-bottom: 1px solid gray;
	}
	
	#mFrm li:nth-child(2n){
		width: 80%;
	}
	
	#mFrm li:last-child {
		width: 100%;
	}
</style>	
<script src="/myapp/js/member.js" type="text/javascript"></script>
<!-- top bottom jspf 에 html 태그및 css 다있기 때문에 중간에 작성할 요소만 적어준다 -->
<div class="container">
	<h1>회원 가입 폼</h1>
	<form method="post" action="/myapp/member/memberOk" id="mFrm" onsubmit="return memberCheck()">
	<ul>
		<li>아이디</li>
		<li>
			<input type='text' name='userid' id='userid' placeholder='아이디 입력'/>
			<input type='button' value='아이디 중복 확인'>
		</li>
		<li>비밀번호</li>
		<li><input type="password" name="userpwd" id="userpwd" placeholder="비밀번호 입력"></li>
		<li>비밀번호 확인</li>
		<li><input type="password" name="userpwd2" id="userpwd2" placeholder="비밀번호 확인입력"></li>
		<li>이름</li>
		<li><input type="text" name="username" id="username" placeholder="이름 입력"></li>
		<li>연락처</li>
        <li>
            <select name='tel1'>
                <option value='010'>010</option>
                <option value='02'>02</option>
                <option value='031'>031</option>
                <option value='041'>041</option>
            </select>-
            <input type='text' name='tel2' id='tel2'/>-
            <input type='text' name='tel3' id='tel3'/>
        </li>
		<li>이메일</li>
		<li><input type="text" name="email" id="email" placeholder="이메일 입력"></li>
		<li><input type="submit" value="가입하기"/></li>
	</ul>
	</form>
</div>