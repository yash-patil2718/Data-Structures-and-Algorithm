package com.demo.test;

import java.util.Scanner;

public class RecursiveFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factorial : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("Enter positive number");
		}
		else {
			int fact = factorialRecursive(num);
			System.out.println(fact);
		}

	}

	private static int factorialRecursive(int num) {
		if(num==0) {
			return 1;
		}
		if(num==1) {
			return 1;
		}
		else {
			return num * factorialRecursive(num - 1);
		}
	}

}
