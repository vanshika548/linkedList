package LinkedList;

public class MyStack {
	private final MyLinkedList myLinkedList;
	
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}

	public void push(INode newNode) {
		// TODO Auto-generated method stub
		myLinkedList.add(newNode);
	}

	public void printStack() {
		// TODO Auto-generated method stub
		myLinkedList.printNodes();
	}

	public INode peak() {
		// TODO Auto-generated method stub
		return myLinkedList.head;
	}

	public INode pop() {
		// TODO Auto-generated method stub
		return myLinkedList.popFirst();
	}

}
