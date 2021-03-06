package com.joonbread.springmybatis.member.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.joonbread.springmybatis.member.repository.MemberDAO;
import com.joonbread.springmybatis.member.repository.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO memberdao;

	@Override
	public List<MemberDTO> memberList() {
		return memberdao.memberList();
	}

	@Override
	public void insertMember(MemberDTO dto) {
		memberdao.insertMember(dto);

	}

	@Override
	public int memberCnt() {
		return memberdao.memberCnt();
	}

	@Override
	public boolean checkPw(String userId, String userPw) {
		return memberdao.checkPw(userId, userPw);

	}

	@Override
	public MemberDTO viewMember(String userId) {
		return memberdao.viewMember(userId);
	}

	@Override
	public void updateMember(MemberDTO dto) {
		memberdao.updateMember(dto);

	}

	@Override
	public void deleteMember(String userId) {
		memberdao.deleteMember(userId);

	}

}
