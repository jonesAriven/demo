package com.swdeve.jones.srpingBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody//该注解若写在类上表示该类下的所有方法都是直接将方法的返回值写到浏览器端(如果是对象转为json数据)
@RestController // 可以用@RestController注解代替@Controller和@ResponseBody两个注解
public class SpringBootHello {

	@RequestMapping("/helloOne")
	public String helloOne() {
		return "helloOne";
	}

	@RequestMapping("/helloTwo")
	public String helloThree() {
		return "helloTwo";
	}
}
