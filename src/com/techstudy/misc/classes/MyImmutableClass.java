package com.techstudy.misc.classes;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public final class MyImmutableClass implements Serializable{
	
	private static final long serialVersionUID = 1746476440937933133L;
	
	private final String name;
	private final Integer id;
	private final List<String> hobbies;
	
	public MyImmutableClass(String name, Integer id, List<String> hobbies) {
		
		this.name = name;
		this.id = id;
		//deep copy
		this.hobbies = hobbies.stream().collect(Collectors.toList());
	}

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}

	public List<String> getHobbies() {
		return hobbies.stream().collect(Collectors.toList());
	}
	
	
//	public static void main(String[] dsd) {
//		List<String> hobbies = new ArrayList<>();
//		hobbies.add("Tv");
//		hobbies.add("Movies");
//		new MyImmutableClass("sd",2,hobbies);
//
//	}
	
}
