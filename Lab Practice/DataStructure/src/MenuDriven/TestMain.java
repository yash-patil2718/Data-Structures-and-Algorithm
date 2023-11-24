package MenuDriven;

import java.util.Arrays;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Service ser=new ServicesImpl();
		Scanner sc=new Scanner (System.in);
		System.out.println("enter size : ");
		int size=sc.nextInt();
		
		int arr[]=ser.acceptarr(size);
		
		int choice=0;
		do{
			System.out.println("enter the choice");
			System.out.println("1.bubble \n2.insertion \n3.selection \n4.exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				int barr=ser.bubbleSort(arr);
				
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.out.println("thank you");
			
			}
		}
			
			
		
		while(choice!=7);

	}

	

}
