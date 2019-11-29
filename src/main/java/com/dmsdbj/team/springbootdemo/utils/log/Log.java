package com.dmsdbj.team.springbootdemo.utils.log;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Classname Log
 * @Auther sunshinezhang
 * @Date 2019/11/4 18:37
 */


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Log {
	String name() default "";
}
