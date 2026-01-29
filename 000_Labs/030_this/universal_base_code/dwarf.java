/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		
		Random rand = new Random();
		PooleDwarf d1 = new PooleDwarf("Dopey", rand.nextInt(100) + 1);
		PooleDwarf d2 = new PooleDwarf("Happy", rand.nextInt(100) + 1);
		PooleDwarf d3 = new PooleDwarf("Dopey", rand.nextInt(100) + 1);
		PooleDwarf d4 = new PooleDwarf("Grumpy", rand.nextInt(100) + 1);
		PooleDwarf d5 = new PooleDwarf("Sleepy", rand.nextInt(100) + 1);
		PooleDwarf d6 = new PooleDwarf("Dopey", rand.nextInt(100) + 1);
		PooleDwarf d7 = new PooleDwarf("Doc", rand.nextInt(100) + 1);
		String firstName = d1.getName();
		int count = 0;
		if (d2.isSameName(firstName)) count++;
		if (d3.isSameName(firstName)) count++;
		if (d4.isSameName(firstName)) count++;
		if (d5.isSameName(firstName)) count++;
		if (d6.isSameName(firstName)) count++;
		if (d7.isSameName(firstName)) count++;
		System.out.println("The first dwarf’s name is" +firstName);
		System.out.println("Number of duplicates" + count);
		if (count > 0) {
			System.out.println("Duplicate name" + firstName);
		}
	}
}
	

