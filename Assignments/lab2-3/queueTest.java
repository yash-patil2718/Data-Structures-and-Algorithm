package com.demo.test;

import com.demo.beans.Myqueue;

public class queueTest {

	public static void main(String[] args) {
		Myqueue ob = new Myqueue(5);
		ob.enque(5);
		ob.enque(7);
		ob.display();
		ob.enque(10);
		ob.deque();
		ob.enque(15);
		ob.enque(4);
		ob.enque(7);
		ob.display();

	}

}
