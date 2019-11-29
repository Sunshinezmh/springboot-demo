package com.dmsdbj.team.springbootdemo.controller.springMVC.convert;
import java.lang.annotation.*;

/**
 * @Classname MaskFormat
 * @Auther sunshinezhang
 * @Date 2019/11/4 11:57
 */

@Target(value = {ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MaskFormat {
	String value();
}
