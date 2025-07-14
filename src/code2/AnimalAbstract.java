package code2;

abstract class AnimalAbstract {
	
	abstract void eat();             // Abstract method
	abstract void sleep();           // Abstract method
	
	void walk() {                                               // Concrete method
		System.out.println("Animal is walking");
	} 

}
