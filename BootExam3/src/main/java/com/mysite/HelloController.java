package com.mysite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //형식을 갖추지않고 내용만 전달, view의 역할을 함(controller 자체를 view로 만들어줌)
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return "<h1>컨트롤러 실행</h1>";
	}
	
	
}


