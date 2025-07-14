package interview;


abstract class Animal {
    abstract void makeSound();
}

public class AnonymousClassWithAbstractClass {
	public static void main(String[] args) {
		
		Animal dog = new Animal() {
			
			@Override
			void makeSound() {
				  System.out.println("Woof! Woof!");			
			}
		};
		dog.makeSound();
	}

}
