/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int a = (int) (Math.random() * 10);
	System.out.println("Numb between 0-9" +a);
	int b = (int) (Math.random()*101);
	System.out.println("1-100"+b);
	double c = (double) (Math.random()+2.5);
	System.out.println("2.5-3.5"+c);
	double d= (double) (Math.random()*589+14);
	System.out.println("14-589"+d);
	}
}
