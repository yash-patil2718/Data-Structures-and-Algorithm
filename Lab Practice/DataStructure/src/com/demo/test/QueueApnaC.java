package com.demo.test;

public class QueueApnaC {
	public class Queue{
		static int arr[];
		static int size;
		static int rear = -1;
		static int front = 0;
		
		Queue(int size){
			arr = new int[size];
			this.size = size;
		}
		
		public boolean isEmpty() {
			if(front>size) {
				return true;
			}
			return false;
		}
		
		public void add(int data) {
			if(rear == size-1) {
				System.out.println("Queue is Full");
				return ;
			}
			else {
				rear++;
				arr[rear] = data;
			}
		}
		
		public int delete() {
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			int front = arr[0];
			for(int i=0;i<rear;i++) {
				arr[i] = arr[i+1];
			}
			rear--;
			return front;
			
		}
	}
	public static void main(String[] args) {
//		Queue q = new Queue(5);
		
		

	}

}
