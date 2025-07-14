package interview;


interface MyInterface {
    void show();
}

public class AnonymousClass {
	public static void main(String[] args) {
		
		MyInterface obj = new MyInterface() {
			
			@Override
			public void show() {
				System.out.println("Hello from anonymous class!");				
			}
		};
		obj.show();
	}

}
