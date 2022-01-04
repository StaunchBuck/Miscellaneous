package com.techstudy.misc.collection;

public class Temp2 implements Runnable{

	public static void main(String[] args) {
		Thread t = new Thread(new Temp2());
		t.run();
		t.run();
		t.start();
		

	}

	@Override
	public void run() {
		System.out.println("running");
		
	}

}
