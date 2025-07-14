package code2;

public interface Animal {
	
	void eat();         // Abstract method
	void sleep();       // Abstract method
	
	default void walk() {                                          // Default method (Java 8+)
		System.out.println("Animal is walking");
	}
	
}
