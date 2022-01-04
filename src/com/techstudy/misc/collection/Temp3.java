package com.techstudy.misc.collection;

import java.util.HashSet;

public class Temp3 {
	
	private String s;
	
	public Temp3(String s) {
		this.s = s;
	}

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<>();
		Temp3 t = new Temp3("s");
		Temp3 t1 = new Temp3("s");
		String s = new String("s");
		String s1 = new String("s");
		
		set.add(t);
		set.add(t1);
		set.add(s);
		set.add(s1);
		System.out.println(set.size());
		
		Object o = new Float(2.3F);
		Object[] oa = new Object[1];
		oa[0] = o;
		o=null;
		System.out.println(oa[0]+" "+o);
		oa[0] = null;
	}

}
