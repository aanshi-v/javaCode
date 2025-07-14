package interview;

interface Greeting {
	
//	void eat();
//	int add(int a, int b);  // One abstract method
	
    default void sayHello() {
        System.out.println("Hello from the interface!");
    }
}

/**
 * Quest:6.8- Write an interface with a default method and override it in a class.
 */
public class DefaultMethodExam implements Greeting{ 	 
	public static void main(String[] args) {
		
		DefaultMethodExam obj = new DefaultMethodExam();
		obj.sayHello(); 
	}
	
	@Override
    public void sayHello() {
        System.out.println("Hello from the class!");
    }


//	@Override
//	public void eat() {
//		System.out.println("Dog is eatinhg");		
//	}

}
