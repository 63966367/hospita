package com.lb.entity;

import lombok.Data;
import org.beetl.sql.core.annotatoin.Table;

import java.util.Date;


@Data
@Table(name="lb_news")
public class LbNews   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_content = "content";
	public static final String ALIAS_title = "title";
	public static final String ALIAS_create_time = "create_time";
	
	private Integer id ;
	private String content ;
	private String title ;
	private Date createTime ;

}
