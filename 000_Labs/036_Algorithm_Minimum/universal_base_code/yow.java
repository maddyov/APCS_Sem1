/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	int size = (int)(Math.random() * (200-51+1)) + 51;
	int [] arr = new int[size];
	for(int i = 0; i < arr.length; i++) {
		arr[i] = (int)(Math.random()* 100)+1;
		
	}
	int max = arr[0];
    int min= arr[0];
	int sum = 0;
	for(int i = 0; i < arr.length; i++){
	 if(arr[i] < min) {
	 	min = arr[i];
	 }
	
	 
	 if(arr[i]>max){
	    max = arr[i];
	 }
	 sum += arr[i];
	}
    double avg = (double) sum/arr.length;
    System.out.println("min =  " + min);
    System.out.println("max =  "+ max);
    System.out.println("avg is "+ avg);
		
	}
}
