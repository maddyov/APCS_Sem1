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
		String ans = "";
		System.out.println("Enter a phrase");
		String str = sc.nextLine();
		String og = str;
		while(str.indexOf(" ") != -1){
		int s = str.indexOf(" ");
		String word = str.substring(0,s);
		str = str.substring(s +1);
		ans = word + ans;
		}
		System.out.println("Before  " + og);
		System.out.println("After"+ans);


		
	}
}
