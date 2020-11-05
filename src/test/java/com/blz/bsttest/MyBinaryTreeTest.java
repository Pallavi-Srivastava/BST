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

	// UC2
	@Test
	public void added_MoreNumberIntoBST() {
		MyBinaryTree<Integer> bst = new MyBinaryTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.add(60);
		bst.add(95);
		bst.add(65);
		bst.add(63);
		bst.add(67);
		bst.add(22);
		bst.add(40);
		bst.add(11);
		bst.add(3);
		bst.add(16);
		int size = bst.getSize();
		Assert.assertEquals(13, size);
	}

	// UC3
	@Test
	public void search_NumberIntoBST() {
		MyBinaryTree<Integer> bst = new MyBinaryTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.add(60);
		bst.add(95);
		bst.add(65);
		bst.add(63);
		bst.add(67);
		bst.add(22);
		bst.add(40);
		bst.add(11);
		bst.add(3);
		bst.add(16);
		boolean res = bst.searchRecursively(bst.root, 30);
		Assert.assertTrue(res);
	}
}
