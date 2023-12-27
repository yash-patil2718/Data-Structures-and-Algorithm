package dsaPractiseAll;

public class SinglyCircularLinkedList {
	
	Node head;
	static class Node{
		int data;
		Node next;
		
		public Node() {
			data = 0;
			next  = null;
		}
		
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public SinglyCircularLinkedList() {
		head = null;
	}
	
	public void display() {
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			Node current = head;
			 do{
				System.out.println(current.data);
				current = current.next;
			}while(current!=head);
		}
	}
	
	public void addFirst(int val) {
		Node newnode = new Node(val);
		if(head == null) {
			head = newnode;
			newnode.next = head;
		}else {
			Node current = head;
			while(current.next!=null) {
				current = current.next;
			}
			current.next = newnode;
			newnode.next = head;
			head= newnode;
		}
	}
	
	public void addLast(int val) {
		Node newnode = new Node(val);
		if(head==null) {
			addFirst(val);
		}
		else {
			Node current = head;
			while(current.next!=head) {
				current = current.next;
			}
			newnode.next = head;
			current.next = newnode;
		}
	}
	
	public void addAtPos(int val, int pos) {
		if(head==null) {
			addFirst(val);
		}
		else if(pos<1) {
			System.out.println("Enter valid Position");
		}
		else {
			Node newnode = new Node(val);
			Node current = head;
			for(int i=1;i<pos-1;i++) {
				current = current.next;
			}
			newnode.next = current.next;
			current.next = newnode;
			}
	}
	
	public void delFirst() {
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			Node current = head;
			while(current.next!=head) {
				current = current.next;
			}
			current.next = head;
			head = head.next;
		}
	}
	
	public void delLast() {
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			Node current = head;
			Node temp = null;
			while(current.next!=head) {
				temp = current;
				current = current.next;
			}
			temp.next = head;
		}
	}
	
	public void delAtPos(int pos) {
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			Node current = head;
			Node temp = null;
			for(int i=1;i<pos;i++) {
				temp = current;
				current = current.next;
			}
			temp.next = current.next;
		}
	}
	
	public void delAll() {
		head = null;
	}

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.addFirst(45);
		list.addFirst(55);
		list.addLast(78);
		list.addAtPos(88, 2);
		list.addAtPos(36, 3);
		list.delAtPos(3);
		list.delLast();
		list.delFirst();
		list.delAll();
		list.displayAll();
	}

}
