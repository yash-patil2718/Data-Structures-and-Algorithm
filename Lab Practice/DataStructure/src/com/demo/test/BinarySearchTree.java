package com.demo.test;

public class BinarySearchTree {
	class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int val){
			data = val;
			left = null;
			right = null;
		}
	}
	
	private Node root;
	
	public BinarySearchTree(){
		root = null;
	}
	
	public void insertData(int key) {
		root = insertRecursion(root, key);
	}

	private Node insertRecursion(Node root, int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(key<root.data) {
			root.left = insertRecursion(root.left, key);
		}
		else {
			root.right = insertRecursion(root.right, key);
		}
		return root;
		
	}
	
	public void inorder() {
		inorderTraversal(root);
	}

	private void inorderTraversal(Node root) {
		if(root!=null) {
			inorderTraversal(root.left);
			System.out.print(root.data+",");
			inorderTraversal(root.right);
		}
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree(); 
		bst.insertData(45);
		bst.insertData(78);
		bst.insertData(12);
		bst.insertData(56);
		bst.insertData(26);
		bst.insertData(13);
		bst.insertData(54);
		bst.insertData(92);
		bst.insertData(11);
		bst.insertData(02);
		
//		bst.insertData(60);
//		bst.insertData(35);
//		bst.insertData(75);
//		bst.insertData(40);
//		bst.insertData(20);
//		bst.insertData(70);
//		bst.insertData(85);
		System.out.println("Inorder Traversal is : ");
		bst.inorder();
		System.out.println();
	}

}
