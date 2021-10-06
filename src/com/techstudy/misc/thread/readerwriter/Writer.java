package com.techstudy.misc.thread.readerwriter;

public class Writer implements Runnable{

	private Message message;

	public Writer(Message message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (this.message) {
			try {
				Thread.sleep(3000);
				System.out.println("Thread "+name+" writing message.. ");
				this.message.setMsg("This is a Writer Test");
				System.out.println("Notifying other threads..");
				this.message.notify();
				System.out.println("After notifying other threads..");
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	
}
