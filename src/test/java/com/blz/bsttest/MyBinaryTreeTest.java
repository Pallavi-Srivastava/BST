package com.blz.bsttest;

import org.junit.Test;
import com.blz.bstpratice.MyBinaryTree;
import org.junit.Assert;

public class MyBinaryTreeTest {

	// UC1
	@Test
	public void added_3NumberIntoBST() {
		MyBinaryTree<Integer> bst = new MyBinaryTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		int size = bst.getSize();
		Assert.assertEquals(3, size);
	}
}
