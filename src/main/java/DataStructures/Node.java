package DataStructures;

public class Node<K> implements INode<K> {
	// Represent a node of the linked list
	private K key;
	private INode next;  

	public Node(K key) {
		this.key = key;
		this.next = null;
	}
	 public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public INode<?> getNext() {
		return next;
	}
	
	@Override
	public void setNext(INode next) {
		this.next = next;
	}
	
}


	/*public static void main(String[] args) {
		System.out.println("Creating Linked List of different operations");
		
	}*/
