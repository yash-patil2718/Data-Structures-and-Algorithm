package com.demo.sort;

import java.util.Arrays;

public class heapSort {

	public static void main(String[] args) {
		int[] arr= {65,35,26,13,23,12,91};
		heapsort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void heapsort(int[] arr) {
		int cnt=0;
		int n= arr.length;
		for(int i=n/2-1; i>=0;i--) {
			cnt++;
			heapify(arr, n,i);
		}
		for(int i=n-1; i>=0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			heapify(arr,i,0);
		}
		System.out.println("iteration : "+ cnt);
	}

	private static void heapify(int[] arr, int n, int i) {
		int largest =i;
		int l = 2*i+1;
		int r = 2*i+2;
		if(l<n && arr[l] > arr[largest]) {
			largest = l;
		}
		if(r<n && arr[r] > arr[largest]) {
			largest = r;
		}
		if(largest != i) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			heapify(arr,n,largest);
		}
		
	}

}
