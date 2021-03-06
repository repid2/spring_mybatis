<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/resources/css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="/resources/css/login.css" />
<link rel="stylesheet" type="text/css" href="/resources/css/member
.css" />
</head>
<body>

	<div id="container">
		<div class="userModfrm_box">
			<form action="/member/update.do" method="post" id="userModfrm" name="userModfrm" role="form" class="userform form-horizontal">
				<div class="form-group mypage_total">
				<label for="userId" class="col-sm-12 control-label">아이디</label> 
					<div class="col-sm-12">
						<input type="text" id="userId" name="userId" class="form-control" value="${dto.userId}" maxlength="13" readonly/>
					</div>
				</div>
				<div class="form-group mypage_total">
				<label for="userPw" class="col-sm-12 control-label">비밀번호</label> 
					<div class="col-sm-12">
						<input type="password" id="userPw" name="userPw" class="form-control" value="${dto.userPw}" maxlength="15" />
					</div>
				</div>
				<div class="form-group mypage_total">
				<label for="userPwChk" class="col-sm-12 control-label">비밀번호 확인</label> 
					<div class="col-sm-12">
						<input type="password" id="userPwChk" name="userPwChk" class="form-control" maxlength="15" />
					</div>
				</div>
				<div class="form-group mypage_total">
				<label for="userPw" class="col-sm-12 control-label">이름</label> 
					<div class="col-sm-12">
						<input type="text" id="userName" name="userName" class="form-control" value="${dto.userName}" maxlength="13" readonly/>
					</div>
				</div>
				<div class="form-group mypage_total">
				<label for="userPw" class="col-sm-12 control-label">닉네임</label> 
					<div class="col-sm-12">
						<input type="text" id="userNick" name="userNick" class="form-control" value="${dto.userNick}" maxlength="13" />
					</div>
				</div>
				<div class="form-group mypage_total">
				<label for="userPhone" class="col-sm-12 control-label">전화번호</label> 
					<div class="col-sm-12">
						<input type="text" id="userPhone" name="userPhone" class="form-control" value="${dto.userPhone}" maxlength="13" />
					</div>
				</div>
				<div class="form-group mypage_total">
				<label for="userEmail" class="col-sm-12 control-label">이메일</label> 
					<div class="col-sm-12">
						<input type="text" id="userEmail" name="userEmail" class="form-control" value="${dto.userEmail}"  />
					</div>
				</div>
				<div class="form-group mypage_total">
				<label for="userGender" class="col-sm-12 control-label">성별</label>
					<div class="col-sm-12">
						<input type="radio" value="1" class="user_radio" name="userGender" ${dto.userGender eq '1' ? 'checked' : '' } onclick="return false;"/>남
							&nbsp;
						<input type="radio" value="2" class="user_radio" name="userGender" ${dto.userGender eq '2' ? 'checked' : '' } onclick="return false;" />녀
					</div> 
				</div>
				
				<div class="form-group mypage_total">
				<label for="userRegDate" class="col-sm-12 control-label">생년월일</label> 
					<div class="col-sm-12">
						<input type="text" id="userRegDate" name="userRegDate" class="form-control" value="${dto.userRegDate}" maxlength="13" readonly/>
					</div>
				</div>
				<div class="form-group mypage_total">
					<div class="col-sm-12 btn_area" >
						<input type="button" class="btn btn-primary" value="회원정보 수정" id="myUpdate" />
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