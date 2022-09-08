
public class DefaultThread {
	public static void main(String[] args) {
		System.out.println("Main Method execution started..");
		
		Thread th = Thread.currentThread(); // this return the current thread object in this case it is a Main thread.
		System.out.println(th); // Thread[main,5,main] -> [ThreadName, ThreadPriory, ThreadGroup]
		
		System.out.println("Main Method execution ends..");
	}
}
