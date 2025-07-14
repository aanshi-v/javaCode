package code2;

public class InterfaceExample implements Animal{

	public static void main(String[] args) { 
		InterfaceExample obj = new InterfaceExample();
		obj.eat();
		obj.sleep();
		obj.walk();

	}

	@Override
	public void eat() {
		System.out.println("Dog is eatinhg");	
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping");
	}

}
