package com.demo.sort;

import java.util.Arrays;

public class Quicksorting {
	
	public static int cnt;
	static {
		cnt=0;
	}
	
	public static int quickSort(int []arr,int start,int end) {
		if(start<end) {
			cnt++;
			int p=partion(arr,start,end);
			quickSort(arr,start,p-1);
			quickSort(arr,p+1,end);
		}
		return cnt;
	}
	public static int partion(int []arr,int first,int last) {
		int piviot=first;
		int i=first;
		int j=last;
		while(i<j) {
			while(i<last && arr[i]<=arr[piviot]) {
				i++;
			}
			while(j>piviot && arr[j]>arr[piviot]) {
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[j];
		arr[j]=arr[piviot];
		arr[piviot]=temp;
		return j;
		
		
		
		
	}
	public static void main(String[] args) {
		int []a= {12,13,56,58,57,54,32,4,24};
		int it =quickSort(a,0,8);
		System.out.println(Arrays.toString(a));
		 System.out.println("iteration : "+ it);
	}

}
