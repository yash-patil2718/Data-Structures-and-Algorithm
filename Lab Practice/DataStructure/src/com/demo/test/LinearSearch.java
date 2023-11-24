package com.demo.test;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		System.out.println("enter numbers in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " , ");
//		}

		System.out.println("enter numbers to find from array :");
		int search = sc.nextInt();
		int j;
		for (j = 0; j < arr.length; j++) {
			if (arr[j] == search) {
				System.out.println(j);
				break;
			}

		}
		if (j == arr.length) {
			System.out.println("num not found");
		}

	}

}
