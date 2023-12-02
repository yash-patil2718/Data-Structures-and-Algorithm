package com.demo.sort;

import java.util.Arrays;

public class insertionSort {
	
	public static void insertion(int[] arr) {
		int cnt=0;
		for(int i =0; i<arr.length-1;i++) {
			for(int j=i+1; j>0;j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr, j, j-1);
				}else {
					break;
				}
			}
			cnt++;
		}
		System.out.println("iteration : "+ cnt);
	}
	static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
	

	public static void main(String[] args) {
		int[] arr = {5,33,25,12,64,10,2};
		insertion(arr);
		System.out.println("sorted array : " +Arrays.toString(arr));
	}

}
