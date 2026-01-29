package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;	
	
	
    public Spiderman(){
    	age = 0;
    	actor = "Unkown";
        villain = "Unkown";
    }
    public Spiderman(String act){
       actor = act;
       villain = "Unkown";
    	age = 0;
    }
    public Spiderman(int a){
    	age = a;
    	actor = "unknown";
    	villain = "Unknown";
    }
    public Spiderman(String act, int a){
    	age = a;
    	actor = act;
    	villain = "Unknown";
    }
    public Spiderman(String act, int a, String vill){
        age = a;
        actor = act;
        villain = vill;
    }
    
        
        
    
    
    
        
    
	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	  public String getActor() {
        return actor;
    }

    public int getAge() {
        return age;
    }

    public String getVillain() {
        return villain;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVillain(String villain) {
        this.villain = villain;
    }
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
