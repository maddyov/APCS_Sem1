/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int a = sc.nextInt();
	System.out.println("Enter a number");
	int b = sc.nextInt();
	if(a % 2 == 0) {
		System.out.println("Number is even");
	}
	else {
		System.out.println("Number is odd");
	}
	if(b % 2 == 0) {
		System.out.println("Number is even");
	}
	else {
		System.out.println("Number is odd");
	}
	if ((a% 3 == 0) && (a% 4 == 0) && (a%5==0)) {
		System.out.println(a+"= Divisible by 3 4 5");
	}
	else {
	    System.out.println(a+"Not divisible by 3 4 5");
	}
		if ((b% 3 == 0) && (b% 4 == 0) && (b%5==0)) {
		System.out.println(b+"= Divisible by 3 4 5");
	}
	else {
	    System.out.println(b+"Not divisible by 3 4 5");
	}
	}
}
