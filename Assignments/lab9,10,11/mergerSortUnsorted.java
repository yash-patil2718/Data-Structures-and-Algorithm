package com.demo.sort;

import java.util.Arrays;

public class mergerSortUnsorted {
	public static int cnt;
	static {
		cnt=0;
	}

	public static void main(String[] args) {
		 int[] arr= {65,35,26,13,23,12,91};
		 int it =mergesort(arr,0,arr.length-1);
		 System.out.println(Arrays.toString(arr));
		 System.out.println("iteration : "+ it);
			
	}

public static int mergesort(int[] arr, int start, int end) {
	if(start < end) {
		cnt++;
		int mid = (start+end)/2;
		mergesort(arr, start,mid);
		mergesort(arr, mid+1, end);
		Merge(arr, start, end,mid);
	}
	return cnt;
}

	public static void Merge(int[] arr, int start, int end , int mid) {
			int i,j,k;
			int n1=mid-start+1;
			int n2=end -mid;
			int[] a1 = new int[n1];
			int[] a2 = new int[n2];
			for(i=0;i<n1;i++) {
				a1[i] = arr[start+i];
			}
			for(i=0;i<n2;i++) {
				a2[i] = arr[mid+i+1];
			}
			i=0;
			j=0;
			k=start;
			while(i<n1 && j<n2) {
				if(a1[i]<a2[j]) {
					arr[k]=a1[i];
					i++;
					k++;
				}else {
					arr[k]=a2[j];
					j++;
					k++;
				}
			}
			while(i<n1) {
				arr[k]=a1[i];
				i++;
				k++;
			}
			while(j<n2) {
				arr[k]=a2[j];
				j++;
				k++;
			}
			
			
	}


	

}
