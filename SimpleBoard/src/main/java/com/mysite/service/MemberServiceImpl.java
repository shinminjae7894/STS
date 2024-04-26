package com.mysite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysite.domain.Member;
import com.mysite.domain.RegisterRequest;
import com.mysite.persistance.MemberDao;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDao memberDao;

	@Override
	public void registerMember(RegisterRequest dto)  {
		
		try {
			memberDao.registerMember(dto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("in MemberService");
		}
		
	}

	@Override
	public Member selectMember(String email) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member selectwithPass(String email, String pw) throws Exception {
		Member member = memberDao.selectwithPass(email, pw);
		return member;
	}

}
