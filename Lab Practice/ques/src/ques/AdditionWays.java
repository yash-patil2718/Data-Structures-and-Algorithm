package ques;

import java.util.Scanner;

class Solution {
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		consecutiveNumbersSum(n);
	}

	public static int consecutiveNumbersSum(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (i + 1);
		}
		findCount(arr, n);
		return count;
	}

	private static int findCount(int[] arr, int n) {
		int sum = 0, n1 = 0;
		if (n % 2 == 0)
			n1 = n / 2 + 1;
		else
			n1 = n / 2;
		if (n < 3)
			return count;
		else {
			for (int i = n1; i > 0; i--) {
				sum = sum + arr[i];
				if (sum > n) {
					return count;
				}
				if (sum == n) {
					count++;
					return findCount(arr, n - 1);
				}
			}
		}
		return count;
	}

}