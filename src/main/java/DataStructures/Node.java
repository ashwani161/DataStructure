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
	
	public int compareTo(INode<K> currentNode) {
		if (this.getKey().equals(null) || currentNode.getKey().equals(null)) {
			return 0;
		}
		return ((Comparable<K> )this.getKey()).compareTo(currentNode.getKey());
	}
	@Override
	public int compareTo(K o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


	/*public static void main(String[] args) {
		System.out.println("Creating Linked List of different operations");
		
	}*/
