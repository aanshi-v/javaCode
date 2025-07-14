package deignPatternJava;

//Singleton design pattern
public class LoggerMain {

	public static void main(String[] args) {
		
		Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started");
        logger2.log("User logged in");

        // Check if both instances are the same
        System.out.println("Same instance? " + (logger1 == logger2));  // true

	}

}
