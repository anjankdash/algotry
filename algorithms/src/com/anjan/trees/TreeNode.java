package com.anjan.trees;

/**
 * TreNode implementation.. This will be used in BST
 * 
 * @author ADASH
 *
 */
public class TreeNode {

	private int value;
	private TreeNode left;
	private TreeNode right;

	public TreeNode(int i) {
		this.value = i;
		left = null;
		right = null;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

}
