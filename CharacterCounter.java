// FileName:  CharacterCounter.java
// Chapter 3 Section 2 Program.
// Working with String objects and using the length() method of the String class.

/*
 * The output of the program should be this if John Doe is entered:

	Enter your first name (a string):  John
	Enter your last name (a string):  Doe
	The number of characters in your name is: 7
 * 
 */

package ch03;

import java.util.Scanner;

//Include any import statements necessary.


public class CharacterCounter
{
	public static void main(String[] args)
	{			
		// The code in the main method should do four things:
		// 1)  prompt the user to enter the first name and read it from the keyboard
		// 2)  prompt the user to enter the last name and read it from the keyboard
		// 3)  call the countCharactersInName which returns the number of characters
		//     in both names.
		// 4)  Print the number of characters returned by the method countCharactersInName.
		// Declare the Scanner variable reader and then construct a Scanner object to accept
		// input from the keyboard.
		Scanner reader = new Scanner(System.in);
		int thelength;
		System.out.print("Enter your first name (a string):");
		String firstName = reader.nextLine();
		System.out.print("Enter your last name (a string):");
		String lastName = reader.nextLine();
		int LengthOfNames = countCharactersInName (firstName, lastName);
		System.out.println("The number of characters in your name is: " + LengthOfNames);
		
	}
	
	// Write the method countCharactersInName that receives two String parameters firstName
	// and lastName and returns an integer value.  This method should calculate the total
	// number of characters in firstName and lastName and return the result.

	public static int countCharactersInName (String firstName, String lastName) 
	{

	int firstNameLength = firstName.length();
	int lastNameLength = lastName.length();
	int numCharacters = firstNameLength + lastNameLength;
	return numCharacters;
	}
}











