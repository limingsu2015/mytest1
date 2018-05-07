package com.ailhuy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello.do")
	public ModelAndView  hello(){
		ModelAndView mView=new ModelAndView();
		
		mView.addObject("hello", "世界");
		
		mView.setViewName("hello");
		return mView;
	}
	@RequestMapping("/hello1.do")
	public String  hello1(Model model){
		model.addAttribute("hello", "世界1");
		
		return "hello";
	}
}
