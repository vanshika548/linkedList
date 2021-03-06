package LinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class PopFirstElementFromList {

	@Test
	public void test() {
	MyNode<Integer> myFirstNode = new MyNode<>(56);
	MyNode<Integer> mySecondNode = new MyNode<>(30);
	MyNode<Integer> myThirdNode = new MyNode<>(70);
	MyLinkedList myLinkedList = new MyLinkedList();
	myLinkedList.add(myFirstNode);
	myLinkedList.add(mySecondNode);
	myLinkedList.add(myThirdNode);
	myLinkedList.popFirst();
	myLinkedList.printNodes();
	boolean result = mySecondNode.getNext().equals(myThirdNode) &&
			         myThirdNode.getNext().equals(null);
	}

}
