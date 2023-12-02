package com.demo.stack;

import java.util.Arrays;

public class Mystack {
	private int[] arr;
	private int size;
	private int top;
	
	public Mystack() {
		arr=new int[10];
		size=10;
		top=-1;
	}
	public Mystack(int n) {
		arr=new int[n];
		size=n;
		top=-1;
	}
	public Boolean isEmpty() {
		if(top==-1) {
			System.out.println("Stack Empty");
			return true;
		}
		else {
			return false;
		}
	}
		
	public Boolean isFull() {
		if (top==size-1) {
			
			return true;
		}
		else {
			return false;
		}
		
	}
	@Override
	public String toString() {
		return "Mystack [arr=" + Arrays.toString(arr) + "]";
	}
	public boolean push(int i) {
		if(isFull()) {
		System.out.println("Stack Overflow");	
		return false;
		}
		else {
			top++;
			arr[top]=i;
			return true;
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("stsck empty");
			return -1;
			
			
		}
		else {
			int num=arr[top];
			top--;
			return num;
		}
	}
		
}
