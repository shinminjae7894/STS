package com.mysite.persistance;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysite.domain.Member;
import com.mysite.domain.RegisterRequest;

@Repository
public class MemberDaoImpl implements MemberDao{
	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPACE="com.mysite.memberMapper";
	
	@Override
	public void registerMember(RegisterRequest dto) {
		try {
			sqlSession.insert(NAMESPACE + ".registerMember", dto);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("in MemberDao");
		}
	}

	@Override
	public Member selectMember(String email) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member selectwithPass(String email, String pw) throws Exception {
		RegisterRequest dto = new RegisterRequest();
		dto.setEmail(email);
		dto.setPassword(pw);
		
		return sqlSession.selectOne(NAMESPACE + ".selectWithPass", dto);
	}

}
