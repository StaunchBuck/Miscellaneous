package com.techstudy.misc.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class JavaSorting {

	public static void main(String[] args)
	{
	//Set<Integer> l = new TreeSet<Integer>(new MyComparator()); //descending
	Set<Integer> l = new TreeSet<Integer>((a,b)-> a>b?1:a<b?-1:0);//descending
	l.add(10);
	l.add(0);
	l.add(15);
	l.add(5);
	l.add(5);
	
	System.out.println(l);
	//sample predicate
	Predicate<Integer> p = (a) -> a>=20; 
	Predicate<Integer> p1 = (a) -> a%2 == 0; 
	System.out.println(p.test(20));
	System.out.println(p.negate().test(20));
	System.out.println(p.or(p1).test(10));
	System.out.println(p.and(p1).test(10));
	Integer[][] ints = { { 1, 2, 3 }, { null }, { 7, 8, 9 } };
	System.out.println(ints[1][0]);
	
	List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
	integers.forEach(i -> {
	    if (i == 0) {
	        throw new IllegalArgumentException("Zero not allowed");
	    }
	    System.out.println(Math.PI / i);
	});
	}
}

//Comparator interface contains only one abstract method: compare()
//Hence it is Functional interface.
//public int compare(obj1,obj2)
//returns -ve iff obj1 has to come before obj2
//returns +ve iff obj1 has to come after obj2
//returns 0 iff obj1 and obj2 are equal

class MyComparator implements Comparator<Integer>{ //descending

	@Override
	public int compare(Integer o1, Integer o2) {
		
		if(o1<o2) return -1;
		else if (o1>o2) return 1;
		else return 0;
	}
	
}

