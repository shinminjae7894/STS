package com.mysite.member1.service;

import com.mysite.member1.model.Member;
import com.mysite.member1.repository.MemberDao;

public class ChangePasswordService {
	private MemberDao memberDao = new MemberDao();

	public void changePassword(String email, String oldPass, String newPass) {

		Member member = memberDao.selectByEmail(email);

		//해당 이메일이 존재하는지 여부 검사
		if (memberDao.selectByEmail(email) == null) {
			return;
		}

		//현재 비밀번호가 맞는지 검사

		if (!member.getPassword().equals(oldPass)) {
			System.out.println("현재 비밀번호가 맞지 않습니다.");
			return;
		}

		member.setPassword(newPass);
		memberDao.update(member);

	}

}