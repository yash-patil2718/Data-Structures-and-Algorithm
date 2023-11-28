package prashantPractise;

import java.util.Arrays;

public class bubble1 {
	public static void main(String[] args) {
		int[] arr = {12,32,1,4,54,19,22};
		System.out.println(Arrays.toString(arr));
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubblesort(int[] arr) {
		int n=arr.length;
		int i,j;
		for( i=0;i<n-1;i++) {
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}