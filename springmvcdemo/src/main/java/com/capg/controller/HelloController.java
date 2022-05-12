package com.capg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capg.Model.Student;
@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView sayHello()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		
		return mv;
	}
	@RequestMapping("/getStudentData")
	public ModelAndView getData()
	{
		ModelAndView mv = new ModelAndView();
		Student stu = new Student();
		stu.setStid(100);
		stu.setStname("brunda");
		
		mv.addObject("capg", stu);
		
		mv.setViewName("retrieve");	
		
		
		return mv;
	}


}
