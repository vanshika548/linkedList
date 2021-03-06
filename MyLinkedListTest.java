package LinkedList;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void threeNumbersAddedToTop() {
		MyNode <Integer> myFirstNode = new MyNode<>(70);
		MyNode <Integer> mySecondNode = new MyNode<>(30);
		MyNode <Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		
		
		myLinkedList.printNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && 
				         myLinkedList.head.getNext().equals(mySecondNode)  && 
				         myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}

}
