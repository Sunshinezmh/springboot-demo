package com.dmsdbj.team.springbootdemo.utils.starter;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Classname PasswordService
 * @Auther sunshinezhang
 * @Date 2019/11/29 15:25
 */
public class PasswordService {
	//第三方系统获取密码所需的key
	private String objectKey;


	@Autowired
	private ThirdPartySystemService thirdPartySystemService;

	public String getSystemPassword(String objectKey,String originalPassword){
		if (StringUtils.isEmpty(objectKey)) {
			return originalPassword;
		}
		//第三方系统获取密码
		String password = thirdPartySystemService.getPassword(objectKey);
		//返回密码
		return password != null ? password : originalPassword;
	}

}
