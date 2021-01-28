package com.uijin.web.controller.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uijin.web.entity.Notice;
import com.uijin.web.service.NoticeService;

@RestController("apiNoticeController")
@RequestMapping("/api/notice/")
public class NoticeController {
	@Autowired
	NoticeService noticeservice;
	
	
	
	@RequestMapping("list")
	public List<Notice> getlist() throws ClassNotFoundException, SQLException {
	List<Notice> list= noticeservice.getList(1, "title", ""); 
		return list;
}}
