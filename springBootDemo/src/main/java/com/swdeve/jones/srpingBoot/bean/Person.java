package com.swdeve.jones.srpingBoot.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.validator.constraints.Email;
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
@ConfigurationProperties(prefix = "person")
public class Person {
	private String name;
	private int age;
	private Boolean boss;
	private Date birthDate;
	private String lastName;
	private String hobby;
	private String experience;
	@Email // 表示验证该该字段必须配置的是邮箱格式
	private String email;
	private Map<String, Object> map;
	private Map<String, Object> map1;
	private List<Object> list;
	private List<Object> list1;
	private Dog dog;

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age=" + age + ", boss=" + boss + ", birthDate=" + birthDate
				+ ", lastName=" + lastName + ", hobby=" + hobby + ", experience=" + experience + ", email=" + email
				+ ", map=" + map + ", map1=" + map1 + ", list=" + list + ", list1=" + list1 + ", dog=" + dog + "}";
	}

	public Map<String, Object> getMap1() {
		return map1;
	}

	public void setMap1(Map<String, Object> map1) {
		this.map1 = map1;
	}

	public List<Object> getList1() {
		return list1;
	}

	public void setList1(List<Object> list1) {
		this.list1 = list1;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

}
