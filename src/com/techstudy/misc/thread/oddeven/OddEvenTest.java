package com.techstudy.misc.thread.oddeven;

public class OddEvenTest {

	
	public static void main(String[] args) {
		Lock lock = new Lock(1);
		Thread odd = new Thread(new OddWriter(lock));
		Thread even = new Thread(new EvenWriter(lock));
		
		odd.start();
		even.start();

	}

}
