/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
      String item = "Pizza";
      String itema = "hotdog";
      String itemb = "Burger";
      Double dub = 2.50;
      Double bib = 5.50;
      Double hu = 5.50;
      System.out.println("This is the menu");
      System.out.println(item+ dub);
      System.out.println(itema+ bib);
      System.out.println(itemb+ hu);
      System.out.println("How many pizzas would you like");
      int a = sc.nextInt();
      System.out.println("How many hotdogs would you like");
      int b = sc.nextInt();
      System.out.println("How many burgers would you like");
      int d = sc.nextInt();
      System.out.println("Whats the name for the order");
      String name = sc.nextLine();
      
      double g = dub*a;
      double f = bib*b;
      double h = hu*d;
      double sum = g+f+h;
      System.out.println(sum);
      System.out.println("What percent would you like to tip");
      double tipper = sc.nextDouble();
      double tip = sum * (tipper/100);
      double grandtotal = tip + sum;
      System.out.println("Your recipt");
      System.out.println(a+"xpizzas = $"+g); 
      System.out.println(b+"xHotdogs = $"+f) ;
      System.out.println(d+"xBurgers = $"+h);
      System.out.println("total "+grandtotal);
	}
	

}
