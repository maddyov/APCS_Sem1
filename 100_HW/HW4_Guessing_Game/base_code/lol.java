/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
 
 public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int brochacho = (int)(Math.random()* 3+1);

if (brochacho == 1) {
System.out.println("The goal is to guess the word with two hints");	
System.out.println("Your first hint is that its a planet");
String ohio = sc.nextLine();
if ((ohio.equals("Uranus")) || ohio.equals("uranus")) {
    System.out.println("Correct");
} 
 else {   
    System.out.println("wrong, your next hint is people make a joke about this planet");
 }
 String adrian = sc.nextLine();
 if ((adrian.equals("Uranus")) || adrian.equals("uranus")) {
    System.out.println("Correct");
} 
 else {   
    System.out.println("wrong");
    	}
 }
 else if (brochacho == 2) {
  System.out.println("The goal is to guess the word with two hints");	
System.out.println("Your first hint is that its a animal");
String ohio = sc.nextLine();
if ((ohio.equals("platupus")) || ohio.equals("Platupus")) {
    System.out.println("Correct");
} 
 else {   
    System.out.println("wrong, your next hint is that its from a tv show");
 }
 String adrian = sc.nextLine();
 if ((adrian.equals("platupus")) || adrian.equals("Platupus")) {
    System.out.println("Correct");
} 
 else {   
    System.out.println("wrong");
    	}
 }
 else   {
  System.out.println("The goal is to guess the word with two hints");	
System.out.println("Your first hint is that its a person");
String ohio = sc.nextLine();
if ((ohio.equals("Trump")) || ohio.equals("trump")) {
    System.out.println("Correct");
} 
 else {   
    System.out.println("wrong, your next hint is that its a politcal figure");
 }
 String adrian = sc.nextLine();
 if ((adrian.equals("Trump")) || adrian.equals("trump")) {
    System.out.println("Correct");
} 
 else {   
    System.out.println("wrong");
    	}
 }
 }
}
