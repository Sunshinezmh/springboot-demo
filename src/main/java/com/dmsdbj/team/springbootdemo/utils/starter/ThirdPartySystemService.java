package com.dmsdbj.team.springbootdemo.utils.starter;

import java.util.UUID;

/**
 * @Classname ThirdPartySystemService
 * @Auther sunshinezhang
 * @Date 2019/11/29 15:28
 */
public class ThirdPartySystemService {
	public String getPassword(String objectKey){
		//返回一个32位的随机数
		return UUID.randomUUID().toString();
	}
}
