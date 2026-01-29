
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String ans = "";
	System.out.println("Please enter a sentenace");
	String s = sc.nextLine();
    String pig = "";
    String first = s.substring(0,1);
    String second = s.substring(1,2);
    if(first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u")){
		pig = s + "way";
		}
		 else if(!(first.equals("a`") ||  first.equals("e ")  ||  first.equals("i")  || first.equals("o")  || first.equals("u ") )
		        && (second.equals("a") || second.equals("e") || second.equals("i") || second.equals("o") || second.equals("u"))) {
		       pig = s.substring(1) + first + "ay";
		        }
		else  {
		pig = s.substring(2) +first+second +"ay";
		}
		
		System.out.println("pig Latin "+pig);
	}
}

	
	

