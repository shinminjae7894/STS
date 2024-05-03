package com.mysite;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataController {
	@ResponseBody 
	@GetMapping("/data/test1")
	public String getTest1() {
		String data ="{\"name\":\"John\", \"age\":20}";
		return data;
	}
	
	static class User {
		private Long id;
		private String name;
		private int age;
		
		public User(Long id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}
		
		public Long getId() { return id;}
		public void setId(Long id) { this.id = id;}
		
		public String getName() {return name;}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	}
	
	@ResponseBody
	@GetMapping("/data/users")
	public List<User> getAllUsers(){
		ArrayList<User> userList = new ArrayList<>();
		
		userList.add(new User(1L, "John", 30));
		userList.add(new User(2L, "Alice", 35));
		userList.add(new User(3L, "Bob", 40));
		
		return userList;
	}
}
