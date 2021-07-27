package com.bridgelabz;

public class UC3TestCase {

	public static void main(String[] args) {
		
		MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        
        Stacks myStack = new Stacks();
        myStack.enqueue(myFirstNode);
        myStack.enqueue(mySecondNode);
        myStack.enqueue(myThirdNode);
   
        System.out.println("Enqueue result is:");
        myStack.printStack();
	}
}
