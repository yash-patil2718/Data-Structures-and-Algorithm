package Question2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int[] arr = { 45, 12, 34, 10, 51, 8, 52, 59, 50 };

		BinarySearchTree binary = new BinarySearchTree();

		for (int i = 0; i < arr.length; i++) {
			binary.insert(arr[i]);
		}
		System.out.println("Pre Order Traversal");
		binary.preorder();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to be found : ");
		int num = sc.nextInt();
		binary.search(num, arr);
	}

}
