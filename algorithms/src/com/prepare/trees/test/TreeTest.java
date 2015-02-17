package com.prepare.trees.test;

import static org.junit.Assert.*;

import javax.xml.ws.ServiceMode;

import org.junit.Test;

import com.anjan.trees.BST;
import com.anjan.trees.TreeNode;

public class TreeTest {

	BST bst = null;
	
	

	public void Setup(){
		bst = new BST();
		bst.insertNode(new TreeNode(18));
		bst.insertNode(new TreeNode(20));
		bst.insertNode(new TreeNode(21));
		bst.insertNode(new TreeNode(19));
		bst.insertNode(new TreeNode(4));
		bst.insertNode(new TreeNode(15));
		bst.insertNode(new TreeNode(13));
		bst.insertNode(new TreeNode(1));
		bst.insertNode(new TreeNode(2));
		bst.insertNode(new TreeNode(8));
		bst.insertNode(new TreeNode(10));
		bst.insertNode(new TreeNode(28));
	}
	
	@Test
	public void test() {
		Setup();
		String inorderTraversalString = bst.inOrder(bst.getRoot());
		System.out.println(inorderTraversalString);
		assertTrue(!"".equalsIgnoreCase(inorderTraversalString));
		
		System.out.println( " Height is : " +bst.getHeight( bst.getRoot(), 0));
		bst.printTree();
	}

}
