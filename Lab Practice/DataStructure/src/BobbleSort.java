
public class BobbleSort {

	private static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	private static void bubbleSortAscendingOrder(int[] arr) {
		//will count n-1 iterations
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array After sorting in ascending order : ");
		printArr(arr);
	}
	
	private static void bubbleSortDescendingorder(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array after sorting in descending order : ");
		printArr(arr);
	}
	
	public static void main(String[] args) {
		int[] arr = {17,18,13,11,12};
		System.out.println("Array Before sorting : ");
		printArr(arr);
		System.out.println();
		bubbleSortAscendingOrder(arr);  
		System.out.println();
		bubbleSortDescendingorder(arr);
	}

	

	
}
