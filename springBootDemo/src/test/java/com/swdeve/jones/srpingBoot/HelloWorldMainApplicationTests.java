package com.swdeve.jones.srpingBoot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.swdeve.jones.srpingBoot.bean.People;
import com.swdeve.jones.srpingBoot.bean.Person;

/**
 * spring Boot单元测试 可以在测试期间类似于编码一样自动注入
 * 
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest // 使用该注解的时候，该该类所在的路径需要在springboot项目路径com.swdeve.jones.srpingBoot中，如不在该路径下，会报错
public class HelloWorldMainApplicationTests {

	@Autowired
	private Person person;

	@Autowired
	private People people;
	
	@Autowired
	ApplicationContext ioc;
	@Test
	public void contextLoads() {
		System.out.println(person.toString());
		System.out.println(people.toString());
	}

	@Test
	public void testIoc() {
		boolean b = ioc.containsBean("helloService");
		System.out.println("是否包含helloService：" + b);
	}
}
