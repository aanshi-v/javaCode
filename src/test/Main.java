package test;

//public interface Vehicle {
//    default void start() {
//        System.out.println("Vehicle is starting");
//    }
//    
//    void stop();  // Abstract method
//}

//public class Car implements Vehicle {
//    @Override
//    public void stop() {
//        System.out.println("Car is stopping");
//    }
//}

public class Main {

	public static void main(String[] args) {
//	        Vehicle car = new Car();
		Car car = new Car();
	        car.start();  // Calls default method from Vehicle interface
	        car.stop();   // Calls overridden method from Car class
	    }
	}
