package com.joonbread.springmybatis.member.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.joonbread.springmybatis.member.repository.MemberDTO;
import com.joonbread.springmybatis.member.service.MemberService;

@Controller
public class MemberController {

	// 기록 확인용
	// private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Inject
	private MemberService memberService;
	
	// 로그인 페이지	>> 메인페이지를 원래 다른곳에 넣으려고 했으나, 임시로 member 컨트롤러에 작성
	@RequestMapping(value="/main.do")
	public String mainPage() {
		
		return "member/main";
	}

	// 로그인
	@RequestMapping(value = "/member/login.do", method=RequestMethod.POST )
	public String memberCheckPw(String user_id, String user_pw) {
		
		boolean result = memberService.checkPw(user_id, user_pw);
		
		if(result == true) {
			// System.out.println("맞음");
			return "redirect:/member/list.do";
		}
		
		// System.out.println("틀림");
		return "redirect:/main.do";
		
	}
	
	// 회원목록 출력
	@RequestMapping(value = "/member/list.do")
	public String memberList(Model model) {

		List<MemberDTO> list = memberService.memberList();
		
		model.addAttribute("list", list);

		return "member/list";
	}

	// 회원 총 인원수 출력
	@RequestMapping(value = "/member/cnt.do")
	public int memberCnt() {
		int cnt = memberService.memberCnt();
		
		return cnt;

	}

	// 정보 작성 페이지
	@RequestMapping(value = "/member/write.do")
	public String memberWrite() {

		return "member/write";

	}

	// 회원 정보 삽입
	@RequestMapping("/member/insert.do")
	public String memberInsert(@ModelAttribute MemberDTO dto) {

		memberService.insertMember(dto);

		return "redirect:/member/list.do";

	}

	// 회원 정보 수정
	@RequestMapping("/member/update.do")
	public String memberUpdate(@ModelAttribute MemberDTO dto) {
		memberService.updateMember(dto);

		return "redirect:/member/list.do";

	}

	// 삭제
	@RequestMapping("/member/delete.do")
	public String memberDelete(String user_id) {
		
		memberService.deleteMember(user_id);
		
		return "redirect:/member/list.do";
	}
	
	
	

}
