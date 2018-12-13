package ch07;
import java.util.Scanner;

public class IndexOfMania
{
	public static void main(String[] args)
	{		
		Scanner reader = new Scanner (System.in);	
		System.out.print("Enter a word or string from the keyboard and press return: ");
		String word = reader.nextLine();
		System.out.print("Enter one character that may or may not be in the string: ");
		String ch = reader.nextLine();

		// Part 1.  Stop and write the method threeLetterSubstringAtCharacter
		// at the end of this file and then call it here.  Pass the method the word
		// or string entered from the keyboard and the character entered from the
		// keyboard.  Print the value returned by the method.
		String c4 = threeLetterSubstringAtCharacter(word,ch);



		System.out.println("Let's see if we get a three letter substring. ");
		System.out.println(c4);


		System.out.println();


		// **************************************************************************

		// Part 2. Stop and write the method randomAtoZ at the end of this file.  It receives
		// no parameters. The method returns a String value that contains all upper case letters
		// A through Z once in random order within the string.  Store the String value
		// returned by the method in the variable randomLetters.  DO NOT PRINT the value
		// returned yet until instructed.  Just store the value returned.
		String randomLetters = randomAtoZ();
		
		// **************************************************************************
		System.out.println("Now let's play a game where you try to guess a random letter");
		System.out.println("that is as far to the end of 26 random letters as possible.");
		System.out.print("The random letters might be something like this ... ");
		System.out.println("MCVEFTHYDIZAGJSQLNBKOXWRPU. Note they are all upper case.");
		System.out.println("For these letters, if you guess \"M\" then you would win $1.");
		System.out.println("For these letters, if you guess \"U\" then you would win $26.");
		System.out.print("The random letters always contain all upper case letters from A to Z");	
		System.out.println("in some order.  Now let's play.");
		System.out.println();
		System.out.print("Enter only an upper case letter A through Z: ");
		String letter = reader.nextLine();

		// Part 3. Stop and write the method findDollarsForCharacter at the end of this file
		// and pass it letter and randomLetters.
		//      **** Store the value returned in the integer variable dollars. ****
		int variabledollars = findDollarsForCharacter(letter,randomLetters);

		// Print the value dollars in an output line that uses the message:
		//   "The number of dollars you won is: "


		System.out.println("The number of dollars you won is: $" + variabledollars);

		// Print the value of randomLetters in an output line that uses:
		//   "The random letters were:  "



		System.out.println();
		System.out.println();

		System.out.println("Program terminated.");
	}


	// Write the method threeLetterSubstringAtCharacter that receives two parameters
	// of type String.  The first parameter named str will hold a word or other string,
	// like a sentence.  The second parameter ch will hold a single string character.
	// This method will search for the position of the first occurrence of the single
	// character ch and if it finds it, then the method will return the three letter
	// substring beginning at that character.  If ch is in str but there are not two
	// characters after ch, then the method should return "word not long enough".
	// If ch is not found in str, then the method should return "ch NOT found".
	// THIS METHOD SHOULD NOT PRINT ANYTHING.  IT WILL RETURN ONE OF THE THREE STRINGS
	// DISCUSSED ABOVE.
	// To receive full credit you cannot use the substring method. You must use indexOf.
	// Sample outputs:
	/*
	Output 1:
		Enter a word or string from the keyboard and press return: bearcats
		Enter one character that may or may not be in the string: c
		Let's see if we get a three letter substring. 
		cat

	Output 2:
		Enter a word or string from the keyboard and press return: bearcats
		Enter one character that may or may not be in the string: t
		Let's see if we get a three letter substring. 
		word not long enough

	Output 3:
		Enter a word or string from the keyboard and press return: bearcats
		Enter one character that may or may not be in the string: s
		Let's see if we get a three letter substring. 
		word not long enough

	Output 4:
		Enter a word or string from the keyboard and press return: bearcats
		Enter one character that may or may not be in the string: z
		Let's see if we get a three letter substring. 
		ch NOT found
	 */
	public static String threeLetterSubstringAtCharacter(String str, String ch)
	{
		String threeLetter = "";
		int begin = str.indexOf(ch);
		if (str.length() < 3)
		{
			threeLetter = "Word not long enough. " ;
		}
		if (str.indexOf(ch)==-1 )
		{
			threeLetter = "ch NOT found";
		}
		else
		{
		String c1 =str.substring(begin,begin+1);
		String c2 =str.substring(begin+1,begin+2);
		String c3 =str.substring(begin+2,begin+3);
		 threeLetter = c1+c2+c3;
		
		}
		return threeLetter;
	}





	// Write the method randomAtoZ that receives nothing, but returns a String
	// value.  The String value contains all of the upper case letters A to Z
	// once in random order.  To do this use a loop that runs 26 times and each time
	// generate a random integer between 65 and 90 inclusive.  Pass the random
	// integer to the private helper method getLetter and it will return you one
	// letter from A to Z depending on the integer.  If you pass the method 65,
	// then it returns you "A".  If you pass it 66, then it returns you "B", etc.
	// Accumulate the letters in a String variable randomLetters, but if the letter
	// has already been included, then don't include it again.  You can check to 
	// see if it is already included by calling the indexOf method before you add it.
	// If it has already been added then make the loop run again until it finds one
	// that is not included.  To receive full credit you cannot use the substring
	// method and you must use indexOf.

