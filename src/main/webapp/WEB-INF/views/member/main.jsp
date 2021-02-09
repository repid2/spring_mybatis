<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="member/login.do" method="post" id="login_frm">
			<div class="login_input">
				<div class="login_input2">
					<span><input type="text" id="user_id" name="user_id" id="user_id"/></label></span>
				</div>
			</div>
			<div class="login_input">
				<div class="login_input2">
					<span><input type="password" name="user_pw" id="user_pw"/></span>
				</div>
			</div>
			<div class="login_input">
				<div class="login_btn">
					<input type="submit" value="로그인" id="login_submit" />
					<input type="reset" value="초기화" />
				</div>
			</div>
			
		</form>
	</div>

</body>
</html>