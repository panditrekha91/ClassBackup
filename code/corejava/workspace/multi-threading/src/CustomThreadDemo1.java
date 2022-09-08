public class CustomThreadDemo1 {
	public static void main(String[] args) {
		System.out.println("Main Thread Started....");
		
		MyFirstThread th = new MyFirstThread(); // new/born stage
		th.setName("my-first-thread");
		th.setPriority(2);
		th.start(); // to make thread ready to run. runnable stage
		
		MySecondThread th1 = new MySecondThread(); // new/born stage
		th1.start(); // runnable stage
		
		Thread currentTh = Thread.currentThread();
		System.out.println(currentTh);
		
		System.out.println("Main Thread Ends....");
	}
}

class MyFirstThread extends Thread {
	@Override
	public void run() {
		System.out.println("Custome Thread Started....");
		
		try {
			System.out.println(10/0);
		} catch(ArithmeticException ex) {
			//stop(); to stop the execution of the thread manually
			System.out.println("Exception in custom thread....");
		}
		
		Thread th = Thread.currentThread();
		System.out.println(th);
	
		
		System.out.println("Custome Thread Ends....");
	}
}

class MySecondThread extends Thread {
	@Override
	public void run() {
		System.out.println("This is my second therad...");	
	}
}




