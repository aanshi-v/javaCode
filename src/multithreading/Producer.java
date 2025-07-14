package multithreading;

/**
 * Thread
 */
public class Producer extends Thread {
	
	//creating object of company class
	Company c;
	
	public Producer(Company c) {
		super();
		this.c = c;
	}

	public void run() {
		int i = 1;
		while(true) {
			try {
				this.c.produce_item(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			
			i++;
		}
	}

}
