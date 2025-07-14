package dsa.linkedList;

public class Node<E> {

	E val;
	Node<E> next;
	Node<E> prev;
	
	public Node(E val) {
		super();
		this.val = val;
		this.next = null;
		this.prev = null;
	}
	
	
}
