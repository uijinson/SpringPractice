package com.uijin.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uijin.web.entity.Notice;
import com.uijin.web.service.NoticeService;
@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	public String list(@RequestParam(name="p",defaultValue = "1") String page) throws ClassNotFoundException, SQLException {
//		List<Notice> list = noticeService.getList(1, "title", "");
		System.out.println("page"+page);
		return "notice.list";
	}
	@RequestMapping("detail")
	public String detail() {
		
		return "notice.detail";
	}
}
