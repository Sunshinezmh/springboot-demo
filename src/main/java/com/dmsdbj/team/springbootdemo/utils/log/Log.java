package com.dmsdbj.team.springbootdemo.utils.log;

import java.lang.annotation.*;

/**
 * @Classname Log
 * @Auther sunshinezhang
 * @Date 2019/11/4 18:37
 */


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface Log {
	String name() default "";
}
