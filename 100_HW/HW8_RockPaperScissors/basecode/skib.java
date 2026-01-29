/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
			Scanner sc = new Scanner(System.in);
	System.out.println("Would you like to play?");
		String choice = sc.nextLine();
		if (choice.equals("Done")){
			return;
		}
		else if (choice.equals("Yes")){
			System.out.println("Rock Paper Scizzors");
			String choi = sc.nextLine();
			if (choi.equals("Rock")) {
				String x = getObject();
				int result = compare2("Rock", x);
				if (result == 1){
					System.out.println("You win");
				}
				else if (result == 2){
					System.out.println("Computer wins");
				}
				else{
					System.out.println("Its a tie");
				}
			}
			else if (choi.equals("Paper")){
				String x = getObject();
				int result = compare2("Paper", x);
				if (result == 1){
					System.out.println("You win!");
				}
				else if (result == 2){
					System.out.println("Computer wins!");
				}
				else {
					System.out.println("It's a tie!");
				}
			}
			else if (choi.equals("Scizzors")){
				String x = getObject();
				int result = compare2("Scizzors", x);
				if (result == 1){
					System.out.println("You win!");
				}
				else if (result == 2){
					System.out.println("Computer wins!");
				}
				else{
					System.out.println("It's a tie!");
				}
			}
			else{
				System.out.println("Invalid input.");
			}
		
			//TODO
		}
	  else if(choice.equals("No")){
	System.out.println("How many times should the computer play against itself?");
	int rounds = sc.nextInt();

	int player1Wins = 0;
	int player2Wins = 0;
	int ties = 0;

	int counter = 0;
	while (counter < rounds) {
		String p1 = getObject();
		String p2 = getObject();
		int result = compare2(p1, p2);

		if (result == 1) {
			player1Wins++;
		}
		else if (result == 2) {
			player2Wins++;
		}
		else {
			ties++;
		}

		counter++;
	}

	  System.out.println("Player 1 wins " + player1Wins);
	System.out.println("Player 2 wins " + player2Wins);
		System.out.println("Ties: " + ties);  	
	    
	}
	    }
	
	public static int compare2(String p1, String p2) {
		if (p1.equals("Rock") && p2.equals("Scizzors")){
			return 1;
		}
		else if(p1.equals("Rock") && p2.equals("Paper")){
			return 2;
		}
		else if(p1.equals("Paper") && p2.equals("Rock")){
			return 1;
		}
		else if(p1.equals("Paper") && p2.equals("Scizzors")){
			return 2;
		}
		else if(p1.equals("Scizzors") && p2.equals("Paper")){
			 return 1;
		}
		else if(p1.equals("Scizzors") && p2.equals("Rock")){
			return 2;
		}
		else{
			return 0;
		}
	}
	
	public static String getObject(){
		int a = (int) (Math.random()* 3);
		if (a==1){
			System.out.println("Rock");
			return "Rock";
		}
		 else if(a==2){ 
		 	System.out.println("Paper");
		 	return "Paper";
		 }
		 	else {
		 		System.out.println("Scizzors");
		 		return "Scizzors";
		 	}
		 }
}

		
		
	
		
			
		
			
			
		


		
	

