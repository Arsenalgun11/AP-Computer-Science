/* 
File:  SimpleCircleCalculator.java
Name:  Mr. Conrey

Include any import statements necessary.

Enter your name (a string):  Jessica
Enter pi to as many decimal places as you can remember (a double):  3.14159
Enter a whole number for the radius (an integer):  2

Here is your name and the circumference of the circle:
Name: Jessica
Circumference of your circle: 12.56636
Area of your circle: 12.56636
Your radius was: 2
Your value of pi was: 3.14159

 */

package ch02;

import java.util.Scanner;

// Include any import statements you need


public class SimpleCircleCalculator
{
	public static void main(String[] args)
	{
		// Declare the Scanner variable reader and construct a Scanner object for it to refer
		// to that will read input from the keyboard.  (Hint:  see other files you have.)
		Scanner reader = new Scanner(System.in);
		String name;
		double pi;
		int radius;
		double circumference;
		double area;
		// Prompt the user to enter his or her name
	
		System.out.println(" Enter your name (a string): ");
		
		
		
		
				
		// Read the user's name from the keyboard and store it in a variable.
		name = reader.nextLine();

		// Prompt the user to enter the value of pi to as many decimal places as desired.
		System.out.println(" Enter pi to as many decimal places as you can remember (a double): ");
		
		// Read the value from the keyboard and store it in the variable named pi.
		pi = reader.nextDouble();

		// Prompt the user to enter an integer for the value of the radius of a circle
		System.out.println(" Enter a whole number for the radius (an integer): ");

		// Read the radius value from the keyboard and store it in an integer variable.
		radius = reader.nextInt();

		// Calculate the value of the circumference of a circle and store it in a double
		// variable named circumference.
		circumference = (2 * pi * radius);


		// Calculate the value of the area of a circle and store it in a double
		// variable named area.
		area = (radius * radius * pi);

		// Print a blank line to output.
		System.out.println();

		// No code to write on the next line.
		System.out.println("Here is your name and the circumference of the circle:");
		
		// Write the code below to output the information calculated or received by
		// the program so that it looks like this ...
		/*
			Name: Jessica
			Circumference of your circle: 12.56636
			Area of your circle: 12.56636
			Your radius was: 2
			Your value of pi was: 3.14159
		*/
		System.out.print(" Name: ");
		System.out.println(name);
		System.out.print(" Circumference of your circle: ");
		System.out.println(circumference);
		System.out.print(" Area of your circle: ");
		System.out.println(area);
		System.out.print(" Your radius was: ");
		System.out.println(radius);
		System.out.print(" Your value of pi was: ");
		System.out.println(pi);
	}
}
