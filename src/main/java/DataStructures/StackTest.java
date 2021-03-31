package DataStructures;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {
	
	@Test
	public void given3Numbers_WhenAddedToStackShouldHaveLastAddedNode() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		Stack stack = new Stack();
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		stack.printStack();
		INode peak = stack.peak();
		Assert.assertEquals(myThirdNode, peak);
	 
	}
	
	@Test
	public void given3NumbersInStack_WhenPopedShouldMatchLastAddedNode() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		Stack stack = new Stack();
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		INode pop = stack.pop();
		stack.printStack();
		Assert.assertEquals(myThirdNode,pop);

		}

}

