package com.programmingSearch.dataStructure.tree;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {

	Node root;

	private class Node {
		Node leftChild;
		Node rightChild;
		int data;
	}

	public LowestCommonAncestor() {
		root = null;
	}

	public boolean insertItem(int data) {

		Node n = new Node();
		n.leftChild = null;
		n.rightChild = null;
		n.data = data;

		if (root == null) {
			root = n;
			return true;
		}

		Node parent = root;
		Node child = root;

		while (child != null) {
			parent = child;
			if (child.data > n.data) {
				child = child.leftChild;
			} else {
				child = child.rightChild;
			}
		}

		if (parent.data > n.data) {
			parent.leftChild = n;
		} else {
			parent.rightChild = n;
		}
		return true;
	}

	public void showAll(Node n) {
		Node p = n;
		if (p != null) {
			System.out.println(" " + p.data);
			showAll(p.leftChild);
			showAll(p.rightChild);
		}
	}

	public void show() {
		showAll(this.root);
	}

	public int lca(int p, int q) {

		Node node = lcabinarytree(root, findNode(root,p), findNode(root,q));
		return node.data;

	}

	/**
	 * This method is to find Node for binaryTree
	 * @param node
	 * @param data
	 * @return
	 */
	public Node findNode(Node node, int data) {

		if (node != null) {
			if (data == node.data) {
				return node;
			}

			else {
				Node foundNode = findNode(node.leftChild, data);
				if (foundNode == null) {
					foundNode = findNode(node.rightChild, data);
				}
				return foundNode;

			}
		}else{
			return null;
		}
		
	}

	public Node lowestCommonAncestor(Node root, int p, int q) {
		if (root.data > Math.max(p, q)) {
			return lowestCommonAncestor(root.leftChild, p, q);
		} else if (root.data < Math.min(p, q)) {
			return lowestCommonAncestor(root.rightChild, p, q);
		} else {
			return root;
		}
	}

	public Node lcabinarytree(Node root, Node n1, Node n2) {
		if (root == null) {
			return null;
		}
		if (root == n1 || root == n2) {
			return root;
		}
		Node left = lcabinarytree(root.leftChild, n1, n2);
		Node right = lcabinarytree(root.rightChild, n1, n2);
		if (left != null && right != null) {
			return root;
		}
		if (left == null && right == null) {
			return null;
		}
		return left != null ? left : right;
	}
	
	/**
	 * https://www.youtube.com/watch?v=Jg4E4KZstFE
	 * */
	public boolean rootToLeafSum(Node root,int sum, List<Integer> result){
		
		if(root == null){
			return false;
		}
		
		//check for leaf node
		if(root.leftChild == null && root.rightChild == null){
			if(root.data == sum){
				result.add(root.data);
				return true;
			}else{
				return false;
			}
			
		}
		if(rootToLeafSum(root.leftChild,sum-root.data,result)){
			result.add(root.data);
			return true;
		}
		if(rootToLeafSum(root.rightChild,sum-root.data,result)){
			result.add(root.data);
			return true;
		}
		
		return false;
	}
	
	/**
	 * 
	 * Check if tree is binarSearch tree
	 * @param node
	 * @param min
	 * @param max
	 * @return
	 */
	public boolean isBST(Node node,int min,int max){
		if(node ==null){
			return true;
		}
		
		if(node.data <=min || node.data >max){
			return false;
		}
	
		return isBST(node.leftChild,min,node.data) && isBST(node.rightChild,node.data,max);
	}
	
	/**
	 * Calculate height of left side, calculate height of right side and then you add one to it.
	 * */
	
	int height(Node root){
		
		if(root ==null){
			return 0;
		}
		int left = height(root.leftChild);
		int right = height(root.rightChild);
		return 1+ Math.max(left,right);
	}

	
	int size(Node root){
		
		if(root ==null){
			return 0;
		}
		int left = size(root.leftChild);
		int right = size(root.rightChild);
		return (left+right+1);
	}
	public static void main(String args[]) {

		LowestCommonAncestor lca = new LowestCommonAncestor();
		lca.insertItem(10);
		lca.insertItem(5);
		lca.insertItem(30);
		lca.insertItem(8);
		lca.insertItem(6);
		lca.insertItem(9);
		lca.show();
		System.out.println(lca.lca(6, 9));
		System.out.println("Anser should be 8");
		
		List<Integer> array = new ArrayList();
		lca.rootToLeafSum(lca.root, 40, array);
		System.out.println(array);
		
		System.out.println("Check if binar tree "+lca.isBST(lca.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		
		System.out.println("Check size of binary tree "+lca.size(lca.root));
		
	}
}
