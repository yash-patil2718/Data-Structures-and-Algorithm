package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.services.MergeSortImpl;
import com.demo.services.MergeSortServices;

public class TestMergeSort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int size = sc.nextInt();
		
		System.out.println("Enter Elements of Array : ");
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		MergeSortServices mservices = new MergeSortImpl();
		
		int choice = 0;
		do {
			System.out.println("1: Sort Array using Ascending Order\n2: Sort Array using Descending Order");
			System.out.println("3: Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				mservices.sortAscendingOrder(arr);
				System.out.println(Arrays.toString(arr));
				break;
			}
		}while(choice != 3);
	}

}
