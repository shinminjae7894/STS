package com.mysite.controller;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.domain.Member;
import com.mysite.domain.RegisterRequest;
import com.mysite.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/login")//요청이름과 페이지이름이 같은경우 생략가능
	public void login() {}
	
	@PostMapping("/login")
	public String loginOk(String id, String pwd, HttpServletRequest req) throws Exception {
		String msg = URLEncoder.encode("id 또는 패스워드가 일치하지 않습니다", "utf-8");

		//try {
			Member member = memberService.selectwithPass(id, pwd);
			
			HttpSession session = req.getSession();
			session.setAttribute("id", member.getEmail());
		//}
		//catch(Exception err) {
		//	return "redirect:/member/login?msg=" + msg;
		//}
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/add")
	public String step1() {
		return "member/step1";
	}

	@PostMapping("/step2")
	public String step2(@RequestParam(value="agree", defaultValue="false") boolean agree) {
		if(!agree) {
			return "member/step1";
		}
		
		return "member/step2";
	}
	
	@PostMapping("/step3")
	public String step3(@ModelAttribute RegisterRequest dto, HttpServletRequest req) throws Exception {
		memberService.registerMember(dto);
		req.getSession().setAttribute("id", dto.getEmail());
		return "member/step3";
	}
}
