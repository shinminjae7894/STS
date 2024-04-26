package controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.User;

@Controller
public class SecondController {
	@RequestMapping("/first")
	protected String firstPage() {
		return "/WEB-INF/views/first.jsp";
	}
	
	@RequestMapping("/second")
	public ModelAndView secondPage(HttpServletRequest req) {
		String p1 = req.getParameter("p1");
		String p2 = req.getParameter("p2");
		
		ModelAndView mv = new ModelAndView("/WEB-INF/views/second.jsp");
		mv.addObject("param1", p1);
		mv.addObject("param2", p2);
		
		return mv;
	}
	
	//@RequestMapping(value="/third", method=RequestMethod.POST)
	/*
	@PostMapping("/third")
	public String thirdPage(HttpServletRequest req) throws UnsupportedEncodingException {
		req.setCharacterEncoding("utf-8");
		
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String point = req.getParameter("point");
		
		System.out.println(name + ", " + age + ", " + point);
		return "/WEB-INF/views/third.jsp";
	}
	*/
	
	@PostMapping("/third")
	//public String thirdPage(String name, int age, double point) {
	public String thirdPage(@RequestParam("name") String irum, 
							@RequestParam int age, 
							@RequestParam double point) {
		System.out.println(irum + ", " + age + ", " + point);
		return "/WEB-INF/views/third.jsp";
	}
	
	/*
	@GetMapping("/fourth")
	public String fourthPage(String name, int age, double point, Model model) {
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setPoint(point);
		
		model.addAttribute("user", user);
		
		return "/WEB-INF/views/fourth.jsp";
	}
	*/
	
	/*
	@GetMapping("/fourth")
	public ModelAndView fourthPage(String name, int age, double point) {
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setPoint(point);
		
		ModelAndView mv = new ModelAndView("/WEB-INF/views/fourth.jsp");
		mv.addObject("user", user);
		
		return mv;
	}
	*/
	
	@GetMapping("/fourth")
	public ModelAndView fourthPage(@ModelAttribute User user, //어노테이션 생략가능(어떤 어노테이션인지 보여주기위함)
									@RequestParam String chk) {	
		ModelAndView mv = new ModelAndView("/WEB-INF/views/fourth.jsp");
		mv.addObject("user", user);
		mv.addObject("chk", chk);
		return mv;
	}
	
	@GetMapping("/fifth")
	public ModelAndView fifthPage(ModelAndView mv) {
		List list = new ArrayList();
		list.add("김치찌개");
		list.add("된장찌개");
		list.add("차돌박이");
		list.add("갈비");
		
		Map map = new HashMap<String, String>();
		map.put("f1", "사과");
		map.put("f2", "포도");
		map.put("f3", "수박");
		
		List listDay = new ArrayList<String>();
		listDay.add("월요일");
		listDay.add("화요일");
		listDay.add("수요일");
		listDay.add("목요일");
		
		List listMovie = new ArrayList<String>();
		listMovie.add("파묘");
		listMovie.add("어벤져스");
		listMovie.add("쿵부팬더");
		
		Map maps = new HashMap<String, List>();
		maps.put("day", listDay);
		maps.put("movie", listMovie);
		
		mv.setViewName("/WEB-INF/views/fifth.jsp");
		mv.addObject("foods", list);
		mv.addAllObjects(map);
		mv.addAllObjects(maps);
		
		return mv;
	}
}








