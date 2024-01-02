package Question2;

public class BinarySearchTree {
	static boolean flag = false;

	class Node {
		int data;
		Node left, right;

		public Node(int d) {
			data = d;
			left = null;
			right = null;
		}
	}

	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int key) {
		root = insertRec(root, key);

	}

	private Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.data) {
			root.left = insertRec(root.left, key);
		} else {
			root.right = insertRec(root.right, key);
		}
		return root;
	}

	public void preorder() {
		preorderTraversal(root);
		System.out.println();
	}

	private void preorderTraversal(Node root) {
		if (root != null) {
			System.out.print(root.data + ",");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}

	}

	public void search(int num, int[] arr) {
		searchRoot(root, num, arr);
		if (!flag) {
			System.out.println(num + " Not found");
		}
	}

	public void searchRoot(Node root, int num, int[] arr) {
		if (root != null) {
			if (root.data == num) {
				System.out.println(num + " found");
				flag = true;
			} else {
				searchRoot(root.left, num, arr);
				searchRoot(root.right, num, arr);
			}
		}
	}

}
