package com.demo.test;

import java.util.Arrays;

public class CircularQueue {
	private int[] Circularqueuearr;
	private int size;
	private int front = -1;
	private int rear = -1;
	
	public CircularQueue(int size) {
		Circularqueuearr = new int[size];
		this.size = size;
	}
	
	public boolean isEmpty() {
		if(front==-1) {//gives error for condition (rear==-1 && front==-1)
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if((rear+1)%size==front) {
			return true;
		}
		return false;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("queue is full");
		}
		else {
			rear = (rear+1)% size;
			Circularqueuearr[rear] = data;
			front = 0;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}
		else {
			int result = Circularqueuearr[front];
			if(rear==front) {
				rear= front= -1;
			}
			else {
				front = (front+1)%size;
			}
			return result;
		}
	
	}
	
	
	@Override
	public String toString() {
		return  Arrays.toString(Circularqueuearr);
	}

	public static void main(String[] args) {
		CircularQueue cqa = new CircularQueue(5);
		cqa.enqueue(15);
		cqa.enqueue(45);
		cqa.enqueue(12);
		cqa.enqueue(78);
		cqa.enqueue(88);
		System.out.println(cqa);
		cqa.dequeue();
		System.out.println(cqa);
		//cqa.enqueue(52);
		//System.out.println(cqa);

	}

}
