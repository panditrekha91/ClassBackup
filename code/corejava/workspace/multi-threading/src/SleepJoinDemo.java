
public class SleepJoinDemo {
	public static void main(String[] args) {
		TablePrint table = new TablePrint();
		table.start();
		
		try {
			table.join(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//table.suspend();
		
		System.out.println("=======Main Thread STARTED======");
		for(int i = 1; i<=10; i++) {
			for(int j = 1 ; j<=i ; j++) {   
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=======Main Thread ENDS======");
		
		//table.resume();
	}
}

class TablePrint extends Thread {	
	@Override
	public void run() {
		System.out.println("=======Table Thread STARTED======");
		for(int i = 1; i<=10; i++) {
			System.out.println("5 * " + i + " = " + (5*i));
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("=======Table Thread ENDS======");
	}
}



