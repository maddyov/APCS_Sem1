/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;
import pkg.*;

class starter {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a difficulty level: 1, 2, or 3");
        int diff = sc.nextInt();
        sc.nextLine(); 
        //  if(diff == 1){
        //    diff1();
        //}
        /*
        else if(diff == 2){
            diff2(sc);
        }
        else if(diff == 3){
            diff3(sc);
        }
        else {
          System.out.println("invalid input");
        
        /* 
            Basics of the game:
            - Given a set of words, the player must memorize the colors
            - After a 5 second delay, the player must type in each color one at a time on separate lines
            - At any point, if they type in an incorrect color, the game ends. The game will print out the correct colors.
            - If they get them all right, the game will continue and add one more word to the series.
            - The series changes every round.
        */

        //  Given the Colors class, use the following method calls to help this program.
        //Colors.print("Test 1");         // This prints out the value given without a new line   
        //Colors.println("Test 2");       // This prints out the value given then a new line
        //Colors.print("Test 3", "BRIGHT_Red");       // 2 String parameters: Value, Color of text
        //Colors.println("Test 4", "BRIGHT_Red");     // 2 String parameters: Value, Color of text WITH a new line after
        //Colors.print("Test 5", "BRIGHT_Red", "BG_Blue");         // 3 String parameters: Value, Color of text, Color of background
        //Colors.println("Test 6", "BRIGHT_Red", "BG_Blue");       // 3 String parameters: Value, Color of text, Color of background WITH a new line after
        // Notice: for the colors, you must concatenate "BRIGHT_" or "BG_" to the input parameter to get the bright or background versions of the colors.

        // Feel free to comment out the test code above when you start your assignment
        //}
        

        int r = 1;
        while (true){
            String[] words = new String[r];

            for(int i = 0; i < r; i++) {
            words[i] = getColorWord();
            System.out.println(words[i]);
        }

            System.out.println("memorize the words");
            delay(5);
            for (int i = 0; i < 30; i++) {
                System.out.println();
            }

            System.out.println("type the words back in order");
            boolean correct = true;

            for (int i = 0; i < r; i++) {
                String input = sc.nextLine();
                if (!input.equalsIgnoreCase(words[i])) {
                    correct = false; 
                }
            }

            if (!correct) {
                System.out.println("incorrect game over");
                System.out.print("correct sequence was ");
                printArray(words);
                break;
            }
            else {
                System.out.println("correct next round");
                r++;
            }
        }
    
            
            
            /* 

        
         public static void difficulty2(Scanner sc){
           
            }
        }
    }

            
            
            
                
            
            
            /*
                Difficulty level 2:
                    This should act the same as difficulty level 1 with the following changes:
                    The user will receive a series of colors as words AND as text color (ex. "Red", "Blue", "Green", etc.)
                    The computer will randomly choose either to check the word as text or as a color
                    The user must type in the colors in the correct order by either text or text color
                    Both the text words and the text colors should be stored to be checked later
            */

/*
    
        else if(diff == 3){
        
                }
            }

            if (correct == false){
            System.out.println("Incorrect game over");
               System.out.print("Word sequence was");
                 printArray(words);
            System.out.print("Tet color  sequence was ");
                printArray(textcolor);
                 System.out.print("Background color sequence was: ");
                printArray(bgcol);
            }
            else {
                System.out.println("Correct ");
                r++;
            }
        }
            /*
                Difficulty level 3:
                    This should act the same as difficulty level 2 with the following changes:
                    The user will receive a series of colors as words, as text color, and as background color (ex. "Red", "Blue", "Green", etc.)
                    The computer will randomly choose either to check the word as text, as a color, or as background color
                    The user must type in the colors in the correct order
                    All of the text words, the text colors and the background colors should be stored to be checked later
            */
        

        //}
        //else {
        //    System.out.println("rong number try again.");
        //}
    }
        

    // This method should take in a String array as a parameter and print out each element in the array.
    public static void printArray(String[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
	}


    // This method can be called to return a random color. This syntax is the correct syntax for the Colors class. 
    public static String getColorWord(){
        int rand = (int)(Math.random()*5);
        switch (rand){
            case 0: return "Purple";
            case 1: return "Red";
            case 2: return "Green";
            case 3: return "Yellow";
            case 4: return "Blue";
            default: return "White";
        }
    }

    // This method can be called to delay for a certain number of seconds.
    // The parameter count represents the number of seconds to delay.
    public static void delay(int count){
        for (int i = 0; i < count; i++) {
			System.out.print(count-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
        }
    }
}
