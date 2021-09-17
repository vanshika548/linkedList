package LinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchAnElementInLinkedList {

	@Test
	public void test() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		boolean result=myLinkedList.search(mySecondNode);
		if(result==true) {
			System.out.println("Number is present");
		}
		myLinkedList.printNodes();
		boolean answer=myFirstNode.getKey().equals(mySecondNode)&&
				       mySecondNode.getKey().equals(myThirdNode);
				       
				
	}

}
