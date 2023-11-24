package prashantPractise;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {20,10,5,8,2};
	    SelectionAsending(arr);

	}

	private static void SelectionAsending(int[] arr) {
	      for (int i = 0; i <= arr.length-1; i++) {
	    	  
	    	  int smallest=0;
	    	  int j=0;
	    	  for(;j<=arr.length-1;j++) {
	    		  if(arr[smallest]<arr[j]) {
	    			  smallest=j;
	    		  }
	    		  int temp=arr[j];
		    	  arr[j]=arr[smallest];
		    	  arr[smallest]=temp;
	    	  }
	    	 
			
		}
	      System.out.println(Arrays.toString(arr));
		
	}

}
