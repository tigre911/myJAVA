function loginFun(){
	console.log('loginFun() INIT!!@@@@');

	var loginForm = document.loginForm;
	
	if(loginForm.m_mail.value == ''){
		alert("메일을 입력하세요");
		loginForm.m_mail.focus();
	
	}else if(loginForm.m_pw.value == ''){
		alert("비밀번호를 입력하세요");
		loginForm.m_pw.focus();
	
	}else{
		loginForm.submit();
	}
}


function adminloginFun(){
	console.log('adminloginFun() INIT!!@@@@');

	var adminloginForm = document.adminloginForm;
	
	if(adminloginForm.a_mail.value == ''){
		alert("메일을 입력하세요");
		adminloginForm.a_mail.focus();
	
	}else if(adminloginForm.a_pw.value == ''){
		alert("비밀번호를 입력하세요");
		adminloginForm.a_pw.focus();
	
	}else{
		adminloginForm.submit();
	}
}