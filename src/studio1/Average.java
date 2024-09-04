package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner test = new Scanner(System.in);
		
		System.out.println("number 1: ");
		int n1 = test.nextInt();
		System.out.println("number 2: ");
		int n2 = test.nextInt();
		
		double avg = (n1 + n2)/2;
		System.out.println("The average of " + n1 + " and " + n2 + " is " + avg);
	}


	}


