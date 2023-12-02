package com.demo.beans;

import java.util.Arrays;

public class Myqueue {
	private int[] qarr;
	private int front;
	private int back;
	private int size;
	
	public Myqueue() {
		size=10;
		front=0;
		back=-1;
		qarr=new int[10];
	}
	public Myqueue(int size) {
		this.size=size;
		qarr=new int[size];
		front =0;
		back=-1;
	}
	
	public boolean isfull() {
		return back==size-1; 
						
		
		
		}
	public boolean isempty() {
		return front>back;
	}
	
	public void enque(int n) {
		if (isfull()) {
			System.out.println("queue is full");
		}
		else {
			qarr[++back]=n;
		}
		
	}
	public int deque() {
		if(isempty()) {
			System.out.println("queue empty");
			return -1;
		}
		else {
			front++;
			System.out.println("value removed:"+qarr[front-1] );
			return qarr[front-1];
		}
	}
	public void display() {
		System.out.println(Arrays.toString(qarr));
	}
}
