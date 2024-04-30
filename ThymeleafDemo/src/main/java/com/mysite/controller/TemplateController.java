package com.mysite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")//클래스에 붙일땐 requestmapping만 가능
public class TemplateController {
	@GetMapping("/fragment")
	public String template() {
		return "template/fragment/fragmentMain";
	}
	
	@GetMapping("/layout")
	public String layout(){
		return "template/layout/layoutMain";
	}
	
	@GetMapping("/layoutExtend")
	public String layoutExtend(){
		return "template/layoutExtend/layoutExtendMain";
	}
}
