package prashantPractise;

import java.util.Arrays;
import java.util.Scanner;

public class FindingDuplicate {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,100};
		System.out.println(Arrays.toString(arr));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int num=sc.nextInt();
		
		findnum(arr,num);

	}

	private static void findnum(int[] arr, int num) {
		for(int i=0;i<arr.length;i++) {
		 if(num==arr[i]) {
			 System.out.println("position is :"+i);
		 }
			
		}
	}

}
