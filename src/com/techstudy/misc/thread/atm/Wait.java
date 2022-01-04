package com.techstudy.misc.thread.atm;

public class Wait {
	  
    public static void main(String args[])
    {
        final PNBCustomer c = new PNBCustomer();
        // create two new thread and start
        // them simultaneously
        new Thread() {
            @Override
            public void run()
            {
                c.withdraw(15000);
            }
        }.start();
        new Thread() {
            @Override
            public void run()
            {
                c.deposit(10000);
            }
        }.start();
    }
}