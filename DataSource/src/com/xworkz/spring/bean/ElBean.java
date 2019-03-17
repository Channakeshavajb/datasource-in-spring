package com.xworkz.spring.bean;

public class ElBean {

	private String message;
	public ElBean() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}
	public void setMessage(String message) {
		System.out.println("invoked setMessage"+message);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
