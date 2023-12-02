package com.demo.sort;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n = sc.nextInt();
		int [] arr = new int[n];
		UserInput(n, arr);
		System.out.println("Enter no. to find");
		int target = sc.nextInt();
		
		
		int pos = linearSearch(target, arr);

		if(pos != -1){
			System.out.println("target is at position : "+ pos);
		}else{
			System.out.println("Target not found");
		}
sc.close();

	}
	
	public static int[] UserInput(int n, int [] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<n;i++){
			System.out.println("Enter number "+ i+1);
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
	public static int linearSearch(int target, int[] arr) {
		for(int i=0; i<arr.length;i++){
			if(arr[i] == target){
				return i;
			}
		}
		return -1;
	}

}
