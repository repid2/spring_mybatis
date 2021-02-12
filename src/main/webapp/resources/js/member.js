$(document).ready(function(){
	
	/* 회원 수정 버튼 */
	$("#myInfoUpdate").click(function(){
		
		document.mypagefrm.action = "/member/write.do";
		document.mypagefrm.submit();
	
	});
	
	/* 회원 삭제 버튼 */


});