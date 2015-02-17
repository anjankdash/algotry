package com.anjan.trees;

import java.util.ArrayList;
import java.util.Queue;

/**
 * Binary Search Tree
 * 
 * @author ADASH
 *
 */
public class BST {
	TreeNode root;

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public boolean insertNode(TreeNode tn) {
		if (root == null) {
			root = tn;
			return true;
		} else {
			return insert(root, tn);
		}
	}

	/**
	 * @param currentNode
	 * @param tn
	 * @return
	 */
	private boolean insert(TreeNode currentNode, TreeNode tn) {

		if (tn.getValue() < currentNode.getValue()) {
			if (currentNode.getLeft() == null) {
				currentNode.setLeft(tn);
				return true;
			} else {
				return insert(currentNode.getLeft(), tn);
			}
		} else if (tn.getValue() > currentNode.getValue()) {
			if (currentNode.getRight() == null) {
				currentNode.setRight(tn);
				return true;
			} else {
				return insert(currentNode.getRight(), tn);
			}
		} else {
			throw new RuntimeException("Error : Duplicate value !!");
		}

	}

	/**
	 * Function to get inOrder traversal of BST
	 * 
	 * @param rootNode
	 *            : root node of the tree
	 * @return : String containing comma separated results of inOrder traversal
	 */
	public String inOrder(TreeNode rootNode) {

		String resultString = "";
		if (rootNode == null) {
			return "";
		} else {
			return inOrderTraversal(rootNode, resultString);
		}
	}

	public String inOrderTraversal(TreeNode treeNode, String resultString) {

		if (treeNode == null) {
			return resultString + "";
		}
		return resultString
				+ inOrderTraversal(treeNode.getLeft(), resultString)
				+ (treeNode.getValue() + " , ") + resultString
				+ inOrderTraversal(treeNode.getRight(), resultString);
	}

	/**
	 * Print the tree in human readable format as shown in algorithm books
	 * 
	 */
	public void printTree() {
		ArrayList<TreeNode> arrayOfTNOdes = new ArrayList<TreeNode>();
		arrayOfTNOdes.add(root);
		int height = getHeight(root, 0);
		printTree(arrayOfTNOdes, 0, height);
	}

	/**
	 * @param listOfNodes
	 *            : list of tree nodes in a particular level
	 * @param level
	 *            : Level from root
	 * @param height
	 *            : heigh of the tree
	 */
	private void printTree(ArrayList<TreeNode> listOfNodes, int level,
			int height) {

		if (listOfNodes.isEmpty() || level >= height)
			return;

		ArrayList<TreeNode> tempList = new ArrayList<TreeNode>();

		for (int i = 0; i < listOfNodes.size(); i++) {

			TreeNode tn = listOfNodes.get(i);
			if (tn != null) {
				printSpaces(height - level, i);
				System.out.print("" + tn.getValue());
				tempList.add(tn.getLeft());
				tempList.add(tn.getRight());
			} else {
				printSpaces(height - level, i);
				System.out.print(" ");
				tempList.add(null);
				tempList.add(null);
			}

		}

		System.out.println("");
		printTree(tempList, level + 1, height);

	}

	/**
	 * Method to print the required number of spaces to format the TREE
	 * correctly.
	 * 
	 * @param n
	 *            : is difference of Height of tree and level number when
	 *            traversing from top to bottom in the tree
	 * @param position
	 *            : position of the
	 */
	private void printSpaces(int n, int position) {
		int spaceCount = 0;
		if (position == 0) {
			spaceCount = (int) (Math.pow(2, n) - 1);
		} else {
			spaceCount = (int) Math.pow(2, n + 1) - 1;
		}

		for (int i = 0; i < spaceCount; i++) {
			System.out.print(" ");
		}
	}

	/**
	 * Get Height of tree by traversing the tree recursively
	 * 
	 * @param root
	 * @param height
	 * @return
	 */
	public int getHeight(TreeNode root, int height) {
		if (root == null)
			return 0;
		return Math.max(getHeight(root.getLeft(), height),
				getHeight(root.getRight(), height)) + 1;
	}

}
