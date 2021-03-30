package DataStructures;

public class Node<k> {
	// Represent a node of the linked list
	private k key;
	private Node next;  

	public Node(k key) {
		this.key = null;
		this.next = null;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
}


	/*public static void main(String[] args) {
		System.out.println("Creating Linked List of different operations");
		
	}*/
