package dsa.linkedList;

/**
 * Remove Duplicates elements From LinkedList
 */
public class RemoveDuplicatesFromLinkedList {

	public static void main(String[] args) {
		
		Node2 head = new Node2(1);
		Node2 n2 = new Node2(2);
		Node2 n3 = new Node2(2);
		Node2 n4 = new Node2(2);
		Node2 n5 = new Node2(5);
		Node2 n6 = new Node2(6);
		Node2 n7 = new Node2(6);
		Node2 n8 = new Node2(9);
		
		head.next = n2;
		n2.next = n3;
		n3.next = n4;		
		n4.next = n5;
		n5.next = n6;		
		n6.next = n7;
		n7.next = n8;
		
		printLinkedList(head);
		Node2 newHead = removeDuplicates(head);
		printLinkedList(newHead); 

	}
	
	static Node2 removeDuplicates(Node2 head) {
		Node2 orign = head;
		Node2 newHead = null;
		Node2 temp = head;
		
		while(orign != null) {
			while(orign.next != null && orign.data == orign.next.data) {
				orign = orign.next;
			}
			if(newHead == null) {
				newHead = temp = orign;
			}else {
				temp.next = orign;
				temp = orign;
			}
			orign = orign.next;
		}
		return newHead;
	}
	
	static void printLinkedList(Node2 temp) {
		while(temp != null) {
			System.out.print(temp.data + " -> " );
			temp = temp.next;
		}
		System.out.println(); 
	}

}










