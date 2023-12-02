package com.demo.sort;

import java.util.Arrays;

public class modBubbleSort {

	public static int[] ModifyBubbleSort(int[] arr) {
		boolean flag;
		int cnt = 0;
		for(int i=0;i<arr.length;i++) {
			flag = false;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					flag = true;
				}
			}
			if(!flag) {break;}
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
		int[] arr = {5,33,25,12,64,90,95};
		System.out.println("sorted array : " + Arrays.toString(ModifyBubbleSort(arr)));
	}

}
