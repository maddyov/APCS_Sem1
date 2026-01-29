/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a full name ");
	String name = sc.nextLine();
	String print = name.substring(name.indexOf(" "));
	System.out.println("Last name is "+ print);
	BaseClass test = new BaseClass();


		
	}
}
