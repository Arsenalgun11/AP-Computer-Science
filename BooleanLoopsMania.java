package ch06;

import java.util.Scanner;
// FileName:  BooleanLoopsMania.java

public class BooleanLoopsMania
{
	public static void main (String[] args)
	{
		Scanner reader = new Scanner(System.in);

		// DO NOT USE BREAK STATEMENTS ANYWHERE IN THIS PROGRAM!!!

		// Part 1.  A RANDOM VALUE EVENLY DIVISIBLE BY 13.
		// Write a segment of code that contains a WHILE NOT DONE LOOP that uses
		// the boolean variable done to start and end the loop.  The loop will
		// generate a random integer between 1 and 500 inclusive and then
		// check to see if the random integer is evenly divisible by 13.
		// If it is, then the boolean variable done will be set so that the
		// loop will end and the random integer will be printed out.
		// The loop will also count how many random integers had to be
		// generated before one was found that was evenly divisible by 13.
		// This count should be displayed when the process is complete.
		// Here is a sample run of this code segment:
		/*
		Let's find a random integer between 1 and 500 that is evenly divisible by 13 ...

		The number 286 is evenly divisible by 13.
		12 number(s) were generated to find one evenly divisible by 13.
		 */
		System.out.print("Let's find a random integer between 1 and 500 that ");
		System.out.println("is evenly divisible by 13...\n");
		boolean done = true;
		int num = 0;
		int runs = 0; 
		while(done)
		{
			runs++;
			num = (int)(Math.random()*500)+1;
			System.out.println("The randomly generated number is " + num);
			if (num % 13 == 0)
			{
				System.out.println("The " + num + " is evenly divisible by 13.");
				done = false;
				System.out.println( runs + " number(s) were generated to find one evenly divisible by 13.");
			}

		}












		System.out.println();		System.out.println();

		// ********************************************************************************

		// Part 2.  GUESS THE COMPUTER'S CHOSEN WORD.
		// This code segment contains a WHILE NOT QUIT LOOP that starts and ends based
		// on the boolean variable quit.  This loop controls whether the game is played
		// again based on the user's response.  This WHILE NOT QUIT LOOP contains a
		// WHILE NOT DONE LOOP that controls the operation of the game. Before the game
		// starts or after a game is finished, the computer randomly selects one of the
		// five words: java  return  static  void  class.
		// Each time the WHILE NOT DONE LOOP runs, the user guesses what he or she
		// thinks the word is by entering it from the keyboard.  The compareTo method
		// of the String class should be used to compare the answer entered by the user
		// with the word chosen by the computer.  See the sample run of the program
		// below to see what the output should be for all possible choices.
		// The loop will count how many turns it takes for the user to guess the computer's 
		// chosen word and then print out the number of turns it took after the game is over.
		// Suggested variables: numberOfGuesses, wordToGuess, and randomValue.
		// Once the game is over, the user should be asked if they want to play the game
		// again.  If they do, then the WHILE NOT QUIT LOOP should continue, otherwise it
		// should quit.
		// Here is a sample run of the program.
		/*
		Try to guess which one of the following words the computer is thinking of.
		java   return   static   void   class

		Enter one of these words ... java   return   static   void   class:  class
		That is not the word the computer has chosen.  Guess again.

		Enter one of these words ... java   return   static   void   class:  void
		That is not the word the computer has chosen.  Guess again.

		Enter one of these words ... java   return   static   void   class:  java
		That is not the word the computer has chosen.  Guess again.

		Enter one of these words ... java   return   static   void   class:  return
		Yes the word was return.  You got it in 4 guesses.

		Enter "quit" to quit this game or "no" to continue:  no

		Try to guess which one of the following words the computer is thinking of.
		 java   return   static   void   class

		Enter one of these words ... java   return   static   void   class:  return
		That is not the word the computer has chosen.  Guess again.

		Enter one of these words ... java   return   static   void   class:  java
		Yes the word was java.  You got it in 2 guesses.

		Enter "quit" to quit this game or "no" to continue:  quit
		 */

		String guess;
		boolean quit = false;
		while(!quit)
		{
			System.out.println("Try to guess which one of the following words the computer is thinking of. java   return   static   void   class;");


			String wordToGuess ="";
			int num2 = (int)(Math.random() *5 +1);
			if (num2 ==1)
				wordToGuess= "java";
			else if (num2 ==2)
				wordToGuess= "return";
			else if (num2 ==3)
				wordToGuess= "static";
			else if (num2 ==4)
				wordToGuess= "void";
			else if (num2 ==5)
				wordToGuess= "class";
			int cntr = 0;

			done = false;
			while (!done)
			{
				System.out.println("Enter one of these words ... java   return   static   void   class: ");
				guess = reader.nextLine();
				cntr++;

				if (guess.compareTo(wordToGuess)==0)
				{
					System.out.println("Yes the word was "+wordToGuess+" . You got it in "+cntr+" guesses.");
					done = true;
				}
				else
				{
					System.out.println("That is not the word the computer has chosen.  Guess again.");
				}


			} // end of while(!done)
			System.out.println("Enter quit to quit this game or no to continue:");
			// ask user if they want to quit or "no" to continue		
			String quitter = reader.nextLine();
			if (quitter.compareTo("quit")==0)
			{
				quit = true;
			}
		} // end of while (!quit)
 

		System.out.println();
		System.out.println("Program Terminated.");

		// ********************************************************************************
	}
}
