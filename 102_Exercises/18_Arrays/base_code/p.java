/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
    int[] c = new int[1001];
	int counter = 0;
	int value = 3;
	while (counter<c.length){
		c [counter] = value;
		value = value + 3;
		
		
		counter++;
		
	}
	counter = 0;
	while (counter<c.length){
		System.out.println(c[counter]);
		value = value + 3;
		counter++;
	}
	int [] w = new int [1001];
	int counter1 = 0;
	int value1 = 1000;
	while (counter1<w.length){
		w [counter1] = value1;
		value1 = value1 + 3;
		counter1++;
	}
	counter1 = 0;
	while (counter1<w.length){
		System.out.println(w[counter1]);
	    value1 = value1 + 3;
		counter1++;
	
	
	
	}
}
