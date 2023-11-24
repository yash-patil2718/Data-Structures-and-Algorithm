package prashantPractise;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("inter size :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		acceptarr(arr);

		 System.out.println("ascending order array is :");
		sortascending(arr);
		System.out.println();
		System.out.println("descending order array is :");
		sortdescending(arr);

	}

	private static void acceptarr(int[] arr) {

		System.out.println("enter elements :");
		for (int i = 0; i <= arr.length - 1; i++) {
			Scanner sc = new Scanner(System.in);
			arr[i] = sc.nextInt();
		}
	}

	private static void sortdescending(int[] arr) {
		int temp = 0;
		int iterations = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			boolean stop = false;
			int swap = 0;
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					stop = true;
					swap++;
				}

			}
			iterations++;
			System.out.println(Arrays.toString(arr));
			System.out.println("no of iterations : "+iterations);
			System.out.println("no of swaps : "+swap);
			if (!stop)
				break;
		}
		printArray(arr);
	}

	private static void sortascending(int[] arr) {
		int temp = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			boolean stop = false;
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					stop = true;
				}
			}
			System.out.println(Arrays.toString(arr));
			if (stop == false)
				break;
		}
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
