/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a number");
    int hi = sc.nextInt();
    int dub = hi + 1;
    int ohio = hi + 2;
    int baltimore = hi + 3;
    int jack = hi + 4;
    int mateo = hi + 5;
    System.out.println(hi+""+dub+""+ohio+""+baltimore+""+jack+""+mateo);
    int a = hi *2;
    int b = hi *3;
    int c = hi *4;
    int d = hi *5;
    int f = hi *6;
    System.out.println(hi+""+a+""+b+""+c+""+d+""+f);
    double duby = 100/hi;
    double dubbydub = 10/hi;
    System.out.println(dub+""+dubbydub);
	}
}
