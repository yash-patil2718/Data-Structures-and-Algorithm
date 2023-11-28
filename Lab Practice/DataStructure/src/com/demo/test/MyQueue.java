package com.demo.test;

import java.util.Arrays;

public class MyQueue {
	private static int[] queuearr;
	private static int size;
	private static int front;
	private static int rear;
	
	public MyQueue() {
		size = 10;
		queuearr = new int[size];
		front = 0;
		rear = -1;
	}
	
	public MyQueue(int d) {
		size = d;
		queuearr = new int[size];
		front = 0;
		rear = -1;
	}
	
	public static boolean isFull() {
		if(rear == size-1) {
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
		if(isFull()) {
			System.out.println("Queue is Full");
		}
		else {
			rear++;
			queuearr[rear] = value;
			System.out.println("Element added in queue "+ value);
		}
	}
	
	public static int dequeue() {
		if(isEmpty()) {
			return -1;
		}
		else {
			int n = queuearr[front];
			 front++;
			 return n;
		}
	}
	
	public String toString() {
		return Arrays.toString(queuearr);
		
	}
	public static void main(String[] args) {
		
		MyQueue ob = new MyQueue();
		ob.enqueue(10);
		ob.enqueue(45);
		ob.enqueue(100);
		ob.enqueue(95);
		ob.enqueue(50);
		ob.enqueue(48);
		System.out.println(ob);
		ob.dequeue();
		System.out.println(ob);
	}

}
