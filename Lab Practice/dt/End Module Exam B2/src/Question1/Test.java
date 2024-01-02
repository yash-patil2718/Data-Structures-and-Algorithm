package Question1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Queue : ");
		LinkedList queue = new LinkedList(sc.nextInt());
		int choice;
		do {
			System.out.println(
					"1. Insert element\n2.Remove Element\n3. Print All Element\n4. Check if Full\n5. Check if Empty\n6. Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter a String to add in queue : ");
				String str = sc.next();
				queue.addElement(str);
				break;
			case 2:
				queue.removeElement();
				break;
			case 3:
				queue.printAllElements();
				break;
			case 4:
				if (queue.isFull()) {
					System.out.println("Queue is Full");
				} else {
					System.out.println("Queue is not Full");
				}
				break;
			case 5:
				if (queue.isEmpty()) {
					System.out.println("Queue is Empty");
				} else {
					System.out.println("Queue is not Empty");
				}

			default:
			System.out.println("Please select correct option!!!");
				break;
			}
		} while (choice != 6);
	}
}
