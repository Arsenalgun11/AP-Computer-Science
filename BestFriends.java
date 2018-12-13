/* 
File:  BestFriends.java
Name:  

Include any import statements necessary.

Someone who runs the program should see the following:

Enter your first best friend (a string):  Bill
Enter your second best friend (a string):  Ann
Enter your third best friend (a string):  Steve

Here are your three best friends:
Bill
Ann
Steve

*/
package ch02;

import java.util.Scanner;

public class BestFriends
{
	public static void main(String[] args)
	{			
	Scanner reader = new Scanner(System.in);
	String bf1;
	String bf2;
	String bf3;
	
	System.out.println(" Enter your first best friend:  ");	
	bf1 = reader.nextLine();
	System.out.println(" Enter your second best friend:  ");	
	bf2 = reader.nextLine();
	System.out.println(" Enter your third best friend:  ");	
	bf3 = reader.nextLine();
	
	System.out.println(" Here are your three best friends:  ");	
	System.out.println(bf1);
	System.out.println(bf2);	
	System.out.println(bf3);	
	
	
		
		
	}
}













