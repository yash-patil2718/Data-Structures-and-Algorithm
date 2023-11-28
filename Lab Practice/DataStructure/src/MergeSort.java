
public class MergeSort {
	
	
	public static void divide(int[] arr, int start, int end) {
		start = 0;
		end = arr.length-1;
		int mid = (start + end)/2;
		
		divide(arr,start,mid);
		divide(arr,mid+1,end);
		conquer(arr, start, mid, end);
		
	}
	
	public static void conquer(int[] arr, int start, int mid, int end) {
		int[] merged = new int[start+end-1];
		int index1 = 0;
		int index2 = 0;
		int k = 0;
		
		while(index1<mid && index2<end) {
			if(arr[index1]<arr[index2]) {
				merged[k] = arr[index1];
				k++;
				index1++;
			}
			else {
				merged[k] = arr[index2];
				k++;
				index2++;
			}
		}
		while(index1<mid) {
			merged[k] = arr[index1];
			k++;
			index1++;
		}
		while(index2<end) {
			merged[k] = arr[index2];
			k++;
			index2++;
		}
		
		for(int i=0,j=start;i<merged.length;i++,j++) {
			arr[j] = merged[i];
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {11,55,45,12,20};
		
		divide(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
