package multithreading;

/**
 * Creating thread using Thread class
 * Parent of Thread is Runnable
 */
public class MyAnotherThread extends Thread{ 
	
	public void run() {
		//task for thread
		for(int i = 10; i>=1; i--) {
			System.out.println("Another thread :" + i); 
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
	}

}
