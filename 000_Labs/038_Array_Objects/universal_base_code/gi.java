/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
    public static void main(String args[]) {
        Wizard[] wizards = new Wizard[100];
        Warrior[] warriors = new Warrior[100];
        for (int i = 0; i < 100; i++) {
            warriors[i] = new Warrior("Warrior");
            wizards[i] = new Wizard("Wizard");
        }




        int wi = 0; 
        int wa = 0; 
        System.out.println("War begins!");

        while (wa < 100 && wi < 100) {

            Warrior W = warriors[wa];
            Wizard Z = wizards[wi];

            
            Z.attack(W);

            if (W.isDead()) {
                System.out.println("A warrior has died");
                wa++;
                
            }
            W.attack(Z);
            if (Z.isDead()) {
                System.out.println("A wizard Has died");
                wi++;
         }
            
         }
        
        int warriorsRemaining = 100-wa;
        int wizardsRemaining = 100-wi;
        if (wa >= 100 && wi >= 100) {
            System.out.println("both sides lost");
        } else if (wa >= 100) {
            System.out.println("wizards win");
            System.out.println("wizards lef: " + wizardsRemaining);
      } 
       else{
            
            
            System.out.println("warriors win");
            System.out.println("Warriors left: " + warriorsRemaining);
      }
   }
}