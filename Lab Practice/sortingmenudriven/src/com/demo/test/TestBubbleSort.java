package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;
import com.demo.services.BubbleSortServices;
import com.demo.services.BubbleSortServicesImpl;

public class TestBubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();//size
		
		int[] arr = new int[size];//new array
		System.out.println("Enter elements of Array : ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int choice =0;
		
		BubbleSortServices bservices = new BubbleSortServicesImpl();
		
		do {
			System.out.println("1: Ascending Order bubble Sort\n2: Descending order bubble Sort");
			System.out.println("3: Enter Proper Choice\n4: Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				arr=bservices.bubbleSortAscendingOrder(arr);
				System.out.println("Array After Ascending Sorting : ");
				System.out.println(Arrays.toString(arr));
				break;
				
			case 2:
				arr = bservices.bubbleSortDescendingOrder(arr);
				System.out.println("Array After Descending Sorting : ");
				System.out.println(Arrays.toString(arr));
				break;
				
			case 3:
				System.out.println("Enter Proper choice");
				break;
				
			case 4:
				System.out.println("Thankyou...");
				System.out.println("Array After Ascending Sorting : ");
				break;
				
			default:
				System.out.println("Enter your choice");
			}
			
		}while(choice !=4);

	}

}
