package com.techstudy.designpatterns.builder;

public class BuilderApplication {

	public static void main(String[] args) {
		User user = new User.UserBuilder().setName("Sam").setAge(23).setId(1L).build();
		System.out.println(user.getName());
	}

}
