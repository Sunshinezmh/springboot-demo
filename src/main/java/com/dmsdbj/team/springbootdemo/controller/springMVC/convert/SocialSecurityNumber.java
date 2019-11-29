package com.dmsdbj.team.springbootdemo.controller.springMVC.convert;

/**
 * @Classname SocialSecurityNumber
 * @Auther sunshinezhang
 * @Date 2019/11/4 11:58
 */
public final class SocialSecurityNumber {
	private final String value;

	public SocialSecurityNumber(String value) {
		this.value = value;
	}

	@MaskFormat("###-##-####")
	public String getValue() {
	    return value;
	}

	public static SocialSecurityNumber valueOf(@MaskFormat("###-##-####") String value){
		return new SocialSecurityNumber(value);
	}
}
