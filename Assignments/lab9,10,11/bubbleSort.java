package com.demo.sort;

import java.util.Arrays;

public class bubbleSort {
	
	public static int[] BubbleSort(int[] arr) {
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
			cnt++;
		}
		System.out.println("iteration : "+ cnt);
		return arr;
	}
	
	public static void swap( int[] arr, int n1, int n2) {
				int temp=arr[n1];
				arr[n1]=arr[n2];
				arr[n2]=temp;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {5,33,25,12,64,42,15};
		System.out.println("sorted array : " + Arrays.toString(BubbleSort(arr)));
	}

}
