
public class SynchronizationDemo_1 {
	public static void main(String[] args) {
		Printer printer = new Printer(); // Printer Object
		Thread1 t1 = new Thread1(printer); // Passing Object using constructor
		t1.start();
		Thread2 t2 = new Thread2(printer); // Passing Object using constructor
		t2.start();
	}
}
 
class Thread1 extends Thread {
	Printer printer; // Reference Variable
	public Thread1(Printer printer) { // receive the Object
		this.printer = printer; // assign Object to instance reference variable
	}
	@Override
	public void run() {
		
		synchronized (printer) { // acquire a Lock on Printer Object
			for(int i = 1; i<=10 ; i++) {
				System.out.println("Thread-1----Hi");
			}
			try {
				printer.wait(); // release the LOCK of print object and pause the execution of the thread
				sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			printer.print(10);
		} // release a Lock of Printer Object
	}
}

class Thread2 extends Thread {
	Printer printer; // Reference Variable
	public Thread2(Printer printer) { // receive the Object
		this.printer = printer; // assign Object to instance reference variable
	}
	@Override
	public void run() {
		
		synchronized (printer) { // acquire a Lock on Printer Object
			for(int i = 1; i<=10 ; i++) {
				System.out.println("Thread-2----Hello");
			}
			
			printer.print(12);
			
			printer.notify(); // Notify the Thread which is in the waiting state
			
		} // release a Lock of Printer Object
	}
}
