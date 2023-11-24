package prashantPractise;

import java.util.Arrays;

public class TestQuickSort {

	public static void main(String[] args) {
		int arr[]= {10,5,3,2,9};
		System.out.println("array is : ");
		quick_sort(arr,0,arr.length-1);//function calling
		
		System.out.println(Arrays.toString(arr));

	}

	private static void quick_sort(int[] arr, int start, int end) {
		if(start<end) {
			int p=parition(arr,start,end);//function called for finding position of p
			quick_sort(arr,start,p); //recursive function for left side array
			quick_sort(arr,p+1,end); //recursive function for right side array
			
		}
		
		
	}

	private static int parition(int[] arr, int start, int end) {
		int pivot=start;
		int i=start;
		int j=end;
		//outer while loop for swapping i and j
		while(i<j) {
			// inner while loop for i
			while(i<end && arr[i]<arr[pivot]) {
				i++;
			}
			//inner while loop for j
			while(j>pivot && arr[j]>arr[pivot]) {
				j--;
			}
			//swapping i and j
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		//swapping j and pivot
		int temp=arr[j];
		arr[j]=arr[pivot];
		arr[pivot]=temp;
		return j;
	}

}
