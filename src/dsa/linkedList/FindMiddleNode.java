package dsa.linkedList;

/**
 * Find middle node in a LinkedList
 */
public class FindMiddleNode {

	public static void main(String[] args) {
		Node2 head = new Node2(1);
		Node2 n2 = new Node2(2);
		Node2 n3 = new Node2(3);
		Node2 n4 = new Node2(4);
		Node2 n5 = new Node2(5);
		Node2 n6 = new Node2(6);
		Node2 n7 = new Node2(7);
		Node2 n8 = new Node2(9);
		
		head.next = n2;
		n2.next = n3;
		n3.next = n4;		
		n4.next = n5;
		n5.next = n6;		
		n6.next = n7;
		n7.next = n8;
		
		Node2 middle = findMiddle(head);
		System.out.println(middle.data);  
	}
	
	static Node2 findMiddle(Node2 head) {
		Node2 slow = head;
		Node2 fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;		
	}

}
