function loginCheck() {
    console.log("loginCheck Start")

    var loginForm = document.loginForm;

    if(loginForm.id.value == ""){
        alert('아이디를 입력하세요!');
        loginForm.id.focus();
    }

    else if(loginForm.pw.value == ""){
        alert('비밀번호를 입력하세요!');
        loginForm.pw.focus();
    }

    else{
        loginForm.submit();
    }

    
}

function logFormCheck(){
    //아이디와 비밀번호 입력 유무를 확인하고, 모두 입력되면 action의 파일을 요청하고
    //하나라도 입력이 안되면 현재 페이지에 머물러야 한다.
    //아이디가 있는지 확인
    var id =document.getElementById("userid");
    if(id.value==""){//아이디가 없을 때
        alert("아이디를 입력하세요.");
        id.focus();//focus : 커서를 해당 객체에 위치시킨다.
        return false;
    }
    if(document.querySelector("#userpwd").value==""){
        alert("비밀번호를 입력하세요.");
        document.querySelector("#userpwd").focus();
        return false;
    }
    //아이디와 비밀번호가 모두 입력되었을 떄
    return true;
}