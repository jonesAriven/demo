package com.swdeve.jones.srpingBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 用来标注类，说明这是一个spring
 *                        Boot应用，并且说明该springboot项目的路径是com.swdeve.jones.srpingBoot，后期所有的springboot路径java文件必须在此路径内才有效
 * @author Administrator
 *
 */
@SpringBootApplication
public class HelloWorldMainApplication {
	public static void main(String[] args) {
		// 启动spring boot应用
		SpringApplication.run(HelloWorldMainApplication.class);
	}
}
