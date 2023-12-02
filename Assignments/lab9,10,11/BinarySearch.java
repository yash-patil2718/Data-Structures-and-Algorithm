package com.demo.sort;

import java.util.Scanner;

public class BinarySearch {
	static int [] getAray(int n,int[]arr) {
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<n;i++) {
			System.out.println("enter a no at "+i);
			int num=sc.nextInt();
			arr[i]=num;
		}
		sc.close();
		return arr;
	}
	static int binarySearch(int[] arr,int target) {
		int first=0;
		int last=arr.length-1;
		
		while(first<last) {
			int mid=(first+last)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				first=mid+1;				
			}
			else {
				last = mid-1;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		System.out.println("enter no of elements:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		getAray(n,arr);
		System.out.println(binarySearch(arr,12));
		sc.close();
	}

}
