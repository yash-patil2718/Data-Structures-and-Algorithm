package prashantPractise;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int arr[]= {10,20,15,5,50};
		System.out.println(Arrays.toString(arr));
		heapsort(arr);
		System.out.println("sorted array :");
		System.out.println(Arrays.toString(arr));

	}

	private static void heapsort(int[] arr) {
		int length=arr.length;
		for(int i=length/2-1;i>=0;i--) {
			heapify(arr,length,i);
		}
		System.out.println(Arrays.toString(arr));
		for(int i=length-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
		
		
	}
	

	private static void heapify(int[] arr, int length, int i) {
		
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		if(left<length && arr[left]>arr[largest]) {
			largest=left;
		}
		if(right<length && arr[right]>arr[largest]) {
			largest=right;
		}
		if(largest != i) {
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			heapify(arr,length,largest);
		}
	}

}
