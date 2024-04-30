package com.mysite.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/basic")
public class BasicController {
	
	@GetMapping("/text-basic")
	public String textBasic( Model model ) {
		model.addAttribute("data1", "Hello Spring");
		model.addAttribute("data2", "<b>Hello Spring</b>");
		
		return "basic/text-basic";
	}
	
	@GetMapping("/variable")
	public String variable( Model model ) { 
		User userA = new User("userA", 20);
		User userB = new User("userB", 30);
		
		List<User> list = new ArrayList<>(Arrays.asList(userA, userB) );
		
		Map<String, User> map = new HashMap<>();
		map.put("a", userA);
		map.put("b", userB);
		
		model.addAttribute("userA", userA );
		model.addAttribute( "list", list);
		model.addAttribute( "map", map);
		return "basic/variable";
	}
	

	
	@Data // 롬복 어노테이션
	@RequiredArgsConstructor
	static class User {
		private final String userName;
		private final int age;		
	}
	
	
	
	@GetMapping("/basic-objects")
	public String basicObjects( HttpServletRequest req, HttpSession session ) {
		req.setAttribute("userName", "홍길동");
		session.setAttribute("sessionData", "Hello!! session");
		
		return "basic/basic-objects";
	}

	
	@Component("helloBean") // 클래스를 스프링 컨테이너가 관리하는 빈(Bean)으로 등록하는 역할
	static class HelloBean { // 따로 지정하지 않으면 클래스 이름이 id
		public String hello( String data ) {
			return "Hello " + data;
		}
	}
	
	
	@GetMapping("/date")
	public String tate( Model model ) {
		model.addAttribute("localDateTime", LocalDateTime.now() );
		
		return "basic/date";
	}
	
	
	
	@GetMapping("/link")
	public String link( Model model ) {
		model.addAttribute("path1", "board");
		model.addAttribute("path2", "write");
		
		model.addAttribute("param1", "data1");
		model.addAttribute("param2", "data2");
		
		return "basic/link";
	}
	
	
	@GetMapping("/literal")
	public String literal(Model model) {
		model.addAttribute("data", "hello~~~~");
		
		return "basic/literal";
	}
	
	
	
	@GetMapping("/operation")
	public String operation(Model model) {
		model.addAttribute("nulldata", null);
		model.addAttribute("data", "hello!~!~!spring");
		
		return "basic/operation";
	}
	
	
	
	
	@GetMapping("/attribute")
	public String attribute() {
		
		return "basic/attribute";
	}
	
	@GetMapping("/each")
	public String each(Model model) {
		addUsers(model);
		return "basic/each";
	}
	
	private void addUsers(Model model) {
		List<User> users = Arrays.asList(new User("userA", 10),
				new User("userB", 20), new User("userC", 30));
		
		model.addAttribute("users", users);
	}
	
	@GetMapping("/condition")
	public String condition(Model model) {
		addUsers(model);
		return "basic/condition";
	}
	
	@GetMapping("/comments")
	public String comments(Model model) {
		model.addAttribute("data", "Hello~~ Spring");
		return "basic/comments";
	}
	
	@GetMapping("/block")
	public String block(Model model) {
		addUsers(model);
		return "basic/block";
	}
	
	@GetMapping("/javascript")
	public String javascript(Model model) {
		model.addAttribute("user", new User("홍길동",20));
		addUsers(model);
		return "basic/javascript";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
