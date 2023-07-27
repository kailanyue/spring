package com.ngt.bean;

/**
 * 2023-07-28 1:03
 * @author yueka
 */
public class User {
	private String name;

	public User() {
		System.out.println("User constructor...");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("name = " + name);
	}
}
