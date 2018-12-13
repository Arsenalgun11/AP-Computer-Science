// FileName:  CircleCalculator.java

package ch03;

import java.util.Scanner;

public class CircleCalculator
{

	public static void main (String [] args)
	{	
		// Declare a Scanner variable reader and construct the Scanner
		// object that will read input from the keyboard.
		Scanner reader = new Scanner(System.in);

		// Prompt the user to enter the radius of a circle.
		System.out.print("Enter the Radius: ");
		
		
		


		// read the radius value from the keyboard and store it in the
		// variable named radius.
		double radius = reader.nextDouble();

		// Call the calculateArea method and pass it the radius entered
		// from the keyboard and store the returned result in the double
		// variable named area.
		double Area2 = calculateArea(radius);
		

		// Output the area of the circle to the screen.
		System.out.println("The area of your circle is: " + Area2);

		//------------------------------------------------------------

		// Call the calculateCircumference method and pass it the radius entered
		// from the keyboard and store the returned result in the double
		// variable named circumference.
		Double Circumference2 = calculateCircumference(radius);
		

		// Output the circumference of the circle to the screen.
		System.out.println("The circumference of your circle is: " + Circumference2);

		//------------------------------------------------------------

		// Call the calculateDiameter method and pass it the radius entered
		// from the keyboard and store the returned result in the double
		// variable named diameter.
		Double diameter2 = calculateDiameter(radius);
		
		
		
		// Output the diameter of the circle to the screen.
		System.out.println("The diameter of your circle is:" + diameter2);
		

	} // end main method


	// Write the method calculateArea.  It returns a double value.
	// It receives one parameter named r of type double representing
	// the radius of a circle.  The method calculates the area of the
	// circle with the radius r and stores it in the variable area.
	// You must use a method of the Math class to calculate the r-squared.
	// Be sure and use the Math class constant PI in your calculation.
	// The method returns the area of the circle stored in the variable area.
public static double calculateArea( double radius)
{
	double Area = (Math.PI * (Math.pow(radius, 2)));
	return Area;
}

	// Write the method calculateCircumference.  It returns a double value.
	// It receives one parameter named r of type double representing
	// the radius of a circle.  The method calculates the circumference of the
	// circle with the radius r and stores it in the variable circumference.
	// Be sure and use the Math class constant PI in your calculation.
	// The method returns the circumference of the circle stored in the variable
	// circumference.
public static double calculateCircumference(double radius)
{
	double Circumference = (Math.PI * (2 * radius));
	return Circumference;
}

	
	


	// Write the method calculateDiameter.  It returns a double value.
	// It receives one parameter named r of type double representing
	// the radius of a circle.  The method calculates the diameter of the
	// circle with the radius r and stores it in the variable diameter.
	// The method returns the diameter of the circle stored in the variable diameter.
public static double calculateDiameter(Double radius)
{
	double diameter = (2 * radius);
	return diameter;
}


}	// end of program.  Do NOT write code beyond this line!














