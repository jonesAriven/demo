package com.swdeve.jones.srpingBoot.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 将配置文件中配置的每一个属性值映射到这个组件中,需要用到@ConfigurationProperties注解
 * 
 * @ConfigurationProperties prefix="person" 指明对配置中那个属性进行一一映射
 * @author Administrator 只有这个组件是容器中的组件才能使用容器中的@ConfigurationProperties功能
 * @ConfigurationProperties(prefix = "person")默认从全局配置文件中获取值；
 */
@Component
// @ConfigurationProperties(prefix = "person") 验证@Value
// 注解和@ConfigurationProperties 的区别
/**
 * <bean class="Person"> <property name="lastName" value=
 * "字面量/${key}从环境变量、配置文件中获取值/#{SpEL}"></property> <bean/>
 */
public class People {
	@Value("王五") // 直接给name属性赋值
	private String name;
	@Value("#{11*2}") // EL表达式算法
	private int age;
	@Value("${person.boss}") // 读取配置文件
	private Boolean boss;
	private Date birthDate;
	private String lastName;
	private Map<String, Object> map;
	private List<Object> list;
	
	private Dog dog;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "People{" + "name='" + name + '\'' + ", age=" + age + ", boss=" + boss + ", birthDate=" + birthDate
				+ ", map=" + map + ", list=" + list + ", dog=" + dog + ", lastName=" + lastName + "}";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Boolean getBoss() {
		return boss;
	}

	public void setBoss(Boolean boss) {
		this.boss = boss;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

}
