package com.joonbread.springmybatis.member.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.joonbread.springmybatis.member.repository.MemberDTO;
import com.joonbread.springmybatis.member.service.MemberService;

@Controller
public class MemberController {

	// 기록 확인용
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Inject
	private MemberService memberService;
	
	// 로그인 페이지	>> 메인페이지를 원래 다른곳에 넣으려고 했으나, 임시로 member 컨트롤러에 작성
	@RequestMapping(value="/main.do")
	public String mainPage() {
		
		return "member/main";
	}

	// 로그인
	@RequestMapping(value = "/member/login.do", method=RequestMethod.POST )
	public String memberCheckPw(String userId, String userPw) {
		
		boolean result = memberService.checkPw(userId, userPw);
		
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
		System.out.println(list.size());
		
		int cnt = memberService.memberCnt();
		
		System.out.println(cnt);
		model.addAttribute("list", list);
		model.addAttribute("cnt",cnt);

		return "member/list";
	}

	// 회원 가입 페이지 이동
	@RequestMapping(value="/member/reg.do")
	public String memberReg() {
		
		return "member/reg";
	}
	
	// 회원 가입 진행
	@RequestMapping(value="/member/regUpdate.do", method=RequestMethod.POST)
	public String memberReg(MemberDTO dto) {
		
		memberService.insertMember(dto);
		
		logger.info("회원가입 성공");
		return "redirect:/main.do";
		
	}
	
	// 정보 작성 페이지
	@RequestMapping(value = "/member/write.do")
	public String memberWrite() {
		
		return "member/write";

	}

	// 회원 정보 삽입
	@RequestMapping(value= "/member/insert.do", method=RequestMethod.POST )
	public String memberInsert(@ModelAttribute MemberDTO dto) {
		
		//SimpleDateFormat format = new SimpleDateFormat("yyyymmdd");
		//Date date=  new Date();
		
		//String time = format.format(date);
		
		//dto.setUser_createDate(time);
		//dto.setUser_updateDate(time);
		
		
		memberService.insertMember(dto);
		logger.info("회원가입 성공");
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
