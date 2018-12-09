package com.swdeve.jones.srpingBoot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootHelloWorld {
	
	@ResponseBody//表示直接将方法的返回值写到浏览器端
	@RequestMapping("/helloWorld")
	public String helloWorld() {
		return "helloWorld";
	}
}
