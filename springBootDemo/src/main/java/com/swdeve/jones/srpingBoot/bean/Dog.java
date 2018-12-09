package com.swdeve.jones.srpingBoot.bean;

public class Dog {
	private String dogName;
	private int dogAge;

	@Override
	public String toString() {
		return "dog{dogName:" + dogName + ",dogAge:" + dogAge + "}";
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public int getDogAge() {
		return dogAge;
	}

	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}

	
}
