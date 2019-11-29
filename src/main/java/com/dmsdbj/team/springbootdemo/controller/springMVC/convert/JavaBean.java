package com.dmsdbj.team.springbootdemo.controller.springMVC.convert;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Classname JavaBean
 * @Auther sunshinezhang
 * @Date 2019/11/4 11:57
 */
@Data
public class JavaBean {
	private Integer primitive;

	@DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
	private Date date;

	@MaskFormat("(###) ###-####")
	private String masked;

	private List<Integer> list;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private List<Date> formattedList;

	private Map<Integer, String> map;

	private NestedBean nested;


	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("JavaBean");

		if (primitive != null) {
			sb.append(" primitive=").append(primitive);
		}
		if (date != null) {
			sb.append(" date=").append(date);
		}  if (masked != null) {
			sb.append(" masked=").append(masked);
		}
		if (list != null) {
			sb.append(" list=").append(list);
		}
		if (formattedList != null) {
			sb.append(" formattedList=").append(formattedList);
		}
		if (map != null) {
			sb.append(" map=").append(map);
		}
		if (nested != null) {
			sb.append(" nested=").append(nested);
		}
		return sb.toString();
	}
}
