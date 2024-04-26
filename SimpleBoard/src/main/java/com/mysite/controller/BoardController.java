package com.mysite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mysite.domain.Board;
import com.mysite.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	public BoardService boardService;
	
	@GetMapping("/list")
	public ModelAndView list() throws Exception {
		List<Board> list = boardService.getList();
		
		ModelAndView mv = new ModelAndView("board/list");
		mv.addObject("list", list);
		return mv;
	}
	
	@GetMapping("/write")
	public String write() {
		return "board/write";
	}
	
	@PostMapping("/write")
	public String wirteOk(@ModelAttribute Board board) throws Exception{
		boardService.write(board);
		return "redirect:/board/list";
	}
	
	@GetMapping("/read")
	public String read(int bNo, Model model) throws Exception{
		Board board = boardService.read(bNo);
		model.addAttribute(board);
		return "board/read";
	}
}
