package com.uijin.web.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Builder
public class Notice {
	private int id;
	private String title;
	private String writerId;
	private Date regDate;
	private String content;
	private int hit;
	private String files;
}
