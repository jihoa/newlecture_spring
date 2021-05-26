package com.newlecture.web.controller.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@RestController("apiNoticeController")						
@RequestMapping("/api/notice/") 		//notice에 대한 데이터의 목록을 주는 식이다.
public class NoticeController {
	
	@Autowired											// 2. Autrowired해서 ioc에서 꺼내서 
	private NoticeService service;						// 1.이상태에서 데이터를 요청하기위해서 서비스객체를 가져와 볼것이다.
	
	@RequestMapping("list")
	public List<Notice> list() throws ClassNotFoundException, SQLException {
		
		List<Notice> list =service.getList(1, "title", "");	// 3. list라는 녀석으로 Notice를 가져올것이다.
	
		return list;			//@RestController는 여기에 반환하는 값을 반환하게된다.
	}
}
