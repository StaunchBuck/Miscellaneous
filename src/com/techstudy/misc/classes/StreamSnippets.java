package com.techstudy.misc.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamSnippets {

	public static void main(String[] args) {
		List<Person> list =new ArrayList<Person>();
		list.add(new Person("Sam",1L));
		list.add(new Person("Mike",2L));
		Map<Long,Person> map = list.stream().collect(Collectors.toMap(Person::getId, Function.identity()));
		map.forEach((k,v) -> System.out.println(k+" and "+v.getName()));
	}

}


class Person{
	
	private String name;
	private Long id;
	
	
	public Person(String name, Long id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}