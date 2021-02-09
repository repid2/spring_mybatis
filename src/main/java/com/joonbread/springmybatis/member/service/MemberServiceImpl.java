package com.joonbread.springmybatis.member.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.joonbread.springmybatis.member.repository.MemberDAO;
import com.joonbread.springmybatis.member.repository.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService{

	@Inject
	private MemberDAO memberdao;
	
	@Override
	public List<MemberDTO> memberList() {
		return memberdao.memberList();
	}

	@Override
	public int memberCnt() {
		return memberdao.memberCnt();
	}

	@Override
	public void insertMember(MemberDTO dto) {
		memberdao.insertMember(dto);
		
	}

	@Override
	public boolean checkPw(String user_id, String user_pw) {
		return memberdao.checkPw(user_id, user_pw);
		
	}
	
	@Override
	public MemberDTO viewMember(String user_id) {
		return memberdao.viewMember(user_id);
	}

	@Override
	public void updateMember(MemberDTO dto) {
		memberdao.updateMember(dto);
		
		
	}

	@Override
	public void deleteMember(String user_id) {
		memberdao.deleteMember(user_id);
		
	}

	

}
