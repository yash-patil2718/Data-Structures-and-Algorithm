package com.demo.test;

import java.util.Scanner;

public class BinarySearch1 {

	public static void acceptData(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of an array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public static int searchNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be searched : ");
		return sc.nextInt();
	}

	public static int binarySearch(int first, int last, int search, int[] arr) {

		if (first > last) {
			return -1;
		} else {
			int mid = (first + last) / 2;
			if (arr[mid] == search) {
				return mid;
			} else if (arr[mid] < search) {
				return binarySearch(mid + 1, last, search, arr);
			} else {
				return binarySearch(first, mid - 1, search, arr);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		acceptData(arr);

		int search = searchNumber();

		int pos = binarySearch(0, arr.length - 1, search, arr);
		if (pos != -1) {
			System.out.println("Number found at: " + pos);
		} else {
			System.out.println("number not found");
		}
	}

}
