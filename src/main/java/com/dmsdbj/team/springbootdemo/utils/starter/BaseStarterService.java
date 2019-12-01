package com.dmsdbj.team.springbootdemo.utils.starter;

/**
 * @Classname BaseStarterService
 * @Auther sunshinezhang
 * @Date 2019/11/29 15:32
 */
public class BaseStarterService {

	public void addServiceName(BaseServiceProperties baseServiceProperties) {
		System.out.println("serviceName:" + baseServiceProperties.getServiceName() + "----" + "serviceVersion" + baseServiceProperties.getServiceVersion());
	}
}
