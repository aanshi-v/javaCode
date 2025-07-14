package multithreading;

/**
 * Creating thread using Runnable interface
 */
public class MyThread implements Runnable{

	@Override
	public void run() {
		//task for thread
		for(int i = 1; i<=10; i++) {
			System.out.println("Value of i is: " + i); 
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	
	}
	
	public static void main(String[] args) {
		//create object of MyThread class
		MyThread t1 = new MyThread();
		Thread thr = new Thread(t1);
		
		//object of another thread
		MyAnotherThread t2 = new MyAnotherThread();
		
		thr.start();
		t2.start();
	}

}
