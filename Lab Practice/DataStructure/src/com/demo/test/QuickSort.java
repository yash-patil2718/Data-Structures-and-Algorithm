package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	
	public static void quicksort(int[] arr, int start, int end) {
		if(start<end) {
			int p = partition(arr,start,end);
			quicksort(arr, start, p);
			quicksort(arr, p+1,end);
		}
	}
	private static int partition(int[] arr, int start, int end) {
		int pivot = start;
		int first = start;
		int last = end;
		while(first<last) {
			while(first<last && arr[first]<=arr[pivot]) {
				first++;
			}
			while(last>pivot && arr[last]>arr[pivot]) {
				last--;
			}
			
			if(first<last) {
				int temp = arr[first];
				arr[first] = arr[last];
				arr[last] = temp;
			}
		}
		int temp = arr[last];
		arr[last] = arr[pivot];
		arr[pivot] = temp;
		return last;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int size = sc.nextInt();
		System.out.println("Enter elements of Array : ");
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		quicksort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
