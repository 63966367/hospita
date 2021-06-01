package com.lb.entity;

import lombok.Data;
import org.beetl.sql.core.annotatoin.Table;

import java.math.BigDecimal;


@Data
@Table(name="lb_seek")
public class LbSeek   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_patient_id = "patient_id";
	public static final String ALIAS_days = "days";
	public static final String ALIAS_describes = "describes";
	public static final String ALIAS_drugs = "drugs";
	public static final String ALIAS_illname = "illname";
	public static final String ALIAS_options = "options";
	public static final String ALIAS_price = "price";
	
	private Integer id ;
	private Integer patientId ;
	private Integer appointmentId ;
	private Integer days ;
	private String describes ;
	private String drugs ;
	private String illname ;
	private String options ;
	private BigDecimal price ;

	private String patientName;
	private String doctorName;
	
}
