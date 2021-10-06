package com.techstudy.misc.thread.readerwriter;

public class Reader implements Runnable{
	
	private Message message;

	public Reader(Message message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		synchronized(this.message) {
			try {
				System.out.println("Thread "+name+" waiting for message write..");
				this.message.wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Thread "+name+" got notified..");
			System.out.println("Printing message "+this.message.getMsg());
		}
		
	}

}
