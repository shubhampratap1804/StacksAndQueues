package com.bridgelabz;

public class Stacks {

	private final MyLinkedList myLinkedList;

	public Stacks() {
		this.myLinkedList = new MyLinkedList();
	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public INode peak() {
		return myLinkedList.head;
	}

	public void printStack() {
		myLinkedList.printNodes();
	}
}
