package DataStructures;

public class Stack {
	private static LinkedList linkedList;
	
	public Stack() {
		this.linkedList = new LinkedList();
	}
	public static  void push(INode node) {
		linkedList.add(node);
		
	}
	public void printStack() {
		linkedList.printNodes();
	}
	public INode peak() {
		return linkedList.head;
		
	}

}
