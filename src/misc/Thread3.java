package misc;

public class Thread3 implements Runnable{

	public static void main(String[] args) {
		Thread t = new Thread(new Thread3());
		t.run();
		t.run();
		t.start();
	}

	@Override
	public void run() {
		System.out.println("running");
		
	}

}
