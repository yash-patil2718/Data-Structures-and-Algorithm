package com.demo.test;

public class MyStack {
	private static int[] arr;
	private static int size;
	private static int top;
	
	public MyStack() {
		
	}
	
	public MyStack(int n) {
		arr = new int[n];
		size = n;
		top = -1;
	}
	
	public static boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	public static boolean isFull() {
		if(top == size-1) {
			return true;
		}
		return false;
	}
	
	public static boolean push(int num) {
		if(isFull()) {
			System.out.println("Stack is Full");
			return false;
		}
		else {
			arr[++top]=num;
			return true;
		}
	}
		
	
	public static int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
			
		}
		else {
			int num=arr[top--];
			return num;
		}
	}

	public static void main(String[] args) {
		MyStack ob = new MyStack();
		ob.push(12);
		ob.push(34);
		ob.push(55);
		ob.push(52);
		ob.push(53);
		ob.push(51);
		while(!ob.isEmpty())
		   System.out.println(ob.pop());

	}

}
