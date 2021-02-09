package com.joonbread.springmybatis.member.repository;

import java.util.List;

public interface MemberDAO {

	public List<MemberDTO> memberList();
	public int memberCnt();
	public void insertMember(MemberDTO dto);
	public boolean checkPw(String user_id, String user_pw);
	public MemberDTO viewMember(String user_id);
	public void updateMember(MemberDTO dto);
	public void deleteMember(String user_id);
	
	
}
