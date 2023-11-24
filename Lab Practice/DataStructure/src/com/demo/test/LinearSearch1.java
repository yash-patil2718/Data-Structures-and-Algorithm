package com.demo.test;

import java.util.Scanner;

public class LinearSearch1 {
	public static int SearchNumber(int arr[], int search) {
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == search) {
				return j;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array :");
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter element to be search :");
		int search = sc.nextInt();
		int pos = SearchNumber(arr, search);
		if (pos != -1) {
			System.out.println(search + " is found in position " + pos);
		} else {
			System.out.println(search + " not found");
		}
	}

}
