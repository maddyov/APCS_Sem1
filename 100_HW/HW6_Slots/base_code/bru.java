/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Do you wanna play");
	String gamble =sc.nextLine();
	if ((gamble.equals("Yes"))||(gamble.equals("no"))){
	   int dol = 100;
	   boolean skiv = true;
	while (skiv && dol > 0){
		System.out.println("You have 100$");
		System.out.println("You currently have "+dol);
	   System.out.println("enter your bet");
	   int ohio = sc.nextInt();
	while (ohio>dol || ohio <= 0){
		System.out.println("Enter another bet  brokie u only got"+dol);
		 ohio = sc.nextInt();
	}
	int hi = (int) (Math.random()*50);
	int hi2 = (int) (Math.random()*50);
	int hi3 = (int) (Math.random()*50);
	System.out.println(hi+" "+hi+" "+hi2);
	if(hi==hi2||hi==hi3||hi3==hi2){
	  System.out.println("You just doubled your money");
	  dol += ohio;
	}
	else if (hi==hi2 && hi2==hi3) {
		System.out.println("You just tripled your money");
		dol += ohio*2;
	}
	else {
		System.out.println("U just lost your bet");
		dol -= ohio;
	}
	System.out.println("Your new balance is "+dol);
	System.out.println("Play again?");
	sc.nextLine();
	String help = sc.nextLine();
	if(help.equals("No")){
		skiv = false;
	}
	
	}
	}
	}	
}
