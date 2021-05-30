package com.newlecture.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("adminNoticeController")// 이걸사용하면 이렇게 바뀜<bean name="adminNoticeController" class="com.newlecture.web.controller.admin.board.NoticeController"/>
@RequestMapping("/admin/board/notice")
public class NoticeController {	//<bean name="noticeController" class="com.newlecture.web.controller.admin.board.NoticeController"/>

	@RequestMapping("list")
	public String list() {
		return "";
	}
	
	@RequestMapping("reg")
	@ResponseBody
	public String reg() {
		return "reg";
	}
	
	@RequestMapping("edit")
	public String edit() {
		return "";
	}
	
	@RequestMapping("del")
	public String del() {
		return "";
	}
	
	
}
