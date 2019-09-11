package csip.solutions.upperClassPerson; 

import java.util.Stack; 

public class ListOps {

    private class Node {
	private int val; 
	private Node next; 

	private Node(int x) {
	    val = x; 
	    next = null;
	}
    }

    private Node head; 

    public ListOps() {

	this.head = null; 

    }

    public void insert(int x) {

	Node newNode = new Node(x); 
	newNode.next = this.head;
	head = newNode; // just weld it to the front

    }

    public void reverseList(Node head) {

	reverseListRec(null, head); 

    }

    private void reverseListRec(Node prev, Node curr) {

	if (curr == null) {

	    this.head = prev; 
	    return; 

	}
	else {

	    reverseListRec(curr, curr.next); 
	    curr.next = prev; 

	}

    }

    public void reverseIter(Node head) {

	Stack<Node> nodeStack = new Stack<>();
	Node curr = head; 


	while (curr != null) {
	    nodeStack.push(curr);
	    curr = curr.next; 
	}

	this.head = nodeStack.peek(); // make head of list the first one

	while (!nodeStack.isEmpty()) {
	    curr = nodeStack.pop();
	    curr.next = nodeStack.isEmpty() ? null : nodeStack.peek();
	}

    }

}