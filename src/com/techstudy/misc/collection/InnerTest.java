package com.techstudy.misc.collection;

public class InnerTest {
	
	public static void main(String[] args) {
		new InnerTest().new InnerClass();
	}
	
	private String str="abcd";
	
	class InnerClass{
		InnerClass(){
			System.out.println(str);
		}
	}

}
