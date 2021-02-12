$(document).ready(function(){
	
	/* 쿠키 관련 */
	// 쿠키 생성
	function setCookie(cookieName, value, exdays){
		   var exdate = new Date();
		   exdate.setDate(exdate.getDate() + exdays);
		   var cookieValue = escape(value) + ((exdays==null) ? "" : "; expires=" + exdate.toGMTString());
		   document.cookie = cookieName + "=" + cookieValue;
		}

	// 쿠키 삭제
	function deleteCookie(cookieName){
	   var expireDate = new Date();
	   expireDate.setDate(expireDate.getDate() - 1);
	   document.cookie = cookieName + "= " + "; expires=" + expireDate.toGMTString();
	}

	// 쿠키 가져오기
	function getCookie(cookieName) {
	   cookieName = cookieName + '=';
	   var cookieData = document.cookie;
	   var start = cookieData.indexOf(cookieName);
	   var cookieValue = '';
	   if(start != -1){
	      start += cookieName.length;
	      var end = cookieData.indexOf(';', start);
	      if(end == -1)end = cookieData.length;
	      cookieValue = cookieData.substring(start, end);
	   }
	   return unescape(cookieValue);
	}
	
	/* 로그인 페이지 */
	
	// 로그인 페이지 쿠키 설정 확인
	if(getCookie("userId") && getCookie("userPw") && getCookie("cookieChk")){
		$("#userId").val(userId);
		$("#userPw").val(userPw);
		$("#cookieChk").prop("checked",true);
		
	}
	
	// 쿠키 체크여부
	$("#cookieChk").click(function(){
		if($("#cookieChk").prop("checked")){
			$("#cookieChk").val("y");
		}else{
			$("#cookieChk").val("n");
		}
	});
	

	
	// 로그인 버튼 클릭  
	$("#login_btn").click(function(){
		var userId = $("#userId").val();
		var userPw = $("#userPw").val();
		
		// 로그인 확인 
		$.ajax({
			url : "member/checkPw.do",
			type : "post",
			data : {userId : userId, userPw : userPw},
     		async: false,
			datatype: "text",
			success: function(data){
				if(data == "fail"){
					alert("로그인 실패했습니다. 다시 입력해주세요.");
					$("#userPw").val("");
					
					
				}else{
				
					// 로그인 시 쿠키 확인
					if($("#cookieChk").is(":checked")){
						setCookie("userId",$("#userId").val(),60);
						setCookie("userPw",$("#userPw").val(),60);
						setCookie("cookieChk",$("#cookieChk").val(),60);
						
					}else{
						deleteCookie("userId");
						deleteCookie("userPw");
						deleteCookie("cookieChk");
					}
					
					document.loginfrm.action = "member/view.do";
					document.loginfrm.submit();
					
					
					
				}
			},error :function(data){

				alert("로그인 실패했습니다. 다시 입력해주세요.");
				$("#userPw").val("");
				
			}
			
			
		});
		
	});
	
	
	

	
});