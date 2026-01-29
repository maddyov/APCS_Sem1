/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int a = sc.nextInt();
	System.out.println("Enter a number");
	int b = sc.nextInt();
	System.out.println("Enter a number");
	int c = sc.nextInt();
	if (a>b) && (a>c) {
		System.out.println(a+"is the greatest");
		
	}
	if (b>a) && (b>c) {
		System.out.println(b+"is the greatest");
		
	}
	if (c>a) && (c>b) {
		System.out.println(c+"is the greatest");
		
	}
	}
}
