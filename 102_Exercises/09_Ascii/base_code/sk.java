/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What would you like a rubix cube a fish or a face");
	String name = sc.nextLine();
	if (name.equals("face")){
		System.out.println("|    |");
		System.out.println("_______");
	}
	if (name.equals("rubix cube")) {
		System.out.println("{}{}{}");
		System.out.println("{}{}{}");
		System.out.println("{}{}{}");
	}
	if (name.equals("fish")){
	    System.out.println("  ___");
	    System.out.println("<|  o\\");
	    System.out.println("<|___ /");
	
	}
	}
	
}
