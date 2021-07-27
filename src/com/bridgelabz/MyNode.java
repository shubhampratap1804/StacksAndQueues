package com.bridgelabz;

public class MyNode<K> implements INode<K> {

	private K key;
	private INode next;

	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public K getKey() {
		return this.key;
	}

	@Override
	public void setNext(INode next) {
		this.next = next;
	}

	@Override
	public INode<K> getNext() {
		return this.next;
	}
}
