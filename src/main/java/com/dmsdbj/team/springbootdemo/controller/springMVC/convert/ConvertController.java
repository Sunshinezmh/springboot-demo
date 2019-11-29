package com.dmsdbj.team.springbootdemo.controller.springMVC.convert;

import com.dmsdbj.team.springbootdemo.controller.springMVC.async.JavaBean;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Date;

/**
 * @Classname ConvertController
 * @Auther sunshinezhang
 * @Date 2019/11/4 11:57
 */

@RestController
@RequestMapping("/convert")
public class ConvertController {

	@GetMapping("primitive")
	public String primitive(@RequestParam Integer value) {
		return "Converted primitice" + value;
	}

	@GetMapping("date/{value}")
	public String date(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date value) {
		return "Converted date" + value;
	}

	@GetMapping("collection")
	public String collection(@RequestParam Collection<Integer> values) {
		return "Converted collection" + values;
	}

	@GetMapping("formattedCollection")
	public String formattedCollection(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Collection<Date> values) {
		return "Comverted formatted collection" + values;
	}

	@GetMapping("bean")
	public String bean(JavaBean bean) {
		return "Converted " + bean;
	}

	@GetMapping("value")
	public String valueObject(@RequestParam SocialSecurityNumber value) {
		return "Converted value object" + value;
	}

	@GetMapping("custom")
	public String customConverter(@RequestParam @MaskFormat("###-##-####") String value) {
		return "Converted '" + value + "'with a custom converter";
	}

}