	public static String randomAtoZ()
	{
		String randomLetters = "";
		for (int i=0; i< 26; i++)
		{
			int n1 = (int)(Math.random()*26)+65;
			String ch= getLetter(n1);
			if(randomLetters.indexOf(ch)==-1)
				randomLetters+=ch;
			else
				i--;
	
		}
		return randomLetters; 
	}





	// Write the method findDollarsForCharacter that returns an integer that
	// represents the number of dollars that a person wins from the game.
	// The method receives two parameters.  The first parameter is ch that
	// contains a single letter.  The second parameter is randomLetters, which
	// contains the randomized sequence of A to Z.  This method will return 1 ($1)
	// if letter is found in position 0 of the string, 2 ($2) if letter is found in
	// position 1 of the string, etc.  If letter is in the last position of the
	// string then the method returns 26 ($26).  If the letter entered was not in
	// the string because it wasn't a character from A to Z, then the method returns 0.
	// To receive full credit you cannot use the substring method and you must use indexOf.
	public static int findDollarsForCharacter(String ch,String randomLetters)
	{
		int prize = 0;
		if (randomLetters.indexOf(ch)==1)
		{
			prize = 1;
		}
		else if (randomLetters.indexOf(ch)==2)
		{
			prize = 2;
		}
		else if (randomLetters.indexOf(ch)==3)
		{
			prize = 3;
		}
		else if (randomLetters.indexOf(ch)==4)
		{
			prize = 4;
		}
		else if (randomLetters.indexOf(ch)==5)
		{
			prize = 5;
		}
		else if (randomLetters.indexOf(ch)==6)
		{
			prize = 6;
		}
		else if (randomLetters.indexOf(ch)==7)
		{
			prize = 7;
		}
		else if (randomLetters.indexOf(ch)==8)
		{
			prize = 8;
		}
		else if (randomLetters.indexOf(ch)==9)
		{
			prize = 9;
		}
		else if (randomLetters.indexOf(ch)==10)
		{
			prize = 10;
		}
		else if (randomLetters.indexOf(ch)==11)
		{
			prize = 11;
		}
		else if (randomLetters.indexOf(ch)==12)
		{
			prize = 12;
		}
		else if (randomLetters.indexOf(ch)==13)
		{
			prize = 13;
		}
		else if (randomLetters.indexOf(ch)==14)
		{
			prize = 14;
		}
		else if (randomLetters.indexOf(ch)==15)
		{
			prize = 15;
		}
		else if (randomLetters.indexOf(ch)==16)
		{
			prize = 16;
		}
		else if (randomLetters.indexOf(ch)==17)
		{
			prize = 17;
		}
		else if (randomLetters.indexOf(ch)==18)
		{
			prize = 18;
		}
		else if (randomLetters.indexOf(ch)==19)
		{
			prize = 19;
		}
		else if (randomLetters.indexOf(ch)==20)
		{
			prize = 20;
		}
		else if (randomLetters.indexOf(ch)==21)
		{
			prize = 21;
		}
		else if (randomLetters.indexOf(ch)==22)
		{
			prize = 22;
		}
		else if (randomLetters.indexOf(ch)==23)
		{
			prize = 23;
		}
		else if (randomLetters.indexOf(ch)==24)
		{
			prize = 24;
		}
		else if (randomLetters.indexOf(ch)==25)
		{
			prize = 25;
		}
		else if (randomLetters.indexOf(ch)==26)
		{
			prize = 26;
		}
		else 
		{
			prize = 0;
		}
		return prize;
	}









	// ***************************************************************************
	// NO CODE TO WRITE BEYOND THIS LINE.

	// DO NOT ERASE OR CHANGE THE CODE IN THIS PRIVATE HELPER METHOD!
	// This method is called by the method randomAtoZ.
	private static String getLetter(int random)
	{
		String ch = "";

		if (random == 65)
			ch = "A";
		else if (random == 66)
			ch = "B";
		else if (random == 67)
			ch = "C";
		else if (random == 68)
			ch = "D";
		else if (random == 69)
			ch = "E";
		else if (random == 70)
			ch = "F";
		else if (random == 71)
			ch = "G";
		else if (random == 72)
			ch = "H";
		else if (random == 73)
			ch = "I";
		else if (random == 74)
			ch = "J";
		else if (random == 75)
			ch = "K";
		else if (random == 76)
			ch = "L";
		else if (random == 77)
			ch = "M";
		else if (random == 78)
			ch = "N";
		else if (random == 79)
			ch = "O";
		else if (random == 80)
			ch = "P";
		else if (random == 81)
			ch = "Q";
		else if (random == 82)
			ch = "R";
		else if (random == 83)
			ch = "S";
		else if (random == 84)
			ch = "T";
		else if (random == 85)
			ch = "U";
		else if (random == 86)
			ch = "V";
		else if (random == 87)
			ch = "W";
		else if (random == 88)
			ch = "X";
		else if (random == 89)
			ch = "Y";
		else if (random == 90)
			ch = "Z";

		return ch;
	}


} // end of IndexOfMania