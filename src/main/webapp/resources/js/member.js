$(document).ready(function(){
	
	/* 회원 수정 버튼 */
	$("#myInfoUpdate").click(function(){
		
		document.mypagefrm.action = "/member/write.do";
		document.mypagefrm.submit();
	
	});
	
	/* 회원 삭제 버튼 */
	$("#myInfoDelete").click(function(){
	
		var del = confirm("계정을 삭제하시겠습니까? 삭제 시 되돌릴 수 없습니다.");
		
		if(del == true){
		
			document.mypagefrm.action="/member/delete.do";
			document.mypagefrm.submit();
		
		}else{
		
		}
	
	});

	// 비번 중복 체크
	function checkPwChk(){
		var pwd = $("#userPw").val();
		var pwchk = $("#userPwChk").val();
		
		if(pwd != pwchk){
			alert("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			$("#userPw").val("");
			$("#userPwChk").val("");
			$("#userPw").focus();
			return false;
		}else{

			//console.log('비번중복체크');
			
			return true;
		}
		
	}	// 비번 중복 체크

	// 수정 버튼 클릭 시 
	$("#myUpdate").click(function(){
		if(checkPwChk()){
			document.userModfrm.submit();
		}
		
		
	});


});