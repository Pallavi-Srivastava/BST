package com.blz.bstpratice;

public class MyBinaryNode<K extends Comparable<K>> {
	K key;
	MyBinaryNode<K> leftSide;
	MyBinaryNode<K> rightSide;

	public MyBinaryNode(K key) {
		super();
		this.key = key;
		this.leftSide = null;
		this.rightSide = null;
	}
}
