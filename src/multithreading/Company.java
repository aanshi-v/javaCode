package multithreading;

/**
 * InterThread Communication
 */
public class Company {
	
	int n;
	boolean f = false;
	//f=false: chance: producer
	//f=true: chance: consumers
	
	//written synchronized coz when producer will run then consumer will not run vice versa
	synchronized public void produce_item(int n) throws InterruptedException { 
		if(f) {
			wait();
		}
		this.n = n;
		System.out.println("Produced: " + this.n);
		f = true;
		notify();
	}
	
	synchronized public int consume_item() throws InterruptedException { 
		if(!f) {
			wait();
		}
		System.out.println("Consume: " + this.n);
		f = false;
		notify();
		return this.n;
	} 

}
