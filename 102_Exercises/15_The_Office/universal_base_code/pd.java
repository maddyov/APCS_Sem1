/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		System.out.println(michael.getAnnualSalary());
		Employee Dwight = new Employee(1987,"dwight","Howard",4416.66);
		Dwight.employeeToString();
		System.out.println(Dwight.getAnnualSalary());
		Employee Jim = new Employee(2474,"Jim","Halpert",4416.66);
		Jim.employeeToString();
		System.out.println(Jim.getAnnualSalary());
		Employee Pam = new Employee(2011,"Pam","Beesly",2250);
		Pam.employeeToString();
		System.out.println(Pam.getAnnualSalary());
		Employee emery = new Employee(6741, "Emery", "guinn",5.0);
		 emery.raiseSalary(15);
		 
		 emery.employeeToString();
		 System.out.println(emery.getAnnualSalary());
		
	}
}
