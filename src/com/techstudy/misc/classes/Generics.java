 package com.techstudy.misc.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<T> List<T> list = fromArrayToList(new int[] {1,2,3});
		paintAllBuildings1(new ArrayList<Object>());
		
		
	}

	private static <T> List<T> fromArrayToList(T[] arr) {
		return Arrays.asList(arr);
	}
	
	private static <T> void fromArrayToList1(T[] arr) {
		
	}
	
	private static <T,R> List<R> fromArrayToList(T[] arr,Function<T,R> function) {
		return Arrays.stream(arr).map(function).collect(Collectors.toList());
	}
	
	public static <T extends Number> List<T> fromArrayToList(T[] a) {
	    return Arrays.asList(a);
	}
	
	public static List<? extends Object> paintAllBuildings(List<? extends Object> buildings) { //upper bound wildcard
	    return buildings;
	}
	
	public static void paintAllBuildings1(List<? super String> buildings) { //lower bound wildcard
	    
	}
	
	public static <X,T,G> List<G> fromArrayToList1(X[] a, Function<T, G> mapperFunction) {
		return null;
		
	}

}
