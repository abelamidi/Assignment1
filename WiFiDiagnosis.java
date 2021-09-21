/*
 * Class: CMSC203 CRN: 22507
 * Assignment 1 
 * Instructor: Farnaz Eivaz
 * 
 * Description: This program ask the user yes or no questions in order to help the user with
   possible problems with their Internet connections and fix it.
    
 * Due: 9/14/2021
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   
   Programmer Abraham Lamidi
*/


import java.util.Scanner;


public class WiFiDiagnosis {
	
	public static void main(String[] args) {
		
		// First round of prompt till the first step.
		System.out.println("If you have a problem with internet connectivity, "
				           +"this WiFi Diagnosis might work.\n");
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
	
		//Setting up user input
		String answers;
		Scanner reponse = new Scanner(System.in);
		answers = reponse.nextLine();
	
		//Nested if/else statements follow up question
		if(answers.equals("no")) {
			
			System.out.println("Second step: reboot your router");
			System.out.println("Are you able to connect with the internet? (yes or no)");
			answers = reponse.nextLine();
			
		}
		else if(answers.equals("yes")){
			
			//Yes answer for first step
			System.out.println("Rebooting your computer seemed to work");
			System.exit(0);
		}else{
			
			//Invalid output if input is not "yes" or "no"
			System.out.println("INVALID ANSWER: START OVER");
			System.exit(0);
		}
		   if(answers.equals("no")) {
				
				System.out.println("Third step: make sure the cables to your router are "
						+ "plugged in firmly and your router is getting power");
				System.out.println("Are you able to connect with the internet? (yes or no)");
				answers = reponse.nextLine();
		   }
		   else if(answers.equals("yes")){
			   
			    //Yes answer for second step
				System.out.println("Rebooting your router seemed to work");
				System.exit(0);
		   }else{
				
				System.out.println("INVALID ANSWER: START OVER");
				System.exit(0);
		   }
			   if(answers.equals("no")) {
					
					System.out.println("Fourth step: move your computer closer to your router");
					System.out.println("Are you able to connect with the internet? (yes or no)");
					answers = reponse.nextLine();
			   }
			   else if(answers.equals("yes")){
				   
				    //Yes answer for third step
					System.out.println("Checking the router's cables seemed to work");
					System.exit(0);
			   }else{
					
					System.out.println("INVALID ANSWER: START OVER");
					System.exit(0);
			   }
				   if(answers.equals("no")) {
						
						System.out.println("Fifth step: contact your ISP");
						System.out.println("Make sure your ISP is hooked up to your router.");
						System.exit(0);
				   }
				   else if(answers.equals("yes")){
					   
					    //Yes answer for fourth step
						System.out.println("Moving your computer seemed to work");
						System.exit(0);
				   }else{
						
						System.out.println("INVALID ANSWER: START OVER");
						System.exit(0);
				   }
			
	}

}
