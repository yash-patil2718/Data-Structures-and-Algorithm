package prashantPractise;

import java.util.Scanner;

public class Factorial {
	    public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
			System.out.println("enter num");
			int num=sc.nextInt();
			if(num<0) {
				System.out.println("enter positive number");
			}
			else {
				int fact=recursiveFactorial( num);
				System.out.println(fact);
			}
		}

		private static int recursiveFactorial(int num) {
			if(num==0 || num==1) {
				return 1;
			}
			else {
				return num*recursiveFactorial(num-1);
			}
		}

}
