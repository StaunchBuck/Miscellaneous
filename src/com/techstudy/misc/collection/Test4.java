package com.techstudy.misc.collection;

import java.util.TreeSet;

public class Test4 implements Comparable{
	public String name;
	
	@Override
	public int compareTo(Object o) {
		return 0;
	}


	public static void main(String[] args) {
		Test4 t = new Test4();
		Test4 t1 = new Test4();
		t.name = "Coffee";
		t1.name = "Tea";
		
		TreeSet<Test4> set = new TreeSet();
		set.add(t);
		set.add(t1);

		for(Test4 obj:set) {
			System.out.println(obj.name);
		}
		
	}

}
