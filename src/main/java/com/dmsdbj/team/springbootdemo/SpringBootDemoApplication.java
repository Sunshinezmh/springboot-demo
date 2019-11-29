package com.dmsdbj.team.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@MapperScan(basePackages = "com.dmsdbj.team.springbootdemo.mapper*")
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
