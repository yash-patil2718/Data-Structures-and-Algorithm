package prashantPractise;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		System.out.print("Enter elements of array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter number to be searched : ");
		int search = sc.nextInt();
		
		int i;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println("Number found at "+ i);
				break;
			}
		}
		if(arr[i]==arr.length) {
			System.out.println("Element not found");
		}
		
	}

}
