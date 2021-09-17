package LinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MyStackTest {

	@Test
	public void test() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyStack myStack = new MyStack();
		
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		
		myStack.printStack();
		INode peak=myStack.peak();
		Assert.assertEquals(myThirdNode, peak);
	}
	
	@Test
	public void peakAndPopFromStack() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyStack myStack = new MyStack();
		
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		
		myStack.pop();
	}

}
