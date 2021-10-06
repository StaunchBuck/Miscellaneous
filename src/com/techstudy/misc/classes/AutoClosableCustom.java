package com.techstudy.misc.classes;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class AutoClosableCustom {
	
	public static void main(String[] s) throws Exception {
		new AutoClosableCustom().orderOfClosingResources();

	}
	
	private void orderOfClosingResources() throws Exception {
	    try (AutoCloseableResourcesFirst af = new AutoCloseableResourcesFirst();
	        AutoCloseableResourcesSecond as = new AutoCloseableResourcesSecond()) {

	        af.doSomething();
	        as.doSomething();
	    }
	    
	    Scanner scanner = new Scanner(new File("testRead.txt"));
		PrintWriter writer = new PrintWriter(new File("testWrite.txt"));
		try (scanner;writer) { 
		    // omitted
		}
	}

}


class AutoCloseableResourcesFirst implements AutoCloseable {

    public AutoCloseableResourcesFirst() {
        System.out.println("Constructor -> AutoCloseableResources_First");
    }

    public void doSomething() {
        System.out.println("Something -> AutoCloseableResources_First");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed AutoCloseableResources_First");
    }
}

class AutoCloseableResourcesSecond implements AutoCloseable {

    public AutoCloseableResourcesSecond() {
        System.out.println("Constructor -> AutoCloseableResources_Second");
    }

    public void doSomething() {
        System.out.println("Something -> AutoCloseableResources_Second");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed AutoCloseableResources_Second");
    }
}