package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HomeController{
	@RequestMapping("/index")
	public String index() {
		return "root.index";
	}
	@RequestMapping("/help")
	public void help() {
		System.out.println("asdfsdf");
	}

//public class IndexController implements Controller {

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception { 
//		// TODO Auto-generated method stub
//		ModelAndView mv = new ModelAndView("root.index");				
//		mv.addObject("data","Hello Spring MVC~");
//		//mv.setViewName("/WEB-INF/view/index.jsp");				
//		return mv;	
//	}		

}
