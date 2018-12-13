package ch07;
import java.util.Scanner;

/*
THIS PROGRAM WILL USE ONLY THE FOLLOWING STRING METHODS:

int length() ... finds the number of characters of the string

String substring(int beginIndex, int endIndex) ... returns the string 
			from beginIndex up to endIndex - 1 (not including endIndex)

int compareTo(String s) ...
	returns 0 if the strings are equal
 */

public class SubstringMania1
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner (System.in);	

		// Part 1. FIND THE POSITION OF TWO LETTERS IN A STRING
		System.out.print("Enter a string from the keyboard that contains multiple ");
		System.out.print("occurrences of two letters like the word \"eclectic\": ");
		String str = reader.nextLine();
		System.out.print("Enter two letters like \"ec\": ");
		String twoLetters = reader.nextLine();
		// Call the method printLocationsOfTwoCharacters and pass it str & twoLetters.
		// This is a void method call.
		

		System.out.println();
		System.out.println();

		// **************************************************************************

		// Part 2. BUILD A REVERSED STRING IN UPPER CASE

		System.out.print("Enter a word to be reversed and capitalized: ");
		str = reader.nextLine();
		// Call the method buildReversedUpperCaseString and pass it str.
		// Store the value returned by the method in the String variable reversed.
		
		
		// Activate the next line.
		//System.out.println("The reversed upper-case word is " + reversed);	 
		System.out.println();
		System.out.println();
		
		// **************************************************************************

		// Part 3. FIND POSITION OF VOWELS IN A STRING

		System.out.print("Enter a String to identify the position of lower case vowels: ");
		str = reader.nextLine();
		// Call the method printPositionOfVowelsInString and pass it str.
		// This is a void method call.
		
		
		System.out.println();
		System.out.println();
		System.out.println("Program Terminated.");

	} // end of main method - DO NOT DELETE THIS BRACE

	
	// *****************************************************************************

	
	// Part 1.  Write the method printLocationsOfTwoCharacters that receives two
	// parameters, a String named str and a String named twoLetters.  This method
	// will use a count-up for loop that will successively test every pair of
	// consecutive characters in str to see if they are equivalent to twoLetters.
	// Whenever, they are equivalent, the method will print the position of the
	// first of the two characters that are equivalent.  You must use only the length,
	// substring and compareTo methods in your code. Credit will not be given for the
	// use of any other String methods.  A line of code inside the loop should print
	// the twoLetters and the starting position.  Here is a sample run of the program
	// if str holds the value "eclectic" and the value of twoLetters is "ec"
	/*
			ec is found at position 0
			ec is found at position 3
	 */

	
	
	
	
	


	// Part 2.  Write the method buildReversedUpperCaseString that receives a
	// String str and builds a new String, character by character, using a
	// COUNT-DOWN FOR LOOP. The loop reverses str and also changes all letter to
	// upper case. Use only the length, substring, and toUpperCase methods in your
	// code. Credit will not be given for the use of any other String methods.
	// The new reversed String raised to upper case will be returned by the method.



	
	
	
	
	
	
	

	
	
	// Part 3. Write the method printPositionOfVowelsInString that receives
	// a String str.  This is a void method that will print the position of
	// all of the lower case vowels (a, e, i, o, & u) of any String that the
	// method receives. As each vowel is printed, its position in str should
	// also be printed. Hint: your loop control variable i knows the location
	// of a vowel as it finds one.  Use only the length, compareTo and substring
	// methods in your code. Credit will not be given for the use of any other
	// String methods.  If the String str holds "computer" then the output should be:
	/*
			A vowel in the String "computer" is o located at index 1
			A vowel in the String "computer" is u located at index 4
			A vowel in the String "computer" is e located at index 6

	If the String "career builder" was entered above then the output would be:
			A vowel in the String "career builder" is a located at index 1
			A vowel in the String "career builder" is e located at index 3
			A vowel in the String "career builder" is e located at index 4
			A vowel in the String "career builder" is u located at index 8
			A vowel in the String "career builder" is i located at index 9
			A vowel in the String "career builder" is e located at index 12
	 */

	
	
	
	
	
	

	
} // end of StringMethodsMania1 - DO NOT DELETE THIS BRACE