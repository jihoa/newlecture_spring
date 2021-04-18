package com.newlecture.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
 

public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception { //SpringFramework에 웹이라는 것을 확인하고 import하도록하자
		// TODO Auto-generated method stub
		System.out.println("index controller");
		ModelAndView mv = new ModelAndView("index");				
		mv.addObject("data","Hello Spring MVC~");		//객체를 만든다. data,Hello Spring MVC를 담는다.
//		mv.setViewName("/WEB-INF/view/index.jsp");					//set해서 view에대한 정보를담는다. index.jsp
		return mv;		//반환하는것은 무엇이냐 Dispatcher기능은 빠졌고 스프링이 제공하고있으니까  디스패처를 하기위한 모델엔 ModelandView를 제공해 주는것(담아서 주는것)이다.
	}		

}
