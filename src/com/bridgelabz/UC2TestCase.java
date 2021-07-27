package com.bridgelabz;

public class UC2TestCase {

	public static void main(String[] args) {
		
		MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        
        Stacks myStack = new Stacks();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        
        System.out.println("Peak node is: "+myStack.peak());
        myStack.popStack();
        
        System.out.println("Stack after pop operation is: ");
        myStack.printStack();
        
	}
}
