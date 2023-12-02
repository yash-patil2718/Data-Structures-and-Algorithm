package com.demo.stack;

import java.util.Scanner;

public class StringStack {
	private int[] arr;
	private int size;
	private int top;
	public StringStack() {
		arr=new int[10];
		size=10;
		top=-1;
	}
	public StringStack(int n) {
		arr=new int[n];
		size=n;
		top=-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==size-1;
	}
	public boolean push(int n) {
		if (isFull()) {
			System.out.println("stack overflow");
			return false;
		}
		else {
			top++;
			arr[top]=n;
			return true;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack underflow");
			return -1;
		}
		else {
			int num=arr[top];
			top--;
			return num;
			
		}
	}



public static void main(String[] args) {
	StringStack ob=new StringStack(20);
	Scanner sc=new Scanner(System.in);
	String str="({)}";
    boolean status=checkBalanceParenthesis(str);
    if(status) {
    	System.out.println("string is balanced");
    }
    else {
    	System.out.println("string is not balanced");
    }

}

private static boolean checkBalanceParenthesis(String str) {
	StringStack ob=new StringStack(str.length());
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='(' || ch=='{' || ch=='[') {
			ob.push(ch);
		}else {
			if(ch==')' || ch=='}' || ch==']' ) {
				if(!ob.isEmpty()) {
				     char ch1=(char) ob.pop();
				     if((ch==')' && ch1!='(') || (ch==']' && ch1!='[') 
				     || (ch=='}' && ch1!='{')) {
				    	 return false;
				     }
				}
				else {
					return false;
				}
				
				
			}
		}
	}
	if(ob.isEmpty())
		return true;
	else
		return false;
	
}

}

