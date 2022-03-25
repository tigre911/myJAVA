function joinCheck(){
    console.log("joinCheck Start!!")

    var joinForm = document.joinForm;

    if(joinForm.name.value ==""){
        alert('이름 입력하세요!');
        joinForm.name.focus();
    }

    else if(joinForm.id.value == ""){
        alert('아이디를 입력하세요!');
        joinForm.id.focus();
    }
    else if(joinForm.pw.value == ""){
        alert('비밀번호를 입력하세요!');
        joinForm.pw.focus();
    }
    else if(joinForm.pwCheck.value == ""){
        alert('비밀번호를 확인하세요!');
        joinForm.pwCheck.focus();
    }
    else if(joinForm.pw.value != joinForm.pwCheck.value){
        alert("비밀번호가 다릅니다.")
        joinForm.password.focus();
    }
    else if(joinForm.date.value == ""){
        alert('생년월일을 입력하세요!');
        joinForm.date.focus();
    }
    else if(joinForm.phone.value == ""){
        alert('전화번호를 입력하세요!');
        joinForm.phone.focus();
    }
    else if(joinForm.address.value == ""){
        alert('주소를 입력하세요!');
        joinForm.address.focus();
    }
    else{
        joinForm.submit();
    }
}

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

