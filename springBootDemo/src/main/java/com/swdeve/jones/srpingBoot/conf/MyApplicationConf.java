package com.swdeve.jones.srpingBoot.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.swdeve.jones.srpingBoot.service.HelloService;

/**
 * @Configuration 指明该类是一个配置类
 * @author Administrator
 *
 */
@Configuration
public class MyApplicationConf {

	@Bean // 将方法的返回值添加到容器中；容器中这个组件默认的id就是方法名
	public HelloService helloService() {
		System.out.println("给容器添加组件");
		return new HelloService();
	}

}
