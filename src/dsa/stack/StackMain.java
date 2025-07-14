package dsa.stack;

import java.util.ArrayDeque;

public class StackMain {

	public static void main(String[] args) {
		
//		StackUsingArray stack = new StackUsingArray(4);
		
		StackUsingLinkedList stack = new StackUsingLinkedList();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);                //add
		stack.push(5);                //Stack Overflow in case of StackUsingArray
		stack.push(6);                //Stack Overflow in case of StackUsingArray
		
		System.out.println(stack.peek()); 
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " "); 
		}
		
		System.out.println(stack.peek()); 
//		stack.peek();
		System.out.println(stack.pop());  
		
		stack.push(7);
		System.out.println(stack.peek()); 
		System.out.println(stack.pop()); 
		System.out.println(stack.pop()); 
		
		
		
		ArrayDeque<Integer> stackAD = new ArrayDeque<>();
		stackAD.push(11); 
		stackAD.push(12); 
		stackAD.push(13); 
		stackAD.push(14); 
		System.out.println(stackAD.peek());  
		System.out.println(stackAD.pop()); 
		System.out.println(stackAD.peek());
		 
//		stack.printStack();           //1 2 3 4 	
//		stack.pop();                  //remove
//		stack.printStack(); 
//		System.out.println("peek element: " + stack.peek());     //print element of top location 
//		System.out.println("pop element: " + stack.pop());      //print poped element
//		System.out.println("pop element: " + stack.pop());
//		stack.printStack();             //print stack after pop
		

	}

}
