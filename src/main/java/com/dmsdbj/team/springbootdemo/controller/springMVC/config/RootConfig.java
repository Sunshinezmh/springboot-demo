package com.dmsdbj.team.springbootdemo.controller.springMVC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.security.web.servlet.support.csrf.CsrfRequestDataValueProcessor;
import org.springframework.web.servlet.support.RequestDataValueProcessor;

/**
 * @Classname RootConfig
 * @Auther sunshinezhang
 * @Date 2019/11/4 10:56
 */
@Configuration
public class RootConfig {

	@Bean
	public CsrfFilter csrfFilter(){
		return new CsrfFilter(new HttpSessionCsrfTokenRepository());
	}

	@Bean
	public RequestDataValueProcessor requestDataValueProcessor(){
		return new CsrfRequestDataValueProcessor();
	}
}
