package com.demo.test;

import java.util.Scanner;

public class AddElementsRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers to be add : ");
		int num = sc.nextInt();
		if(num<0) {
			System.out.println("Enter positive number");
		}
		else {
			int sum = recursiveAdd(num);
			System.out.println("sum is : "+ sum);
		}
		

	}

	private static int recursiveAdd(int num) {
		if(num==1) {
			return 1;
		}
		else {
			return num+ recursiveAdd(num-1);
			
		}
	}

}
