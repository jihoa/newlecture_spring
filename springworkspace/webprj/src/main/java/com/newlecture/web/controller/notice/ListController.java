package com.newlecture.web.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;
import com.newlecture.web.service.jdbc.JDBCNoticeService;

public class ListController implements Controller{

	private NoticeService noticeService;
	
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView("notice.list");				
//		mv.setViewName("/WEB-INF/view/notice/list.jsp");					//set해서 view에대한 정보를담는다. index.jsp
		List<Notice> list=noticeService.getList(1, "TITLE", "");
		mv.addObject("list",list);		//모델로 리스트가 전달되었다.
		
		return mv;	
	}

}
