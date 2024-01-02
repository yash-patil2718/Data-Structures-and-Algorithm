package Question1;

public class LinkedList {
	private Node start;
	private Node rear;
	private int size;
	private int temp1 = 0;

	class Node {
		Node next;
		String data;

		public Node(String data) {
			this.data = data;
			next = null;
		}

	}

	public LinkedList() {
		start = null;
		rear = null;
		size = 10;
	}

	public LinkedList(int size) {
		this.size = size;
	}

	public void addElement(String str) {
		if (temp1 < size) {
			Node newNode = new Node(str);
			if (start == null) {
				start = newNode;
				rear = newNode;
			} else {
				while (start.next != null) {
					start = start.next;
				}
				start.next = newNode;
				start = start.next;
			}
			temp1++;
		} else {
			System.out.println("Queue if Full!!");
		}
	}

	public void removeElement() {
		if (start == null) {
			System.out.println("Queue is Empty");
		} else {
			if (rear.next == null) {
				start = null;
				rear = null;
				temp1=0;
			} else if (rear.next != null) {
				rear = rear.next;
				temp1--;
			}
		}
	}

	public void printAllElements() {
		if (start == null) {
			System.out.println("Queue is Empty");
		} else {
			Node temp = rear;
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println();
		}

	}

	public boolean isFull() {

		if (temp1 == size) {
			return true;
		}
		return false;

	}

	public boolean isEmpty() {
		if (start == null) {
			return true;
		}
		return false;
	}

}
