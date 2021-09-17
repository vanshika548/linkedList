package LinkedList;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AddInBetweenTheList {

	@Test
	public void test() {
		MyNode<Integer> myfirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myfirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myfirstNode, mySecondNode);
		myLinkedList.printNodes();
		boolean result = myLinkedList.head.equals(myfirstNode) &&
				         myLinkedList.head.getNext().equals(mySecondNode) &&
				         myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

}
