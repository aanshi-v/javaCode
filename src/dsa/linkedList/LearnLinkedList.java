package dsa.linkedList;

public class LearnLinkedList {

	public static void main(String[] args) {
		
		Node<Integer> head = new Node<>(1);    //head node
		
		Node<Integer> n1 = new Node<>(2);
		Node<Integer> n2 = new Node<>(5);
		Node<Integer> n3 = new Node<>(8);
		
		head.next = n1;
		n1.prev = head;
		
		n1.next = n2;
		n2.prev = n1;
		
		n2.next = n3;
		n3.prev = n2;
		
		printLinkedList(head); 
		
		Node<Integer> newList = insertInLinkedList(3, 4, head);
		printLinkedList(newList);  
		
		Node<Integer> newListDelete = deleteFromLinkedList(3, head);
		printLinkedList(newListDelete); 
	}
	
	public static void printLinkedList(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println(); 
	}
	
	public static Node<Integer> insertInLinkedList(int pos, int data, Node<Integer> head){
		
		Node<Integer> newNode = new Node<>(data);
		if(pos == 0) {
			newNode.next = head;
			head.prev = newNode;
			return newNode;
		}
		Node<Integer> temp = head;
		for(int i = 0; i<pos-1; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next.prev = newNode;
		
		temp.next = newNode;
		newNode.prev = temp; 
		
		return head;	
	}
	
	public static Node<Integer> deleteFromLinkedList(int pos, Node<Integer> head){
		if(pos == 0) {
			return head.next;
		}
		Node<Integer> temp = head;
		for(int i = 0; i<pos-1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		return head;		
	}
	
}











