package com.techstudy.misc.classes;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadSample1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		System.out.println("Start");
		ScheduledExecutorService executorService
	      = Executors.newScheduledThreadPool(2);
		executorService.schedule(() -> System.out.println("Scheduled"), 5, TimeUnit.SECONDS);
		System.out.println("End");
		
		
		ExecutorService exec = Executors.newFixedThreadPool(2);
		
		exec.execute(() -> {
	        // ...
	        System.out.println("execute method");
	    });
		
//		exec.shutdown();
//	    executorService.shutdown();
	    

	    Future<String> future = exec.submit(() -> {
	        Thread.sleep(2000l);
	        return "Hello world";
	    });
	    while (future.isDone() && !future.isCancelled()) {
	    	System.out.println(future.get());
	    }
	    
	    exec.shutdown();
	    executorService.shutdown();
	    
	    //method notation
	    ThreadLocal<String> userContext = new ThreadLocal<>();
	    userContext.set("1");
	    userContext.get();
	    userContext.remove();
	    
	}

}
