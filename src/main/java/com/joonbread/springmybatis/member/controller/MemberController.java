package com.joonbread.springmybatis.member.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.joonbread.springmybatis.member.repository.MemberDTO;
import com.joonbread.springmybatis.member.service.MemberService;

@Controller
@SessionAttributes("sessionId")
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

	// 로그인 확인 
	@RequestMapping(value = "/member/checkPw.do", method=RequestMethod.POST )
	@ResponseBody
	public String memberCheckPw(HttpSession session, String userId, String userPw) {
		
		// 반환 값
		String msg = "fail";
		
		// 로그인 여부
		boolean result = memberService.checkPw(userId, userPw);
		
		// 로그인 성공 시 
		if(result == true) {
			// 로그인한 아이디의 정보
			MemberDTO dto = memberService.viewMember(userId);
			
			// 세션에 유저 정보 저장
			if(session.getAttribute("userId") != null) {
				session.removeAttribute("userId");
			}
			
			session.setAttribute("userId", userId);
			msg = "login";
			
		}
		
		return msg;
	}
	
	// 회원목록 출력
	@RequestMapping(value = "/member/list.do") 
	public String memberList(Model model) {
	  
		List<MemberDTO> list = memberService.memberList();
		int cnt = memberService.memberCnt();
		  
		model.addAttribute("list", list);
		model.addAttribute("cnt",cnt);
		  
		return "member/list"; 
	
	}
	
	// 회원정보 출력
	@RequestMapping(value = "/member/view.do" )
	public String memberView(HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession();
		
		MemberDTO dto = memberService.viewMember((String)session.getAttribute("userId"));
		
		model.addAttribute("dto",dto);
		
		
		return "member/view";
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
	public String memberWrite(HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession();
		
		MemberDTO dto = memberService.viewMember((String)session.getAttribute("userId"));
		
		model.addAttribute("dto",dto);
		
		return "member/write";

	}

	// 회원 정보 작성
	@RequestMapping(value= "/member/insert.do", method=RequestMethod.POST )
	public String memberInsert(@ModelAttribute MemberDTO dto, HttpSession session, Model model) {
		
		String userId = (String)session.getAttribute("userId");
		
		if(userId.equals("")) {
			// logger.info("회원 정보 수정");
			// model.addAttribute("dto",dto);
			
			// return "redirect:/member/view.do";
		}
		logger.info("회원 가입");
		
		return "redirect:/main.do";
		
	}

	// 회원 정보 수정
	@RequestMapping("/member/update.do")
	public String memberUpdate(@ModelAttribute MemberDTO dto) {
		
		System.out.println(dto.getUserEmail());
		System.out.println(dto.getUserPhone());
		
		memberService.updateMember(dto);

		return "redirect:/member/view.do";

	}

	// 삭제
	@RequestMapping("/member/delete.do")
	public String memberDelete(@ModelAttribute MemberDTO dto) {
		
		memberService.deleteMember(dto.getUserId());
		
		return "redirect:/main.do";
	}
	
	
	

}
