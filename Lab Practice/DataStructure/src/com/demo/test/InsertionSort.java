package com.demo.test;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {21,15,45,62,12};
		
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j=i-1;
			for(;j>=0 && arr[j]>key;j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = key;
		}
		System.out.println("Sorted Array After Insertion Sort : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
