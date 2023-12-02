package com.demo.beans;

public class BST {
	class node{
		int data;
		node left,right;
		public node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
	}
	private node root;
	public BST() {
	root=null;
	}
	public void insert(int key) {
		root=insertRec(root,key);
		
	}
	private node insertRec(node root, int key) {
		if(root==null) {
			root=new node(key);
		
		}
		
		else if(key<=root.data) {
			root.left=insertRec(root.left,key);
			
		}
		else {
			root.right=insertRec(root.right,key);
		}
		return root;
	}
	public void inorder() {
		inordertriversal(root);
	}
	public void preorder() {
		preordertriversal(root);
	}
	private void preordertriversal(node root) {
		if(root!=null) {
		System.out.print(root.data+",");
		preordertriversal(root.left);
		preordertriversal(root.right);
		}
		
		
	}
	public void postorder() {
		postordertriversal(root);
	}
	
	private void postordertriversal(node root) {
		if(root!=null) {
		postordertriversal(root.left);
		postordertriversal(root.right);
		System.out.print(root.data+",");
		}
	}
	private void inordertriversal(node root) {
		if(root!=null) {
			inordertriversal(root.left);
			System.out.print(root.data+",");
			inordertriversal(root.right);
		}
	}
}


