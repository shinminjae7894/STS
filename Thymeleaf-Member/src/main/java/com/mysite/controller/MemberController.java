package com.mysite.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mysite.domain.Member;
import com.mysite.repository.DataMappingInterface;


@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	DataMappingInterface dao1;
	
//	@Autowired
//	private MemberDao dao;
	
	@GetMapping("/list")
	public String list(Model model) {
		
		List<Member> dtoList = dao1.getSelectAll();
		model.addAttribute("dtoList",dtoList);
		return "member/list";
	}
	
	@GetMapping("/insert")
	public String insert1() { 
		return "member/insert";
	}
	
	@PostMapping("/insert")
	public String insert(Member member, Model model) { 
		int result = dao1.insertMember(member);
		
		if(result > 0) {
			return "redirect:/member/list";
		}
		else {
			model.addAttribute("message", "입력 오류 입니다.");
			return "member/insert";
		}
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam(name = "num")int num ) {
		
		dao1.deleteMember(num);
		return "redirect:/member/list";
	}
	
	@GetMapping("/update")
	public void update() {
	
	}
	
	@PostMapping("/update")
	public String update(Member member) {
		dao1.updateData(member);
		
		return "redirect:/member/list";
	}
}
