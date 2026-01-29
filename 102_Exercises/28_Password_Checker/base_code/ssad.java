import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		int strength = 0;
		int specials = 0;
		int Strength3 = 0;
    for (int ii = 0; ii<passwords.length; ii++){
        if(passwords[ii].length() >= 8 && !(passwords[ii].contains("!") || passwords[ii].contains("@") || passwords[ii].contains("#") || passwords[ii].contains("%") || passwords[ii].contains("^") || passwords[ii].contains("&") || passwords[ii].contains("*"))){
        strength++;
        }
        else if(!(passwords[ii].length() >= 8) && !(passwords[ii].contains("!") || passwords[ii].contains("@") && passwords[ii].contains("#") || passwords[ii].contains("%") || passwords[ii].contains("^") || passwords[ii].contains("&") || passwords[ii].contains("*")) ){
        specials++;
        }
        else if (passwords[ii].length() >= 8 && !(passwords[ii].contains("!") || passwords[ii].contains("@") && passwords[ii].contains("#") || passwords[ii].contains("%") || passwords[ii].contains("^") || passwords[ii].contains("&") || passwords[ii].contains("*")) ){
        Strength3++;
        }
       
    }
    System.out.println("There is  " + strength +"passwords that match and a strength of 1");
    System.out.println("There is  " + specials +"passwords that match and a strength of 2");
    System.out.println("There is "+ Strength3+" With a strength of 3");
    System.out.println("no strength"+(passwords.length-strength-specials-Strength3));



		
	}
}
