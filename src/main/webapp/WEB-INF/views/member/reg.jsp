<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>

<link rel="stylesheet" type="text/css" href="/resources/css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="/resources/css/member.css" />
</head>
<body>
	<div class="container" >
		<div class="reg_frm_box">
			<form method="post" action="/member/regUpdate.do" id="regfrm" name="regfrm" role="form" class="userform form-horizontal" >
				<div class="form-group reg_total">
				<label for="userId" class="col-sm-12 control-label">아이디 (*)</label> 
					<div class="reg_input col-sm-12"> 
						<input type="text" id="userId" name="userId" class="form-control" maxlength="13" required/>
					</div>
				</div>
				<div class="form-group reg_total">
					<label for="userPw" class="col-sm-12 control-label" >비밀번호 (*)</label> 
					<div class="reg_input col-sm-12">
						<input type="password" id="userPw" name="userPw"  class="form-control" maxlength="20"  required/>
					</div>
				</div>
				<div class="form-group reg_total">
					<label for="userPwChk" class="col-sm-12 control-label">비밀번호 확인 (*) </label>
					<div class="reg_input col-sm-12">
						<input type="password" id="userPwChk"  class="form-control" maxlength="20" required/>
					</div>
				</div>
				<div class="form-group reg_total">
					<label for="userName" class="col-sm-12 control-label">이름 (*)</label>
					<div class="reg_input col-sm-12">
						<input type="text" id="userName" name="userName"  class="form-control" maxlength="13"  required/>
					</div>
				</div>
				<div class="form-group reg_total">
					<label for="userNick" class="col-sm-12 control-label">닉네임 (*)</label>
					<div class="reg_input col-sm-12">
						<input type="text" id="userNick" name="userNick"  class="form-control" maxlength="20"  required/>
					</div>
				</div>
				<div class="form-group reg_total">
					<label for="userEmail" class="col-sm-12 control-label">이메일 (*)</label> 
					<div class="reg_input col-sm-12">
						<input type="text" id="userEmail" name="userEmail"  class="form-control" maxlength="50"/>
					</div>
				</div>
				<div class="form-group reg_total">
					<label for="userPhone"  class="col-sm-12 control-label">전화번호 (*), '-' 입력 제외 </label> 
					<div class="reg_input col-sm-12">
						<input type="text" id="userPhone" name="userPhone"  class="form-control" maxlength="15"/>
					</div>
				</div>
				
				<div class="form-group reg_total">
					<label for="GenderLabel" class="col-sm-12 control-label">성별 (*)</label> 
					<div class="reg_input col-sm-12">
						<input type="radio" value="1" class="user_radio" name="userGender" />남
						&nbsp;
						<input type="radio" value="2" class="user_radio" name="userGender" />녀
						
					</div>
				</div>
				<div class="form-group reg_total">
					<label class="col-sm-12 control-label" id="regEmaillabel" >생년월일 (*)</label>
					<div class="reg_input col-sm-12">
						<input type="text" id="userRegDate" name="userRegDate" class="form-control" maxlength="8"/>
					</div>
				</div>
				<br/>
				<br/>
				<br/>
				<div class="form-group reg_total">
					<div class="reg_btn col-sm-12">
						<input type="submit" class="btn btn-primary"  id="reg_form_btn" value="회원가입하기"/>
							
					</div>
				</div>
			</form>
		</div>
	</div>


<script src="/resources/js/jquery-3.5.1.min.js"></script>
<script src="/resources/js/bootstrap.js"></script>
<script src="/resources/js/member.js"></script>
</body>
</html>