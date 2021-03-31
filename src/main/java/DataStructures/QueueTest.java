package DataStructures;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {
	
	@Test
	public void given3Numbers_WhenAddedToQueueShouldHaveFirstAddedNode() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		Queue queue = new Queue();
		queue.append(myFirstNode);
		queue.append(mySecondNode);
		queue.append(myThirdNode);
		queue.printStack();
		INode peak = queue.peak();
		Assert.assertEquals(myFirstNode, peak);
	 
	}
	
	@Test
	public void given3NumbersInQueue_WhenPopedShouldMatchFirstAddedNode() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		Queue queue = new Queue();
		queue.append(myFirstNode);
		queue.append(mySecondNode);
		queue.append(myThirdNode);
		INode pop = queue.pop();
		queue.printStack();
		Assert.assertEquals(myFirstNode, pop);

		}
}