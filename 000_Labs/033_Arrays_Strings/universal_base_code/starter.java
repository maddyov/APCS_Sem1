/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	String [] lyrics = new String[10];
	lyrics[0] = "Flashings lights";
	lyrics[1]= "She dont believe in shooting stars";
	lyrics[2] = "But she believe in shoes and cars  ";
	lyrics[3] = "Wood floors in the new apartment  ";
	lyrics[4] = " Couture from the store’s departments ";
	lyrics[5] = "You more like love to start it  ";
	lyrics[6] = "I'm more of the trips to Florida  ";
	lyrics[7] = " Order the hors d'oeuvres, views of the water ";
	lyrics[8] = "Straight from the page of your favorite author  ";
	lyrics[9] = "And the lights, lights, lights  ";
	
	printLyrics(lyrics);
	}
	public static void printLyrics(String[] lyrics){
		System.out.println("Flashing lights ---");
		
		 int i = 0;
        while (i < lyrics.length) {
            System.out.println(lyrics[i]);
            i++;
        }
		
	}
}
