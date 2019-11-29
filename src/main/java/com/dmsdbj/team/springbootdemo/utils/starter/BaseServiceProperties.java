package com.dmsdbj.team.springbootdemo.utils.starter;
import	java.net.DatagramPacket;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Classname BaseServiceProperties
 * @Auther sunshinezhang
 * @Date 2Data11/29 15:23
 */
@Data
@ConfigurationProperties(prefix = "project.starter")
public class BaseServiceProperties {
	private String serviceName;
	private String serviceVersion;
}
