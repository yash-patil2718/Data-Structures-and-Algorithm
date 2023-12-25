package dsaPractiseAll;

public class SingleLinkedList {

	static class Node {
		int data;
		Node next;

		public Node() {
			data = 0;
			next = null;
		}

		public Node(int d) {
			data = d;
			next = null;
		}
	}

	Node head;

	public SingleLinkedList() {
		head = null;
	}

	public void displayAll() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			Node current = head;
			while (current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
	}

	public void addFirst(int val) {
		Node newnode = new Node(val);
		if (head == null) {
			head = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}

	public void addLast(int val) {
		Node newnode = new Node(val);
		if (head == null) {
			head = newnode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newnode;
			newnode.next = null;
		}
	}

	public void addAtPos(int val, int pos) {
		if (head == null) {
			addFirst(val);
		} else if (pos == 0) {
			addFirst(val);
		} else {
			Node newnode = new Node(val);
			Node current = head;
			for (int i = 0; i < pos - 1; i++) {
				current = current.next;
			}
			newnode.next = current.next;
//			newnode.next = current;
			current.next = newnode;
		}
	}

	public void delFirst() {
		if (head == null) {
			System.out.println("List is Empty");
		} else {
			head = head.next;
		}
	}

	public void delLast() {
		if (head == null) {
			System.out.println("List is Empty");
		}
		else if(head.next==null){
			delFirst();
		}
		else {
			
			Node current = head;
			Node temp = null;
			while (current.next != null) {
				temp = current;
				current = current.next;
			}
			temp.next = null;
		}
	}

	public void delAtPos(int pos) {
		try {
			if (head == null) {
				System.out.println("List is Empty");
			}else if(pos==0) {
				delFirst();
			}
			else {
				Node current = head;
				Node temp = null;
				for (int i = 0; i < pos; i++) {
					temp = current;
					current = current.next;
				}
				temp.next = current.next;
			}
		}catch(NullPointerException e) {
			System.out.println("Entered Position is not valid");
		}
	}
	
	public void delAll() {
		head = null;
	}

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
//		list.addFirst(10);
//		list.addFirst(20);
//		list.addLast(30);
//		list.addLast(40);
//		list.addAtPos(50, 3);
//		list.displayAll();
//		System.out.println("----------------------------------");
//		list.delFirst();
//		list.delLast();
//		list.delLast();
////		list.addAtPos(66, 2);
////		list.addAtPos(88, 0);
//		list.displayAll();

		list.addFirst(10);
		list.addFirst(20);
		list.addLast(30);
		list.addAtPos(40, 2);
		list.displayAll();
		System.out.println("-----------------------------");
//		list.delAtPos(5);
//		list.delAtPos(0);
//		list.delAtPos(1);
//		list.delAtPos(0);
//		list.delAtPos(0);
//		list.delAtPos(1);
//		list.displayAll();
		list.delAll();
		list.displayAll();

	}

}
