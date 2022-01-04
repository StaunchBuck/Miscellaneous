package com.techstudy.designpatterns.builder;

public class User {
	
	private final String name;
	private final Long id;
	private final Integer age;
	
	private User(UserBuilder builder) {
		this.name = builder.name;
		this.id = builder.id;
		this.age = builder.age;	
	}
	
	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}

	public Integer getAge() {
		return age;
	}

	public static class UserBuilder {
		
		private String name;
		private Long id;
		private Integer age;
		
		public UserBuilder setName(String name) {
			this.name = name;
			return this;
		}
		
		public UserBuilder setId(Long id) {
			this.id = id;
			return this;
		}
		
		public UserBuilder setAge(Integer age) {
			this.age = age;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}

}
