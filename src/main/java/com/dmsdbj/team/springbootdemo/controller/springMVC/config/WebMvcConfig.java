package com.dmsdbj.team.springbootdemo.controller.springMVC.config;

import com.dmsdbj.team.springbootdemo.controller.springMVC.async.TimeoutCallableProcessingInterceptor;
import com.dmsdbj.team.springbootdemo.controller.springMVC.convert.MaskFormatAnnotationFormatterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.util.UrlPathHelper;

import java.util.List;

/**
 * @Classname WebMvcConfig
 * @Auther sunshinezhang
 * @Date 2019/11/4 11:21
 */

@Configuration
@ComponentScan(basePackages = "com.dmsdbj.team.springbootdemo.controller.springMVC")
@EnableWebMvc
@EnableScheduling
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addFormatterForFieldAnnotation(new MaskFormatAnnotationFormatterFactory());
	}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
		//resolvers.add(new CustomArgumentResolver());
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
	}


	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/views/", ".jsp");
	}

	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
		UrlPathHelper pathHelper = new UrlPathHelper();
		pathHelper.setRemoveSemicolonContent(false);
		configurer.setUrlPathHelper(pathHelper);
	}


	@Override
	public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
		configurer.setDefaultTimeout(3000);
		configurer.registerCallableInterceptors(new TimeoutCallableProcessingInterceptor());
	}


	@Bean
	public MultipartResolver multipartResolver() {
		return new CommonsMultipartResolver();
	}


}
