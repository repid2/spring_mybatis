<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<title>로그인 페이지</title>
<link rel="stylesheet" type="text/css" href="/resources/css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="/resources/css/member.css" />


</head>
<body>
	<div class="container">
		<div class="login_frm_box">
			<!-- <form action="member/login.do" method="post" id="login_frm" class="form-horizontal"> -->
			<form method="post" action="member/view.do" id="loginfrm" name="loginfrm" class="form-horizontal" >
				<div class="form-group login_input">
				    <div class="col-sm-12">
				    		<!-- <input type="text" class="form-control" name="user_id" id="user_id" placeholder="아이디를 입력하세요"> -->
				    		<input type="text" class="form-control" name="userId" id="userId" placeholder="아이디를 입력하세요">
					</div>
				</div>	
				<div class="form-group login_input">
		    		<div class="col-sm-12">
				    	<!-- <input type="password" class="form-control" name="user_pw" id="user_pw" placeholder="비밀번호를 입력하세요"> -->
				    	<input type="password" class="form-control" name="userPw" id="userPw" placeholder="비밀번호를 입력하세요">
					</div>
				</div>	
				<div class="form-group login_input">
					<div class="login_btn col-sm-12">
						<input type="checkbox" class="btn btn-primary" name="cookieChk" id="cookieChk" value="<%=session.getAttribute("cookieChk") %>" />
						<input type="button" class="btn btn-primary" value="로그인" id="login_btn" />
						<button type="button" class="btn btn-primary" onclick="location.href='/member/reg.do'">회원가입</button>
					</div>
				</div>
			</form>
		</div>
	</div>

<script src="/resources/js/jquery-3.5.1.min.js"></script>
<script src="/resources/js/bootstrap.js"></script>
<script src="/resources/js/login.js"></script>
</body>
</html>