package com.greedy.erp_bomb.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member")
public class MemberController {
		
	@GetMapping("/login")
	public void memberLogin() { }
	
	@PostMapping("/login")
	public ModelAndView loginSuccess(ModelAndView mv) {
		System.out.println("여기 오냐?");
		
		mv.setViewName("redirect:/main/main");
		
		return mv;
	}
	
}
