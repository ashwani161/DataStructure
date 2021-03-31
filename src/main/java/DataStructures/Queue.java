package DataStructures;

public class Queue {
	private LinkedList linkedList;

	public Queue() {
		this.linkedList = new LinkedList();
	}

	public void append(INode node) {
		linkedList.append(node);

	}

	public void printStack() {
		linkedList.printNodes();
	}

	public INode peak() {
		return linkedList.head;

	}

	public INode pop() {
		return linkedList.pop();
	}

}
