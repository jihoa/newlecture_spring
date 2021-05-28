package com.newlecture.web.controller.customer;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newlecture.web.service.NoticeService;

@Controller					//객체화하기위해서 꼭 써야한다.
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	public String list(@RequestParam(value = "p", defaultValue ="1" ) Integer page) throws ClassNotFoundException, SQLException {
//		String p = request.getParameter("p");
		System.out.println("page:"+page);
		
//		List<Notice> list=noticeService.getList(1, "TITLE", "");
		return "notice.list";
	}
	
	@RequestMapping("detail")	
	public String detail() {
		return "notice.detail";
	}
}
