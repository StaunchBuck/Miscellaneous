package com.techstudy.misc.classes;

public class FunctionalInterfaceSnippets implements B,C{

	public static void main(String[] args) {
		FunctionalInterfaceSnippets f = new FunctionalInterfaceSnippets();
		//f.m1();
	}
	public void m1() {
		//System.out.println("From Class");
		C.super.m1();
	}
}


interface A{
	public default void m1() {
		System.out.println("From A");
	}
}

interface B extends A{
	public default void m1() {
		A.super.m1();
	}
}

interface C extends A{
	public default void m1() {
		System.out.println("From C");
	}
}