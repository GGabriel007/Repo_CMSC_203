/*
 * Class: CMSC203
 * Instructor: Khandan Vahabzadeh Monshi
 * Description: Wrote a program that test your ESP (extransensory perception)
 * Due: 09/11/2023
 * Platform/compiler: 
 * I solemnly affirm that I have completed the programming assignment entirely on my own. 
 * I have neither plagiarized code from any fellow student nor sourced it from any external 
 * materials, and I have refrained from sharing my code with any other student.
 * My name: Gabriel A Gonzalez.
 * 
 * 
 * 
 */

package task1;
import java.util.Scanner;  
import java.util.Random; 

public class ESPGame 
{
	public static void main(String [] args)
	{	
		Scanner myObj = new Scanner(System.in);
		
		//Declaring the variables and obtaining input from user
		System.out.print("Enter your name: ");
		String userName = myObj.nextLine();
		
		System.out.print("Describe yourself: ");
		String userDescription = myObj.nextLine();
		
		System.out.print("Due Date: ");
		String userDate = myObj.nextLine();
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
	
		//Getting user and computer choice and creating rounds for the game 
		int userPoint = 0;
		int userRounds = 0;
		for (int i=1; i<11; i++) 
		{
			//Getting Computer Guess
			Random rand = new Random();
			String computerColor = null; 
			
			int rand_int1 = rand.nextInt(5);
			
			switch (rand_int1) {
				case 0: computerColor = "Red";
						break;
				case 1: computerColor = "Green";
						break; 
				case 2: computerColor = "Blue";
						break; 
				case 3: computerColor = "Orange";
						break; 
				case 4: computerColor = "Yellow";
						break; }
			
			//Getting User Choice 
			System.out.println("Round " + i); 
			System.out.print("\nI am thinking of a color.\n"
					+ "It is Red, Green, Blue, Orange, or Yellow\n"
					+ "Enter your guess: ");
			String userColor = myObj.nextLine();
			if (userColor.toLowerCase().equals("red") || userColor.toLowerCase().equals("green")
					|| userColor.toLowerCase().equals("blue") || userColor.toLowerCase().equals("orange")
					|| userColor.toLowerCase().equals("yellow")){
				System.out.println("\nI was thinking of " + computerColor + "\n");
				
				if (userColor.toLowerCase().equals(computerColor.toLowerCase())){	
					userPoint++;	
				}
			}else {
				System.out.println("\nYou entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?"
						+ "\nEnter your guess again: \n");
				i--; 
				userRounds--;
			}
			userRounds++;	
		}	
			
		//Printing out final information
		System.out.println("\nYou guessed " + userPoint + " out of " + userRounds + " colors correctly.");
		System.out.println("Your Name is: " + userName + "\nNice you meet you " + userName + "!!");
		System.out.println("Your Description: " + userDescription);
		System.out.println("Todays Date: " + userDate );
		System.out.println("Programmer's name: Gabriel A Gonzalez. ");
	}

}
