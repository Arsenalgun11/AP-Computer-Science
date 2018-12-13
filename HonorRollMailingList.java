/* 
File:  HonorRollMailingList.java
Name:  Mr. Conrey

Include any import statements necessary.

The output of the programming should be formatted as follows:

Enter your first name (a string):  Sandra
Enter your last name (a string):  Smith
Enter your street address (a string):  123 Cardinal Blvd.
Enter your city (a string):  Louisville
Enter your state (a string):  Kentucky
Enter your zip code (an int):  40241
Enter your gpa (a double):  4.38

Here is the information you entered:
First Name: Sandra
Last Name: Smith
Address: 123 Cardinal Blvd.
City: Louisville
State: Kentucky
Zip Code: 40241
GPA: 4.38

 */

package ch02;

import java.util.Scanner;

//Include any import statements necessary.


public class HonorRollMailingList
{
	public static void main(String[] args)
	{	

		Scanner reader = new Scanner(System.in);
String fname;
String lname;
String address;
String city;
String state;
int zipcode;
double gpa;



		System.out.println(" Enter your first name (a string):  ");	
		fname = reader.nextLine();
		System.out.println(" Enter your last name (a string):  ");
		lname = reader.nextLine();
		System.out.println(" Enter your street address (a string):  ");
		address = reader.nextLine();
		System.out.println(" Enter your city (a string):  ");
		city = reader.nextLine();
		System.out.println(" Enter your state (a string):  ");
		state = reader.nextLine();
		System.out.println(" Enter your zip code (an int):  ");
		zipcode = reader.nextInt();
		System.out.println(" Enter your gpa (a double):  ");
		gpa = reader.nextDouble();
		System.out.println();  // outputs a blank line
		System.out.println(" Here is the information that you entered:  ");
		System.out.println(" First Name: " + fname);
		System.out.println(" Last Name: " + lname);
		System.out.println(" Address: " + address);
		System.out.println(" City: " + city);
		System.out.println(" State: " + state);
		System.out.println(" Zip Code: " + zipcode);
		System.out.println(" GPA: " + gpa);
	}
}

















