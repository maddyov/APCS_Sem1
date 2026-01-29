/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name");
	String name = sc.nextLine();
	System.out.println("What is your title");
	String tit = sc.nextLine();
	System.out.println("Wizard Rogue warrior ");
	String a = sc.nextLine();
	
	if((a.equals("Wizard")) || a.equals("wizard")) {
	System.out.println("You are a warrior");
	}
	else if ((a.equals("Rogue")) || a.equals("rogue")) {
		System.out.println("You are a rogue");
	}
		int points = 20;
		System.out.println("You have 20 points to spend");
		System.out.println("enter your desired strength 0-10");
		int strength = sc.nextInt();
		if ((strength< points && strength <= 10)) {
		points = points- strength;
		}
		else {
		System.out.println("miss input 1-10");
		}
			System.out.println("enter your desired dexterity 0-10");
		int dexterity = sc.nextInt();
		if ((dexterity< points && dexterity <= 10)) {
		points = points- dexterity;
		}
		else {
		System.out.println("miss input 1-10");
		}
		
		System.out.println("enter your desired intelligence 0-10");
		int intel = sc.nextInt();
		if ((intel< points && intel <= 10)) {
		points = points- intel;
		}
		else {
		System.out.println("miss input 1-10");
		}
		System.out.println("enter your desired charisma  0-10");
		int charisma = sc.nextInt();
		if ((charisma< points && charisma <= 10)) {
		points = points- charisma;
		}
		else {
		System.out.println("miss input 1-10");
		}
	System.out.println(" You are "+ name +" your title is "+ tit+ "  and you are a "+  a);
	System.out.println(" your strength is "+ strength+" Your dexterity is " + dexterity+" your intellgience is "+ intel+ " your Charisma is "+charisma);
	
	}
}
