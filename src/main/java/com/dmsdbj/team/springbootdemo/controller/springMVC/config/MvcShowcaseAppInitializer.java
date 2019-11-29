package com.dmsdbj.team.springbootdemo.controller.springMVC.config;

import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @Classname MvcShowcaseAppInitializer
 * @Auther sunshinezhang
 * @Date 2019/11/4 10:38
 */
public class MvcShowcaseAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{WebMvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

	protected Filter[] getServletFilters(){
		return new Filter[]{new DelegatingFilterProxy("csrfFilter")};
	}
}
