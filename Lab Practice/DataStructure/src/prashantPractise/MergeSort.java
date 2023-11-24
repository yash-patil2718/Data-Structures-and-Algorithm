package prashantPractise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		accept(arr);
		mergesorting(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void mergesorting(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergesorting(arr, start, mid);
			mergesorting(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}

	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int i, j, k;
		int l1 = mid - start + 1;
		int l2 = end - mid;
		int leftarr[] = new int[l1];
		int rightarr[] = new int[l2];
		for (i = 0; i < l1; i++) {
			leftarr[i] = arr[start + i];
		}
		for (j = 0; j < l2; j++) {
			rightarr[j] = arr[mid + 1 + j];
		}
		i = 0;
		j = 0;
		k = start;
		while (i < l1 && j < l2) {
			if (leftarr[i] < rightarr[j]) {
				arr[k] = leftarr[i];
				i++;
				k++;
			} else {
				arr[k] = rightarr[j];
				k++;
				j++;
			}

		}
		while (i < l1) {
			arr[k] = leftarr[i];
			k++;
			i++;
		}
		while (j < l2) {
			arr[k] = rightarr[j];
			k++;
			j++;

		}
	}

	private static void accept(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter element");
			arr[i] = sc.nextInt();

		}

	}

}
