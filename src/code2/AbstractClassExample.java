package code2;

public class AbstractClassExample  extends AnimalAbstract{

	public static void main(String[] args) {
		AbstractClassExample obj = new AbstractClassExample();
		obj.eat();
		obj.sleep();
		obj.walk();
	}

	@Override
	void eat() {
		System.out.println("Animal is eating");
	}

	@Override
	void sleep() {
		System.out.println("Animal is sleeping");
	}

}
