package com.demo.test;

import java.util.Scanner;

public class MergeSortRepeat {
	
	public static void divide(int[] arr, int start, int end) {
		if(start>=end) {
			return;
		}
		int mid = start + (end-start)/2;
		divide(arr, start, mid);
		divide(arr, mid+1,end);
		conquer(arr, start, mid, end);
		
	}
	private static void conquer(int[] arr, int start, int mid, int end) {
		int[] merged = new int[end-start+1];
		int index1 = start;
		int index2 = mid+1;
		int mergedindex = 0;
		
		while(index1<=mid && index2<=end) {
			if(arr[index1]<=arr[index2]) {
				merged[mergedindex] = arr[index1];
				mergedindex++;
				index1++;
			}
			else {
				merged[mergedindex] = arr[index2];
				mergedindex++;
				index2++;
			}
		}
		while(index1<=mid) {
			merged[mergedindex] = arr[index1];
			mergedindex++;
			index1++;
		}
		
		while(index2<=end) {
			merged[mergedindex] = arr[index2];
			mergedindex++;
			index2++;
		}
		
		for(int i=0,j=start;i<merged.length;i++,j++) {
			arr[j] = merged[i];
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements of Array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		divide(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}

}
