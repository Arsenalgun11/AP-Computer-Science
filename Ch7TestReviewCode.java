package ch07;
// KEYS TO PRACTICE CODING QUESTIONS ON THE CHAPTER 7 REVIEW SHEET.
import java.util.Scanner;

public class Ch7TestReviewCode 
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner (System.in);

		// Part 1.  REMOVE SUBSTRING.
		System.out. print("Enter a string value that will have a substring extracted: ");
		String text = reader.nextLine();

		System.out. print("Enter a substring to be removed from the word: ");
		String sub = reader.nextLine();

		String newPhrase = removeSubstring(text, sub);
		System.out. print("The new phrase is: " + newPhrase);

		System.out. println();
		System.out. println();		
		System.out. println("***************************************************");
		System.out. println();

		// Part 2.  SAME FIRST LETTER.
		System.out. println("Enter two strings to see if they have the same first letter.");
		System.out. print("Enter the first string value: ");
		String s1 = reader.nextLine();
		System.out. print("Enter the second string value: ");	
		String s2 = reader.nextLine();

		if (sameBeginning(s1, s2))
			System.out. println("The first letters of both words are the same!");
		else
			System.out. println("The first letters of both words are NOT the same!");

		System.out. println();
		System.out. println();		
		System.out. println("***************************************************");
		System.out. println();

		// Part 3.
		System.out. print("Enter a word to collect the vowels: ");
		String str = reader.nextLine();
		String vowels = collectVowels(str);
		System.out. println("The vowels in " + str + " are " + vowels);

	}	

	// Practice Coding Question 1.
	// Write the method removeSubstring.  This method returns a String value.
	// It receives two parameters.  One named text and one named sub.
	// This method finds the first occurrence of the substring sub in the
	// String named text and returns text with that substring removed.
	// If the given substring is not found, the method returns text unchanged.
	// Assume this method appears in a driver program that has a main method.

	


	// Practice Coding Question 2.
	// Write the method sameBeginning.  This method receives two String parameters
	// named s1 and s2.  It returns true if the first characters of each string
	// are equivalent, otherwise it returns false.  
	


	// Practice Coding Question 3.
	// Write the method collectVowels.  This method receives one String parameter
	// named word and returns a String value that has all of the vowels a, e, i, o, and u
	// concatenated together in the same order they appear in word. Sample call of method:
	// 		Enter a word to collect the vowels: careerbuilder
	//		The vowels in careerbuilder are aeeuie
	

}
