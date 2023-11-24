package prashantPractise;

public class InsertionSorting {

	public static void main(String[] args) {
		int arr[]= {10,20,15,5};
		insertion_asend(arr);

	}

	private static void insertion_asend(int[] arr) {
		for(int i=0;i<=arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			for( ;j>=0 && arr[j]>key;j++) {
				arr[j+1]=arr[j];
			}
			
		}
	}

}
