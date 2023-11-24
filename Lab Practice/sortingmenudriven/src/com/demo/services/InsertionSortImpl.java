package com.demo.services;

import java.util.Arrays;

public class InsertionSortImpl implements InsertionSortServices {

	@Override
	public int[] sortAscendingOrder(int[] arr) {

		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j = i-1;
			for(;j>=0 && arr[j]>key;j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = key;
		}
		return arr;
	}

	@Override
	public int[] sortDescendingOrder(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int key = arr[i];
			int j= i-1;
			for(;j>=0 && arr[j]<key;j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = key;
		}
		return arr;
	}

}
