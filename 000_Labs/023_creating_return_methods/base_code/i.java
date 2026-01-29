/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int pow(int a, int b){
		int idk = 1;
		int idk1 = 0;
		while(idk1<b){
		idk = idk * a;
		idk1=idk1+1;
		}
		return idk;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a integer");
		int eger = sc.nextInt();
		System.out.println("To the power of what");
		int powpow = sc.nextInt();
		
		System.out.println(pow(eger,powpow));
	}
}
