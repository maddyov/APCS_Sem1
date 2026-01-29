/*
 *	Author:  
 *  Date: 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String [][] arr = new String [a.length()+5][a.length()+5];
    int randy = (int) (Math.random() *3);
    
    
    int colum = 0;
    int row = 0;
    
    if(randy == 2){
    	row = (int) (Math.random()* a.length());
    	colum = (int) (Math.random()* a.length());
   
    }
    else if (randy == 1){
    	row = (int) (Math.random()* a.length());
    	colum = (int) (Math.random()* a.length()+5);
    }
    else if(randy == 0){
        row = (int) (Math.random()* a.length()+5);
        colum = (int) (Math.random()* a.length());
    }
      for(int i = 0; i < a.length(); i++){
          if(randy == 0){
              arr[row][colum+i] = a.substring(i,i+1);
          }
          else if (randy == 1){
              arr[row+i][colum] = a.substring(i,i+1);
          }
          else{
              arr[row+i][colum+i] = a.substring(i,i+1);
          }
		
	}
	for(int i = 0; i < arr.length; i++){
    for(int h = 0; h < arr[0].length; h++){
        if(arr[i][h] == null){
            int b = (int)(Math.random() * letters.length);
            arr[i][h] = letters[b];
	       }
	}
	
}
for(int j = 0; j < arr.length; j++){
    for(int c = 0; c < arr[0].length; c++){
     System.out.print(arr[j][c] + " ");
    }
    System.out.println();

}
}
}

