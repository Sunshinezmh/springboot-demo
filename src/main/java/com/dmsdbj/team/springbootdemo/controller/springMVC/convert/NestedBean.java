package com.dmsdbj.team.springbootdemo.controller.springMVC.convert;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @Classname NestedBean
 * @Auther sunshinezhang
 * @Date 2019/11/4 11:58
 */

@Data
public class NestedBean {
	private String foo;
	private List<NestedBean> list;

	private Map<String, NestedBean> map;

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("NestedBean");
		if (foo != null) {
			sb.append(" foo=").append(foo);
		}
		if (list != null) {
			sb.append(" list=").append(list);
		}
		if (map != null) {
			sb.append(" map=").append(map);
		}
		return sb.toString();
	}
}
