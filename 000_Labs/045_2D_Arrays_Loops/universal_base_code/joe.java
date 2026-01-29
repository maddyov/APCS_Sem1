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
	System.out.println("please enter the # of rows");
	int row = sc.nextInt();
	System.out.println("please enter the # of colum");
	int col = sc.nextInt();
	int [][] arr = new int [row][col];
	for(int i = 0; i < arr.length; i++){
      for(int y = 0; y < arr[0].length; y++){
	  arr[i][y] = (int)(Math.random() * 10);
      }
	}
	  for(int i = 0; i < arr.length; i++){
    	for(int y = 0; y < arr[0].length; y++){
    		System.out.print(arr[i][y]);
    	}
    	System.out.println(); 
    	Avg(arr);
    	System.out.println(avgOfAll(arr));
}
}
public static void Avg(int[][] arr){
	for(int i = 0; i < arr.length; i++){
		int sum = 0;
		int avg = 0;
    	for(int y = 0; y < arr[0].length; y++){
    		sum += arr[i][y];
    	}
    	avg = sum/arr[i].length;
    	System.out.println("The avearage of row"+ i + avg);
}
}
public static int avgOfAll(int[][] arr){
	int avg = 0;
	int counter = 0;
	 for(int i = 0; i < arr.length; i++){
    	for(int y = 0; y < arr[0].length; y++){
    	  avg += arr[i][y];
    	  counter++;
    	}
	 }
    	return avg/counter;
	
}

	
	
	  
	  


		
	}

