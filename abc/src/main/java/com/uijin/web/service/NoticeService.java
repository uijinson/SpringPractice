package com.uijin.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.uijin.web.entity.Notice;

public interface NoticeService {
	public List<Notice> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;
	public int getCount() throws ClassNotFoundException, SQLException;
	public int insert(Notice notice) throws SQLException, ClassNotFoundException;
	public int update(Notice notice) throws SQLException, ClassNotFoundException;
	public int delete(int id) throws ClassNotFoundException, SQLException;
}
