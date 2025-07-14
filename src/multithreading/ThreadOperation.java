package multithreading;

class UserThread extends Thread {
	public void run() {
		System.out.println("This is user define thread");
	}
}

public class ThreadOperation {
	
	public static void main(String[] args) {
		
		System.out.println("Program started...");
		
		int x = 56+34;
		System.out.println("Sum is: " + x); 
		
		//Thread...
		Thread t = Thread.currentThread();
//		String tName = t.getName();
		System.out.println("Current running thread is: " + t.getName());
		
		//setName
		t.setName("MyMain");
		System.out.println("New Thread name is: " + t.getName()); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Id of Thread: " + t.getId());
		
		//Going to start user define thread
		UserThread usert = new UserThread();
		usert.start();
		
		System.out.println("Program Ended...");	
	}

}
