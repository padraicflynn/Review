package postSchoolPractice;

import java.util.Scanner;

public class PostSchoolPractice {

// main method to run what we want
	 public static void main(String[] args) {
		 new PostSchoolPractice().run(); 
	 }
	 
	private void run() {

// using a scanner to ask the user's name for a greeting
		
		 Scanner input = new Scanner (System.in);
		 System.out.println("What is your first name? \n");
		 String firstName = input.next();
		 
		 System.out.println("What is your last name? \n");
		 String lastName = input.next();
		 
	  
		 String name = "Padraic";
		 System.out.println("Hello there, " + firstName + " " + lastName + "." +
				 "\nMy name is " + name + ".\n");
		 
// Asking if we want to see math.
		 
		 boolean validResponse = false;
		do {
		 System.out.println("Would you like to see me add 40 and 20 together? Please enter yes or no only.");
		 String answerOne = input.next();
		 
		 boolean questionOne = false;
		  
		 
		switch(answerOne) {
		 case "yes":
			 System.out.println("Ok! The answer to 40 pluse 20 is: " + math() + "\nSee you next time " + firstName + " " + lastName);
			 validResponse = true;
			 break;
			 
		 case "no":
			 System.out.println("Ok, we don't show off math for you, " + firstName + lastName + ". Bye for now!");
		 validResponse = true;
		 break;
		 
		 default:
			 System.out.println("Sorry, please enter yes or no only ");
		 }
	}while (!validResponse );
 } 
 
	// the method we call on if we want to show off basic math
	public int math() {
		 int x = 40;
		 int y = 20;
		return (x += y);
	 }
	  
}

