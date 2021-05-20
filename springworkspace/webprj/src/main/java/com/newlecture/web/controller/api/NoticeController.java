package com.newlecture.web.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("apiNoticeController")						
@RequestMapping("/api/notice/") 		//notice에 대한 데이터의 목록을 주는 식이다.
public class NoticeController {
	
	
	@RequestMapping("list")
	public String list() {
		
		
		
		
		return "공지사항 list";			//@RestController는 여기에 반환하는 값을 반환하게된다.
	}
}
