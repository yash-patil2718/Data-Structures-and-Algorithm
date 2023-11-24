package com.demo.test;

import java.util.Scanner;

public class AddElements {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(addElements(arr));
		
	}

	private static int addElements(int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
