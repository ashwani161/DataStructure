package DataStructures;

import org.junit.Assert;
import org.junit.Test;

public class NodeTest {
	@Test
	public void given3Numbers_whenLinkedshouldPassedLinkledListTest() {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) &&
				         mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
		}

}