package DataStructures;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
	@Test
	public void given3Numbers_WhenAddedToLinkedListShouldBeAddedToTop() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		LinkedList linkedList = new LinkedList();
		linkedList.add(myFirstNode);
		linkedList.add(mySecondNode);
		linkedList.add(myThirdNode);
		linkedList.printNodes();
		boolean result = linkedList.head.equals(myThirdNode) && 
				         linkedList.head.getNext().equals(mySecondNode) &&
			         	 linkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}
		
	@Test
	public void given3NumbersWhenAppendedShouldBeAddedToLast() {
			Node<Integer> myFirstNode = new Node<>(56);
			Node<Integer> mySecondNode = new Node<>(30);
			Node<Integer> myThirdNode = new Node<>(70);
			LinkedList linkedList = new LinkedList();
			linkedList.add(myFirstNode);
			linkedList.append(mySecondNode);
			linkedList.append(myThirdNode);
			linkedList.printNodes();
			boolean result = linkedList.head.equals(myFirstNode) &&
					         linkedList.head.getNext().equals(mySecondNode) &&
					         linkedList.tail.equals(myThirdNode);
			Assert.assertTrue(result);
		}
	
	@Test
	public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
			Node<Integer> myFirstNode = new Node<>(56);
			Node<Integer> mySecondNode = new Node<>(30);
			Node<Integer> myThirdNode = new Node<>(70);
			LinkedList linkedList = new LinkedList();
			linkedList.add(myFirstNode);
			linkedList.append(myThirdNode);
			linkedList.insert(myFirstNode,mySecondNode);
			linkedList.printNodes();
			boolean result = linkedList.head.getKey().equals(myFirstNode.getKey()) &&
					         linkedList.head.getNext().getKey().equals(mySecondNode.getKey()) &&
					         linkedList.tail.getKey().equals(myThirdNode.getKey());
			Assert.assertTrue(result);
		}
	
	@Test
    public void givenFirstElement_WhenDeletedShouldpassLinkedListResult() {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		LinkedList linkedList = new LinkedList();
		linkedList.add(myFirstNode);
		linkedList.append(mySecondNode);
		linkedList.append(myThirdNode);
		linkedList.pop();
		linkedList.printNodes();
		boolean result = linkedList.head.equals(mySecondNode) &&
		                 linkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
		
	}

	}
