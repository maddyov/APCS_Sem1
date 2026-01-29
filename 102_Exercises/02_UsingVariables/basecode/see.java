/*
 *	Author:  
 *  Date: 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		testHello();
		System.out.println();
		System.out.println("----------------------------");
		testAbba();
		System.out.println();
		System.out.println("----------------------------");
		testPythag();
	}

	public static void helloName(String name){
    System.out.println("Hi"+name+"!");
	}
	
	public static void makeAbba(String a, String b){
		System.out.println(a+b+a+b);
		
	}
	
	public static void pythag(int a, int b){
	int aaa = (a*b);
	int bbb = (b*b);
	System.out.println("the hypotnuese side is" + (aaa+bbb));
	}
	
	
	public static void testHello(){
		helloName("Bob");
		helloName("Alice");
		helloName("X");
		helloName("");
		helloName("Omega");
		helloName("Hello");
	}
	
	public static void testAbba(){
		makeAbba("Hi", "Bye");
		makeAbba("Yo", "Ben");
		makeAbba("What", "Up");
		makeAbba("6", "7");
		makeAbba("x", "y");
		makeAbba("x", "");
		makeAbba("", "y");
		makeAbba("Ya", "Ya");
	}
	
	public static void testPythag(){
		pythag(1, 1);
		pythag(2, 3);
		pythag(100, 200);
		pythag(67,41);
		pythag(589, 6417);
		pythag(214325728, 1242745810);
	}
}

