package com.demo.test;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int[] arr = new int[6];
		System.out.println("Enter elements in array : ");
		for(i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter element to be searched : ");
		int search = sc.nextInt();
		
		int first = 0;
		int last = arr.length-1;
		
			
			while(first <= last) {
				int mid = (first+last)/2;
				if(arr[mid] == search) {
					System.out.println("Element found at index : "+mid);
					break;
				}
				else if(arr[mid] < search) {
					first = mid + 1;
				}
				else {
					last = mid - 1;
				}
			}
			
		}
		
	}

