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
<script src="/myapp/js/member.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function(){
		//아이디 중복검사
		$("#userid").keyup(function(){
			var userid = $("#userid").val();
			if(userid!=''&& userid.length>=6){
				var url = "/myapp/member/memberIdCheck";
				$.ajax({
					url : url,
					data : "userid=" + userid,
					type: "POST",
					success : function(result){
						if(result>0){//사용불가능
							$("#chk").html("시도 불가.");
							$("#idchk").val("N");
							$("#chk").css("color","red")
						}else{//사용가능
							$("#chk").html("가능.");
							$("#idchk").val("Y");
							$("#chk").css("color","blue")
						}
					}
				});
			}else{//사용불가
				$("#chk").html("시도 불가.");	
				$("#idchk").val("N");
				$("#chk").css("color","red")
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
    
    <div class="register">
        <h3>회원가입</h3>
        <form method="post" action="/myapp/member/memberOk" id="mFrm" onsubmit="return memberCheck()">
            <div class="flex">
                <ul class="container">
                    <li class="item center">
                        이름
                    </li>
                    <li class="item">
                        <input type="text" name="username" id="username">
                    </li>
                    <li class="item">
                        
                    </li>
                </ul>
                <ul class="container">
                    <li class="item center">
                        아이디
                    </li>
                    <li class="item">
                        <input type="text" name="userid" id="userid" placeholder="아이디를 입력하세요.">
                    </li>
                </ul>
                <ul class="container">
                    <li class="item center">
                        비밀번호
                    </li>
                    <li class="item">
                        <input type="password" name="userpwd" id="userpwd" placeholder="비밀번호를 입력하세요.">
                    </li>
                    <li class="item">
                        
                    </li>
                </ul>
                <ul class="container">
                    <li class="item center">
                        비밀번호 확인
                    </li>
                    <li class="item">
                        <input type="password" name="userpwd2" id="userpwd2" placeholder="비밀번호를 입력하세요.">
                    </li>
                    <li class="item">
                        
                    </li>
                </ul>
                <ul class="container">
                    <li class="item center">
                        연락처
                    </li>
                    <li class="item">
			            <input type='text' name='tel' id='tel' placeholder="'010-0000-0000' 형태로 입력해주세요"/>
                    </li>
                </ul>
                
                <ul class="container">
                    <li class="item center">
                        이메일
                    </li>
                    <li class="item">
                        <input type="text" name="email" id="email" placeholder="이메일 입력">
                    </li>
                    <li class="item">
                        
                    </li>
                </ul>
                
                <ul class="container">
                    <li class="item center">
                        
                    </li>
                    <li class="item">
                        <input type="submit" class="submit" onclick="joinCheck()" value="가입하기"></button>
                    </li>
                    <li class="item">
                        
                    </li>
                </ul>
            </div>
        </form>
    </div>


    <div class="footer_menu_wrap">
        <div class="content">
           
        </div>
    </div>
    

</body>
</html>