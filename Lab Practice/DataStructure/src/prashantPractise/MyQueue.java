package prashantPractise;

import java.util.Arrays;

public class MyQueue {
	
	private static int[] queuearr;
	private static int size;
	private static int front;
	private static int rear;
	
	public MyQueue() {
		size = 10;
		queuearr = new int[10];
		front = 0;
		rear = -1;
	}
	
	public MyQueue(int d) {
		size = d;
		queuearr = new int[d];
		front = 0;
		rear = -1;
	}
	
	public static boolean isFull() {
		if(rear == size -1) {
			return true;
		}
		return false;
		
	}
	
	public static boolean isEmpty() {
		if(front>rear) {
			return true;
		}
		return false;
	}
	
	public static void enqueue(int value) {
		if(!isFull()) {
			rear++;
			queuearr[rear] = value;
			System.out.println(value+" added in queue");
		}
		else {
			System.out.println("queue is not empty");
		}
	}
	
	public static int dequeue() {
		if(!isEmpty()) {
			int n = queuearr[front];
			System.out.println("Removed element from queue values " + front);
			front++;
			return n;
		}
		return -1;
	}
	
	public String toString() {
		return Arrays.toString(queuearr)+" front :"+front+" rear: "+rear;
	}
	
	public static void main(String[] args) {
		MyQueue ob = new MyQueue();
		ob.enqueue(10);
		ob.enqueue(25);
		ob.enqueue(15);
		ob.enqueue(22);
		ob.enqueue(45);
		System.out.println(ob);
		ob.dequeue();
		ob.enqueue(88);
		System.out.println(ob);

	}

}
