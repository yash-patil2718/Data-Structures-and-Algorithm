package com.demo.sort;



public class binrev {
static int BSrec(int [] arr,int target,int first,int last) {
	if(last<first) {
		return -1;
	}
	int mid=(last+first)/2;
	if(arr[mid]==target) {
		return mid;
		
	}
	else if(arr[mid]<target) {
		return BSrec(arr,target,mid+1,last);
		
	}
	else {
		return BSrec(arr,target,first, mid-1);
}
	
}
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,98,1000};
	System.out.println(BSrec(arr,98,0,8));
	
}
}
