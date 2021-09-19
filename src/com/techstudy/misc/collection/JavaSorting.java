package com.techstudy.misc.collection;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

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

