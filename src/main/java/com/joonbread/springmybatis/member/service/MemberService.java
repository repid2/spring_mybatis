package com.joonbread.springmybatis.member.service;

import java.util.List;

import com.joonbread.springmybatis.member.repository.MemberDTO;

public interface MemberService {

	public List<MemberDTO> memberList();

	public int memberCnt();

	public void insertMember(MemberDTO dto);

	public boolean checkPw(String userId, String userPw);

	public MemberDTO viewMember(String userId);

	public void updateMember(MemberDTO dto);

	public void deleteMember(String userId);

}
