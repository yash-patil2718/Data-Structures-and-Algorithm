package com.demo.sort;

import java.util.Arrays;

public class selectionSort {

	public static int[] SelectionSort(int[] arr) {
		int cnt=0;
		for(int i=0;i<arr.length-1;i++) {
			int pos=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] <arr[pos]) {
					pos=j;
				}
			}
			cnt++;
			swap(arr, i, pos);
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
		int[] arr = {5,33,25,12,64,10,2};
		System.out.println("sorted array : " + Arrays.toString(SelectionSort(arr)));

	}

}
