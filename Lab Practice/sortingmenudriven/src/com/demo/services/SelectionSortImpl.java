package com.demo.services;

public class SelectionSortImpl implements SelectionSortServices{


	@Override
	public int[] ascendingOrderSelectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int smallest = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
	}
		return arr;
	}

	@Override
	public int[] descendingOrderSelectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int smallest = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]<arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
		}
		return arr;
	}
}
