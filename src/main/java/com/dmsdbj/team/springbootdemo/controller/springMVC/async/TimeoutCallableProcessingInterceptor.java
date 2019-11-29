package com.dmsdbj.team.springbootdemo.controller.springMVC.async;

import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.async.CallableProcessingInterceptorAdapter;

import java.util.concurrent.Callable;

/**
 * @Classname TimeoutCallableProcessingInterceptor
 * @Auther sunshinezhang
 * @Date 2019/11/4 10:23
 */
public class TimeoutCallableProcessingInterceptor extends CallableProcessingInterceptorAdapter {
	@Override
	public <T> Object handleTimeout(NativeWebRequest request, Callable<T> task) {
		return new IllegalStateException("[" + task.getClass().getName() + "] timed out");
	}
}
