package interview;


interface InterA {
    default void greet() {
        System.out.println("Hello from A");
    }
}

interface InterB {
    default void greet() {
        System.out.println("Hello from B");
    }
}

/**
 * Quest:6.2 - How do default methods solve the diamond problem in interfaces? 
 * Quest:6.8- Write an interface with a default method and override it in a class.
 * 
 * Since both interface InterA and InterB have a default greet() method, Java gives an error unless class DiamondProblem overrides it.

Inside DiamondProblem, you explicitly choose which one to call using InterA.super.greet() or InterB.super.greet().
 
 */
public class DiamondProblem implements InterA, InterB{ 

	public static void main(String[] args) {
		
		DiamondProblem diamondObj = new DiamondProblem();
		diamondObj.greet();
	}

	@Override
	public void greet() {
		InterB.super.greet();
	}

}
