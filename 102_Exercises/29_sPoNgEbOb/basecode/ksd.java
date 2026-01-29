/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a phrase");
	String str = sc.nextLine();
	int x = 0;
	int y = 1;
	String let = "";
	String bal = "";
	for (int i = 0; i<str.length(); i++){
	if(i % 2 == 0){
		 let = (str.substring(x,y)).toLowerCase();
		
	}
	else {
	 let = (str.substring(x,y)).toUpperCase();	
	}
	x++;
	y++;
	bal = let + bal;
	
	}
	System.out.println(bal);
	}
}
