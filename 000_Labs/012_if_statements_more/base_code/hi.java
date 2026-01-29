/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int a = sc.nextInt();
    System.out.println("enter a number");
    int b = sc.nextInt();
	System.out.println(a);
	System.out.println(b);
	boolean brotato = a != b;

if (brotato)  {
   System.out.println("the numbers are not equal");
	}
else {
	System.out.println("The numbers are equal");
}
}
}
