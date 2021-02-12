package com.joonbread.springmybatis.member.repository;

import java.util.List;

public interface MemberDAO {

	public List<MemberDTO> memberList();
	public int memberCnt();
	public void insertMember(MemberDTO dto);
	public boolean checkPw(String userId, String userPw);
	public MemberDTO viewMember(String userId);
	public void updateMember(MemberDTO dto);
	public void deleteMember(String userId);
	
	
}
