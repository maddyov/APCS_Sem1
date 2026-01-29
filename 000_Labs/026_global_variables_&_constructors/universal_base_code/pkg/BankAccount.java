/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
    String owner;
    int accountnum;
    double balance;
    boolean isactive;
 private static int acc = (int)(Math.random()*(1000-50)+50);

	// -------CONSTRUCTORS-------
	
public BankAccount(){
	 owner = "Unknown";
	 accountnum = acc;
	 balance = 0;
	 isactive = true;
}
public BankAccount(String a){
	owner = a;
	isactive = true;
	balance = 0;
}
public BankAccount(String a, double ini){
	owner = a;
	isactive = true;
	balance = ini;
}
	// -------METHODS-------
public void checkbalance(){
	System.out.println("Ur balance is "+balance)
}
 public void displayAccountInfo(){
 	System.out.println(Owner);
 	System.out.println(balance)
 	System.out.println(Accountnum);
 }
}