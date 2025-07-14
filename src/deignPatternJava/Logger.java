package deignPatternJava;

//Singleton design pattern
public class Logger {

	 private static Logger instance;

	    // private constructor
	    private Logger() {}

	    // static method to get the single instance
	    public static Logger getInstance() {
	        if (instance == null) {
	            instance = new Logger();
	        }
	        return instance;
	    }

	    // method to log messages
	    public void log(String message) {
	        System.out.println("[LOG] " + message);
	    }
	    
}
