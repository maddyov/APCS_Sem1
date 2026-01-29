/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int a = sc.nextInt();
    System.out.println("enter a number");
    int b = sc.nextInt();
    System.out.println("your range is "+a+"to"+b);
    int skib1 = b-a;
    int skib = (int) (Math.random()*skib1+a);
    System.out.print(skib+",");
    int skib2 = (int) (Math.random()*skib1+a);
    System.out.print(skib2+",");
    int skib3 = (int) (Math.random()*skib1+a);
    System.out.print(skib3+",");
    int skib4 = (int) (Math.random()*skib1+a);
    System.out.print(skib4+"");
    int skib5= (int) (Math.random()*skib1+a);
    System.out.print(skib5+"");
	}
}
