package prashantPractise;

import java.util.Stack;

public class addnew {
      
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		 
		//int data = 0;
		pushAtBottom(4,s);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		

	}

	private static int pushAtBottom(int data,Stack<Integer>s) {
		if(s.isEmpty()) {
			s.push(data);
			return data;
		}
		
		int top=s.pop();
		pushAtBottom(data,s);
		return s.push(top);
		
	}

}
