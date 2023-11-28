package prashantPractise;

import java.util.Arrays;

public class MyQueue1 {
	static class Queue {
		int[] arr;
		int size;
		int rear = -1;
		int front = 0;

		Queue(int n) {
			arr = new int[n];
			this.size = n;
		}

		public boolean isEmpty() {
			return front > rear;
		}

		public void add(int data) {
			if (rear == size - 1) {
				System.out.println("queue is full ");
				return;
			}
			rear++;
			arr[rear] = data;

		}

		public int remove() {
			if (isEmpty()) {
				System.out.println("empty queue");
				return -1;
			}
			int front1 = arr[0];
			for (int i = 0; i < size - 1; i++) {
				System.out.println(arr[i]);
				arr[i] = 0;
			}
			rear--;
			return front1;
		}

		@Override
		public String toString() {
			return Arrays.toString(arr);
		}

	}

	public static void main(String[] args) {
		Queue q = new Queue(6);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		System.out.println(q);
//		while (!q.isEmpty()) {
			q.remove();
//		}
		
		System.out.println(q);

	}

}
