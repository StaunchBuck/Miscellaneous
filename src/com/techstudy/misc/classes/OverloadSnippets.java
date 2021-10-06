package com.techstudy.misc.classes;

import java.util.stream.Stream;

public class OverloadSnippets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(int[].class.isPrimitive());
		System.out.println(int[].class.getName());
		System.out.println(int[].class.getSuperclass());
		System.out.println(int.class.isPrimitive());
		System.out.println(int.class.getName());
		System.out.println(int.class.getSuperclass());
		Object ref = new int[] { 1, 2, 3 }; // valid statement?
		// Object[] ref=new int[]{1,2,3}; // valid statement? //CE

		OverloadSnippets obj = new OverloadSnippets();
		// obj.test(null); //ambiguous
		// obj.test1(null); //ambiguous
		// obj.test2(null); //ambiguous
		
		long count = Stream.of("subhasish halder".chars()).filter(e -> e.equals((int)'h')).count();
		System.out.println(count);

	}

	public void test(int[] intArr) {
		System.out.println("int array");
	}

	public void test(char[] charArr) {
		System.out.println("char array");
	}

	public void test1(String obj1, Object obj2) {
		System.out.println("B");
	}

	public void test1(Object obj1, String obj2) {
		System.out.println("C");
	}

	public void test2(Object obj) {
		System.out.println("Object");
	}
	public void test2(char[] obj) {
		System.out.println("Char");
	}
	public void test2(Integer obj) {
		System.out.println("Int");
	}

}
