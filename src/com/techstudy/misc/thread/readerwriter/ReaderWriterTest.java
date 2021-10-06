package com.techstudy.misc.thread.readerwriter;

public class ReaderWriterTest {

	public static void main(String[] args) {
		
		Message m = new Message();
		Reader reader = new Reader(m);
		Writer writer = new Writer(m);
		Thread t1 = new Thread(reader);
		Thread t2 = new Thread(writer);
		t1.start();
		t2.start();

	}

}
