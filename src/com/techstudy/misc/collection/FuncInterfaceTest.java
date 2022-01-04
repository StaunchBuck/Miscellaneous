package com.techstudy.misc.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FuncInterfaceTest {

	public static void main(String[] args) {
		Thread t = new Thread(() -> System.out.println("inside runnable"));
		t.start();
		
		Runnable r = () -> System.out.println("inside runnable 1");
		Thread t1 = new Thread(r);
		t1.start();
		
		MyFunction func = i -> i+"_func";
		System.out.println(func.apply("cool"));
		
		MyPredicate pre = i -> (int)i == 0;
		System.out.println(pre.test(0));
		
		Supplier sup = () -> 1;
		System.out.println(sup.get());
		
		
		FuncInterfaceTest test = new FuncInterfaceTest();
		
		List<String> list = Arrays.asList("node", "c++", "java", "javascript");
		Map<String,String> map = test.convertListToMap(list, func);
		System.out.println(map);
		
		IntStream streamOfChars = "abc".chars();
		streamOfChars.forEach(e -> System.out.println((char)e));
		
		List<Employee1> list1 = Arrays.asList(new Employee1(1,"Sumit1"),new Employee1(2,"Sumit2"),new Employee1(3,"Sumit3"));
		Map<Integer,Employee1> map1 = list1.stream().collect(Collectors.toMap(e -> e.getId(),Function.identity()));
		System.out.println(map1);
	}
	
	public <T,R> Map<T,R> convertListToMap(List<T> list,MyFunction<T,R> func) {
		
		Map<T,R> map = new HashMap<>();
		
		list.stream().forEach(t -> {
			map.put(t, func.apply(t));
		});
		
		return map;
		
	}
	
	public static <X,T,G> List<G> fromArrayToList(X[] a, Function<T, G> mapperFunction) {
		return null;
		
	}
	
	

}

interface MyFunction<T,R>{
	
	R apply(T t);
	
}

interface MyPredicate<T,Boolean>{
	
	Boolean test(T t);
	
}

interface MySupplier<R>{
	
	R get();
	
}

interface MyConsumer<T>{
	
	void accept(T t);
	
}

class Employee1{
	
	private int id;
	private String name;
	
	
	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}






