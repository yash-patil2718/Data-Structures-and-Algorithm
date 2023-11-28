package com.demo.test;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size;
	class Node{
		String data;
		Node next;
	
	
	Node(String data){
		this.data = data;
		this.next = null;
	}
	
	}
	LinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	
	public void addFirst(String data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
			return;
		}
		else {
			newnode.next = head;
			head = newnode;
		}
	}
	
	public void addPosition(String data, int pos) {
		Node newnode = new Node(data) ;
			if(head == null && pos!=1) {
				System.out.println("List is Empty");
			}
				if(pos==1) {
					if(head==null) {
						head = newnode;
					}
					else {
						newnode.next = head;
						newnode = head;
					}
				}
				else {
					Node temp = head;
					for(int i=1;temp!=null && i<pos-1;i++) {
						temp = temp.next;
					}
					if(temp!=null) {
						newnode.next=temp.next;
						temp.next=newnode;
					}
					else {
						System.out.println("position is wrong");
					}
				}
			}
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			head = head.next;
		}
	}
	
	public void deleteByPosition(int pos) {
		Node temp = head;
		for(int i=1;i<pos-1;i++) {
			temp = temp.next;
		}
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			head = head.next;
		}
		
	}
	
	public void displayList() {
		if(head == null) {
			System.out.println("List is Empty");
		}
		
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst("yash");
		list.displayList();
		System.out.println();
		list.addFirst("prashant");
		list.addFirst("asjffk");
		list.displayList();
		System.out.println();
		list.addPosition("ghdkdj", 2);
		list.addPosition("jdbc", 3);
		list.displayList();
		System.out.println();
		list.deleteFirst();
		list.displayList();
	}

}
