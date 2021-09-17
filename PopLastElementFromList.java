package LinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class PopLastElementFromList {

	@Test
	public void test() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.popLast();
		myLinkedList.printNodes();
		boolean result = myFirstNode.getNext().equals(mySecondNode)&&
				         mySecondNode.getNext().equals(null);
				
	}

}
