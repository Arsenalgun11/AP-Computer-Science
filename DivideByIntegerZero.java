// FileName:  DivideByIntegerZero.java
// Run this program and enter any integer value except 0
// and you will see the program run correctly and output a quotient.
// Run the program a second time and enter 0 and the program will halt
// and throw an ArithmeticException with an error message of
// Integer division by 0.

package ch03;

import java.util.Scanner;

public class DivideByIntegerZero
{
	private static Scanner reader;

	public static void main (String [] args)
	{
		reader = new Scanner (System.in);		
		System.out.print("Enter an integer for the variable divisor: ");
		double divisor = reader.nextDouble();
		double quotient =  3 / (divisor + 3);
		System.out.print("The quotient of 3 divided by ");
		System.out.println(divisor + " is " + quotient);
	}
}















