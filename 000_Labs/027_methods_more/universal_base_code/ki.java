/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		BankAccount x = new BankAccount();
		BankAccount y = new BankAccount("jermey", 6767.67);
		BankAccount z = new BankAccount("james", 277.0);
		BankAccount g = new BankAccount("bartlamule", 4167.25);
     	BankAccount l = new BankAccount("bart", 4155.5);
		
		
		System.out.println("What do you wanna do");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nothing, Account, AB Account and Balance");
		String choice = sc.nextLine();
		if (choice.equals("Account")){
			System.out.println("whats the name of your account");
			String name = sc.nextLine();
		    BankAccount hi = new BankAccount(name);
	  	    System.out.println("Account name ===");
		    hi.displayAccountInfo();
		    System.out.println("Balance ===");
		    hi.checkbalance();
		}
		else if(choice.equals("AB")){
			System.out.println("whats the name of your account");
			String name = sc.nextLine();
			System.out.println("What are you depositing");
			double mula = sc.nextDouble();
			BankAccount ii = new BankAccount(name,mula);
			ii.displayAccountInfo();
			System.out.println("Account name ===");
		    ii.displayAccountInfo();
		    System.out.println("Balance ===");
		    ii.checkbalance();
		}
		else if(choice.equals("Nothing")) {
			System.out.println("see ya");
		}
			
			
		}
			
			
		
			
		}
		
		

		
	

