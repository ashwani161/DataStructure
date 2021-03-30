package DataStructures;

public class LinkedList {
	public INode head;
	public INode tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
		
	}
	public void printNodes() {
		StringBuffer nodes = new StringBuffer("Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			nodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) nodes.append("->");
			tempNode = tempNode.getNext();
		}
		
		nodes.append(tempNode.getKey());
		System.out.println(nodes);
	}

}
