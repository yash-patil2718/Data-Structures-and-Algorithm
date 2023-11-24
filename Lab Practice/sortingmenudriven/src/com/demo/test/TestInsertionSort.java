package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.services.*;

public class TestInsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		System.out.println("Enter elements of array : ");
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int choice = 0;
		
		InsertionSortServices iservices = new InsertionSortImpl();
		
		do {
			System.out.println("1: Sort Array By Ascending Order\n2: Sort Array By Descending Order");
			System.out.println("3: Exit\n");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Array Sorted using Ascending Order");
				arr = iservices.sortAscendingOrder(arr);
				System.out.println(Arrays.toString(arr));
				break;
				
			case 2:
				System.out.println("Arrays Sorted using Descending Order");
				arr = iservices.sortDescendingOrder(arr);
				System.out.println(Arrays.toString(arr));
				break;
				
			case 3:
				System.out.println("Thankyou...");
				System.exit(0);
			}
		}while(choice!=3);
		

	}

}
