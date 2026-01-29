/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
    Dog doggo = new Dog("emery");
        doggo.setAge(2);

       
        Dog doggo1 = new Dog("matthew", "Chiwuawa");

        boolean doggosleep = doggo.isSleeping();
        boolean doggo1sleep = doggo1.isSleeping();
        if (doggosleep == true) {
            System.out.println(doggo.getName() + " is asleep.");
        } else {
            doggo.bark();
        }

        
        if (doggo1sleep == true) {
            System.out.println(doggo1.getName() + " is asleep.");
           
        } else { 
            if (doggosleep == false) { 
                doggo1.bark();
            }
        }
    }
}