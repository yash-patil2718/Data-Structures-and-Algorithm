package com.demo.test;

public class CircularSinglyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int n){
			data = n;
			next = null;
		}
	}
	
	CircularSinglyLinkedList() {
		head = null;
	}
	
	public void addByPosition(int pos, int val) {
		Node newnode = new Node(val);
		
		if(head==null) {
			head = newnode;
			newnode.next = head;
		}
		else {
			if(pos==1) {
				Node temp = head;
				while(temp.next!=null) {
					temp = temp.next;
				}
				newnode.next = head;
				head = newnode;
				temp.next = head;
			}
			else {
				Node temp = head;
				int i;
				for(i=1;temp.next!=head && i<pos-1;i++) {
					temp = temp.next;
				}
				newnode.next = temp.next;
				temp.next = newnode;
			}
		}
	}
	
	public void displaydata() {
		Node temp=head;
		while(temp.next!=head) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}

	public static void main(String[] args) {
		CircularSinglyLinkedList ob = new CircularSinglyLinkedList();
		ob.addByPosition(1, 45);
		ob.addByPosition(2, 56);
		ob.addByPosition(3, 46);
		ob.addByPosition(4, 66);
		ob.displaydata();
	}

}
