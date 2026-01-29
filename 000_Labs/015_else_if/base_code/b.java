/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int adrian = (int)(Math.random()* 1001);
		System.out.println("number 1-1000");
		int hi = sc.nextInt();
		if (hi==adrian){
		System.out.println("correct");
		
		}
		else if (hi>adrian){
			System.out.println("nope the number was lower");
		}
		else if (adrian>hi){
			System.out.println("Nope the number was higher ");
		}
		}
	}

