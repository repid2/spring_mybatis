package com.joonbread.springmybatis.member.repository;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sqlSession;
	
	private final static String namespace = "com.joonbread.springmybatis.member.repository.MemberDAO";
	
	@Override
	public List<MemberDTO> memberList() {
		List<MemberDTO> list = sqlSession.selectList(namespace+".memberList");
		
		return list;
	}
	
	@Override
	public int memberCnt() {
		
		return sqlSession.selectOne(namespace+".memberCnt");
	}

	@Override
	public boolean checkPw(String user_id, String user_pw) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("user_id", user_id);
		map.put("user_pw", user_pw);
		
		//System.out.println(user_id);
		//System.out.println(user_pw);
		
		int result = sqlSession.selectOne(namespace+".checkPw",map);
		if(result == 1)
			return true;
		else
			return false;
		
		
	}
	
	@Override
	public void insertMember(MemberDTO dto) {
		sqlSession.insert(namespace+".insertMember");
	}

	@Override
	public MemberDTO viewMember(String user_id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".viewMember",user_id);
	}

	@Override
	public void updateMember(MemberDTO dto) {
		sqlSession.update(namespace+".updateMember",dto);
		
	}

	@Override
	public void deleteMember(String user_id) {
		sqlSession.delete(namespace+".deleteMember", user_id);
		
	}



	
	
}