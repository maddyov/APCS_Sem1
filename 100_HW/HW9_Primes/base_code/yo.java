/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;


    public class starter {

    
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }

        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false; 
            }
            i++;
        }
        return true; 
    }

  
    public static void printPrimes(int a) {
        int i = 2;
        while (i < a) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
            i++;
        }
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = input.nextInt();

        System.out.println("Prime numbers less than "+num);
        printPrimes(num);
	}
}

