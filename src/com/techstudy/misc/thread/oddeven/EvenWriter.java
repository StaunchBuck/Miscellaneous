package com.techstudy.misc.thread.oddeven;

public class EvenWriter implements Runnable{

	private Lock lock;
	
	public EvenWriter(Lock lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		
		synchronized(lock) {

			while(lock.counter < 10) { 
				
				if(lock.counter%2 != 0) {
					try {
						lock.wait();
					} catch (InterruptedException e) {}
				}
				System.out.println(Thread.currentThread().getName() +" -> "+lock.counter);
				lock.counter++;
				lock.notify();
			}
		}
		
	}

}
