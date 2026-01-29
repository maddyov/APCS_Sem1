/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("what is your name");
        String name = sc.nextLine();
        System.out.println("How many times do you want this said");
        int hi = sc.nextInt();
        int x = 0;
        while(x < hi){
        	System.out.println(name);
        	x++;
        }
        
        	
	}
}
