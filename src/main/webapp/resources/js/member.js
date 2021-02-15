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


});