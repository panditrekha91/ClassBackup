
public class ThreadByRunnable {
	public static void main(String[] args) {
		
		ByThread th1 = new ByThread(); // Born stage
		th1.setDaemon(true); // to make thread as a Demon thread
		th1.start(); // Runnable stage
		
		ByRunnable th2 = new ByRunnable();
		Thread thread = new Thread(th2); // Born Stage 
		thread.start(); // Runnable Stage
	}
}

class A {
	
}

class ByThread extends Thread {
	@Override
	public void run() {
		System.out.println("This is a thread created by Thread class");
	}
}

class ByRunnable extends A implements Runnable {
	@Override
	public void run() {
		System.out.println("This is a thread created by Runnable Interface");
	}
}




