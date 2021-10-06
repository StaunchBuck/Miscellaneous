package com.techstudy.misc.classes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<T> List<T> list = fromArrayToList(new int[] {1,2,3});
		
	}

	private static <T> List<T> fromArrayToList(T[] arr) {
		return Arrays.asList(arr);
	}
	
	private static <T,R> List<R> fromArrayToList(T[] arr,Function<T,R> function) {
		return Arrays.stream(arr).map(function).collect(Collectors.toList());
	}
	
	public <T extends Number> List<T> fromArrayToList(T[] a) {
	    return Arrays.asList(a);
	}
	
	public static void paintAllBuildings(List<? extends Object> buildings) { //upper bound wildcard
	    
	}
	
	public static void paintAllBuildings1(List<? super String> buildings) { //lower bound wildcard
	    
	}

}
