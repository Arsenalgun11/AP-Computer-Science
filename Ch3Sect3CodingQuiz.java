package ch03;

// FileName:  Ch3Sect3CodingQuiz.java

/*
Note:  Celsius temperatures are converted to Fahrenheit temperatures
		based on the algebraic formula:  F = 9.0/5.0 * C + 32
	
	Sample Run of the Program 

Enter a celsius temperature: 100
The Fahrenheit temperature is 212.0
Enter a fahrenheit temperature above 212 degrees: 300
Enter a fahrenheit temperature below 32 degrees: 10
The difference in the high temperature and the low temperature is: 290.0

2nd Run of program:

Enter a celsius temperature: 0
The Fahrenheit temperature is 32.0
Enter a fahrenheit temperature above 212 degrees: 250
Enter a fahrenheit temperature below 32 degrees: 280
The difference in the high temperature and the low temperature is: 30.0
*/

import java.util.Scanner;

public class Ch3Sect3CodingQuiz
{
	public static void main (String [] args)
	{	
		// Declare a Scanner variable named reader and construct the
		// Scanner object that will read input from the keyboard.
		Scanner reader = new Scanner(System.in);

		// Prompt the user to enter a celsius temperature from the keyboard.
		System.out.print(" Enter a celcius temperature: " );
		
		// Read the celsius temperature value from the keyboard and
		// store it in the double variable named celsius.
		double celcius = reader.nextDouble();
		
		// STOP AND WRITE THE calculateFahrenheit METHOD AT THE BOTTOM OF
		// THIS FILE before going to the next instruction below.		
		
		// Call the calculateFahrenheit method and pass it the celsius
		// temperature entered from the keyboard and store the returned
		// result in the double variable named fahrenheit.
		double fahrenheit = calculateFahrenheit(celcius);
		
		
		// STOP AND WRITE THE  printFahrenheit  METHOD AT THE BOTTOM OF
		// THIS FILE before going to the next instruction below.

		// Call the method printFahrenheit and pass it the fahrenheit value
		// so that it can be printed.
		printFahrenheit(fahrenheit);
		
		
		// SUGGESTION:  STOP AND RUN THE PROGRAM AND MAKE SURE IT WORKS
		// CORRECTLY AND GIVES CORRECT OUTPUT.		
		
		// Prompt the user to enter a fahrenheit temperature above 212 degrees.
		System.out.println(" Enter a fahrenheit temperature above 212 degrees: ");
		
		// Read the fahrenheit temperature value from the keyboard and
		// store it in the double variable named highTemp.
		double highTemp = reader.nextDouble();
			
		// Prompt the user to enter a fahrenheit temperature below 32 degrees.
		System.out.println(" Enter a fahrenheit temperature below 32 degrees: ");
		
		// Read the fahrenheit temperature value from the keyboard and
		// store it in the double variable named lowTemp.
		double lowTemp = reader.nextDouble();		
		
		//------------------------------------------------------------
			
		// STOP AND WRITE THE temperatureDifference METHOD AT THE BOTTOM OF
		// THIS FILE before going to the next instruction below.
		
		
		// Call the temperatureDifference method and pass it both the
		// high temperature and the low temperature.  Store the returned
		// result in the double variable named difference.
		double difference = temperatureDifference(highTemp, lowTemp);
		
		// Output the difference of the high temperature and the low temperature
		// to the console window along with the message:
		// "The difference in the high and low temperatures is: ".
		System.out.println(" The difference in the high and low temperatures is: " + difference);
		
		
		// STOP AND RUN THE PROGRAM AND MAKE SURE IT WORKS CORRECTLY AND
		// GIVES CORRECT OUTPUT.
		
		System.out.println();
		System.out.println("Program has terminated.");
	} // end main method	

	
	// Write the method calculateFahrenheit.  It returns a double value.
	// It receives one parameter named celsius of type double representing
	// a celsius temperature.  The method calculates and returns the
	// equivalent fahrenheit temperature.  BE AWARE THAT INT DIVISON DOES
	// NOT INCLUDE THE REMAINDER.  WE WANT AN EXACT ANSWER!  The formula
	// to use is nine-fifths celsius plus 32.
	public static double calculateFahrenheit(double celcius)
	{
		double fahrenheit = (9.0/5.0 * celcius + 32);
		return fahrenheit;
	}
	
	
	
	
	
	
	// Write the method printFahrenheit.  It does NOT return a value.
	// It receives one parameter named fahr of type double representing
	// a fahrenheit temperature.  The method simply prints the fahrenheit
	// temperature along with the message:  "The Fahrenheit temperature is ".
	public static void printFahrenheit(double fahr)
	{
		System.out.println(" The fahrenheit temperature is: " + fahr);
		
	}
	
	
	
	

	// Write the method temperatureDifference.  It returns a double value.
	// It receives two parameters named highTemp and lowTemp of type double
	// representing two temperatures.  The method calculates the absolute value
	// of the difference between the two temperatures using the Math.abs method.
	// This absolute value is returned by the method.  We are using the absolute
	// value because the user may enter the temperatures backward.
	public static double temperatureDifference(double highTemp, double lowTemp)
	{
		double absoluteVal = Math.abs(highTemp - lowTemp);
		return absoluteVal;
	}
	
	
	
	
	
}	// end of program.  Do NOT write code beyond this line!

