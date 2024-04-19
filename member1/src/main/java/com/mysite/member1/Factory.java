package com.mysite.member1;

import com.mysite.member1.repository.MemberDao;
import com.mysite.member1.service.ChangePasswordService;
import com.mysite.member1.service.MemberRegisterService;

public class Factory {
	private Factory() {}
	private static Factory instance = new Factory();
	public static Factory newInstance() {
		return instance;
	}
	
	private MemberRegisterService regSvc = new MemberRegisterService();
	private ChangePasswordService changePwdSvc = new ChangePasswordService();
	private MemberDao memberDao = new MemberDao();
	
	public MemberRegisterService getMemberRegisterService() {
		return regSvc;
	}
	
	public ChangePasswordService getChangePasswordService() {
		return changePwdSvc;
	}
	
	public MemberDao getMemberDao() {
		return memberDao;
	}
}
