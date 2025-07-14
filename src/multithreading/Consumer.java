package multithreading;

/**
 * Thread
 */
public class Consumer extends Thread{
	
	Company c;

	public Consumer(Company c) {
		super();
		this.c = c;
	}
	
	public void run() {
		while(true) {
			
			try {
				this.c.consume_item();
				Thread.sleep(2000);
				}catch(Exception e) {};
			
		}
	}

}
