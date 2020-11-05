package com.blz.bstpratice;

public class MyBinaryTree<K extends Comparable<K>> {

	public MyBinaryNode<K> root;

	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> nodeValue, K key) {
		if (nodeValue == null)
			return new MyBinaryNode<>(key);
		int result = key.compareTo(nodeValue.key);// -1 0 1
		if (result == 0)// 0
			return nodeValue;
		if (result < 0)
			nodeValue.leftSide = addRecursively(nodeValue.leftSide, key);// -1
		else
			nodeValue.rightSide = addRecursively(nodeValue.rightSide, key);// 1
		return nodeValue;
	}

	public int getSize() {
		return this.getSizeRecursively(root);
	}

	private int getSizeRecursively(MyBinaryNode<K> nodeValue) {
		return nodeValue == null ? 0
				: 1 + this.getSizeRecursively(nodeValue.leftSide) + this.getSizeRecursively(nodeValue.rightSide);
	}

	public boolean searchRecursively(MyBinaryNode<K> root, int value) {
		if (root == null)
			return false;
		if ((int) root.key == value)
			return true;
		if (value < (int) root.key)
			return searchRecursively(root.leftSide, value);

		else if (value > (int) root.key)
			return searchRecursively(root.rightSide, value);
		return false;
	}
}
