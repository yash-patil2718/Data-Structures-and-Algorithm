package graph.demo.beans;

public class SingleLinkedList {
	private Node head;
	class Node{
		int data;
		Node next;
		
	public Node(int data) {
		this.data = data;
	}
	}
	
	public void addAtStart(int data) {
		Node newnode = new Node(data);
		if(head == null) {
//			head = newnode;
		}
		else {
			newnode.next = head;
//			head = newnode;
		}
		head = newnode;
	}
	
	public void remove(int key) {
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			Node current = head;
			Node prev = null;
			
			while(current.data!=key && current.next!=null) {
				current = current.next;
				prev = current;
			}
			if(head.data == key) {
				head = head.next;
			}
			else {
				prev.next = current.next;
				current.next = null;
				current = null;
			}
		}
	}
	
	public void displaydata() {
    	Node temp=head;
    	while(temp!=null) {
    		System.out.print(temp.data+"  ");
    		temp=temp.next;
    	}
    	System.out.println();
    }
	
}
