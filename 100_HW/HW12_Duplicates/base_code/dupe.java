/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
    Random rand = new Random();
    int[] arr = new int[20];
    
    for(int i = 0; i < arr.length; i++) {
    
    arr [i] = (int)(Math.random()* 10 ) + 1;
    
    
	}
	for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	int target = (int)(Math.random()* 10 ) + 1;
	int count = 0;
	for (int i = 0; i < arr.length; i++){
	  if (arr[1]==target){
	  	System.out.println(i + "");
	  	count++;
	  }
	
	}
	  System.out.println("dupes = "+ count);
	  boolean found = false;
	  for(int i = 0; i < arr.length-1; i++){
	  if (arr[i]== arr[i+1]){
	  	System.out.println("dupe num at "+arr[i]+"at "+i);
	  	found = true;
	  }
	  }
	  if (!found){
	  	System.out.println("No repeated #'s");
	  }
}
}
