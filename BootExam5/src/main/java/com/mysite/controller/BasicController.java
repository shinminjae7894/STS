package com.mysite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasicController {
	
	/*
	@GetMapping("/basic/text-basic")
	public String textBasic(Model model) {
		String data1 = "Hello Spring";
		
		model.addAttribute("data1", data1);
		
		return "/basic/text-basic";
	}
	*/
	
	@GetMapping("/basic/text-basic")
	public ModelAndView textBasic(ModelAndView mv) {
		String data1 = "Hello Spring";
		
		mv.addObject(data1, mv);
		mv.setViewName("/basic/text-basic");
		return mv;
	}
}
