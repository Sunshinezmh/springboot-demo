package com.dmsdbj.team.springbootdemo.controller.springMVC.async;
import lombok.Data;

import	java.net.DatagramPacket;

/**
 * @Classname JavaBean
 * @Auther sunshinezhang
 * @Date 2019/11/4 10:21
 */

@Data
public class JavaBean {
	private String foo;

	private String fruit;

	public JavaBean(String foo,String fruit){
		this.foo=foo;
		this.fruit = fruit;
	}
}
