package com.swdeve.jones.srpingBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 用来标注类，说明这是一个spring Boot应用
 * @author Administrator
 *
 */
@SpringBootApplication
public class HelloWorldMainApplication {
	public static void main(String[] args) {
		//启动spring boot应用
		SpringApplication.run(HelloWorldMainApplication.class);
	}
}
