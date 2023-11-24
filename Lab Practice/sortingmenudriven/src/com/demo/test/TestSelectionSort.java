package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.services.SelectionSortImpl;
import com.demo.services.SelectionSortServices;

public class TestSelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int size = sc.nextInt();
		System.out.println("Enter elements of array : ");
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int choice = 0;
		
		SelectionSortServices sservices = new SelectionSortImpl();
		
		do {
			System.out.println("1: Ascending Order selection Sort\n2: Descending order selection Sort");
			System.out.println("3: Enter Proper Choice\n4: Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Array After Ascending Sorting : ");
				arr = sservices.ascendingOrderSelectionSort(arr);
				System.out.println(Arrays.toString(arr));
				break;
				
			case 2:
				System.out.println("Array After Descending Sorting : ");
				arr = sservices.descendingOrderSelectionSort(arr);
				System.out.println(Arrays.toString(arr));
				break;
				
			case 3:
				System.out.println("Enter Proper Choice...");
				break;
				
			case 4:
				System.out.println("Thankyou...");
				System.exit(0);
				break;
				
			default:
				System.out.println("Enter your choice...");
			}
		}while(choice!=4);

	}

	
}
