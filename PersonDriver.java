package ch08;// FileName:  PersonDriver.java// This file is a Driver file.  It is also known as a Client file or View File.// It uses the Person Model Class file.  So we can say that this file is a "client"// file of the "server" file Person.  Doesn't a client make requests to a server?// This file, PersonDriver, makes request (calls methods) of the Person Model Class file.  // Revised  12/05/14import java.util.Scanner;public class PersonDriver{	public static void main (String[] args)	{		// How do you construct an object?  You call a constructor method.		// How do you construct a Scanner object?		//     Scanner reader = new Scanner (System.in);		// How do you construct a Color object?		//     Color myColor = new Color (255, 255, 255);		// Now that you remember how to construct those kind of objects,		// declare person1 as a Person variable and call the DEFAULT CONSTRUCTOR		// to instantiate a new Person object for it to refer to.		// Hint:  instantiate means construct!		Person person1 = new Person();		// Call the toString() method explicitly inside a System.out.println		// statement to print the state of the object person1 with its default		// values. Just activate and then finish the statement below.		System.out.println("Here is the info on Person #1: " + "\n" + person1.toString()  );		// RUN THE PROGRAM AND SEE THE OUTPUT VALUES.		// DOES THE OUTPUT MAKE SENSE BASED ON THE DEFAULT CONSTRUCTOR?		// *******************************************************************		// NOW YOU ARE GOING TO CALL THE MUTATOR METHODS OF THE PERSON CLASS!		// Call the appropriate mutator method and set the name of		// person1 to "Mary".		person1.setName("Mary");		// Call the appropriate mutator method and set the age of		// person1 to 17.		person1.setAge(17);		// Call the appropriate mutator method and set the address of		// person1 to "123 Water St.".		person1.setAddress("123 Water St.");		// Call the appropriate mutator method and set the phone number of		// person1 to "502-423-0440".		person1.setPhone("502-423-0440");		// Call the toString() method implicitly inside a System.out.println		// statement to print the state of the object person1 with its default		// values. Just activate and then finish the statement below.		System.out.println("Here is the info on Person #1: " + "\n" + person1);			// STOP AND RUN THE PROGRAM BEFORE WRITING ANY MORE CODE!		// DOES IT MAKE SENSE WHY YOU ARE NOW SEEING DATA FOR THE PERSON		// OBJECT AFTER CALLING THE MUTATOR METHODS?		// ****************************************************************		// NOW YOU ARE GOING TO CONSTRUCT A SECOND PERSON IN A DIFFERENT WAY!		// Now, stop and write the method getDataAndConstructPerson.		// There is nothing to pass this method but it returns a Person object.		// Assign the person object to a new Person variable named person2.		Person person2 = getDataAndConstructPerson();		// Call the toString() method explicitly inside a System.out.println		// statement to print the state of the person2 object.		System.out.println("Here is the info on Person #1: " + "\n" + person2.toString()  );		// STOP AND RUN THE PROGRAM BEFORE WRITING ANY MORE CODE!		// DOES IT MAKE SENSE THE OUTPUT YOU ARE SEEING FOR person2?		// ******************************************************************		// NOW YOU ARE GOING TO REUSE THE ABOVE VARIABLES TO STORE VALUES		// RETURNED BY THE ACCESSOR METHODS OF THE PERSON CLASS!!!		// Call the appropriate accessor method to obtain the name		// of person2 and assign it to the variable name.String name = person2.getName();		// Write a println statement to output just the name of person2		// using the message "The name of Person #2 is : "System.out.println("The name of Person #2 is : " + name );		// Call the appropriate accessor method to obtain the age		// of person2 and assign it to the variable age.int age = person2.getAge();		// Write a println statement to output just the age of person2		// using the message "The age of Person #2 is : "System.out.println("The age of Person #2 is : " + age );		// Call the appropriate accessor method to obtain the address		// of person2 and assign it to the variable address.	String address = person2.getAddress();		// Write a println statement to output just the address of person2		// using the message "The address of Person #2 is : "	System.out.println("The address of Person #2 is : " + address );		// Call the appropriate accessor method to obtain the phone number		// of person2 and assign it to the variable phone.	String phone = person2.getPhone();		// Write a println statement to output just the phone number of		// person2 using the message "The phone number of Person #2 is : "	System.out.println("The phone number of Person #2 is : " + phone );		System.out.println();		System.out.println();		// STOP AND RUN THE PROGRAM BEFORE WRITING ANY MORE CODE!		// YOU WILL NOW SEE ALL OF DATA FOR THE person2 OBJECT PRINTED		// DIFFERENTLY, BECAUSE EACH INSTANCE VARIABLE VALUE WAS ACCESSED		// INDIVIDUALLY AND THEN PRINTED.		// *******************************************************************		// Declare person3 as an Person variable and call the copy constructor		// and makea copy of person1 for person3 to refer to.		Person person3 = new Person(person1);		// Call the toString() method implicitly inside a println statement to		// to display the state of the person3 object.System.out.println(person3);		// STOP AND RUN THE PROGRAM BEFORE WRITING ANY MORE CODE!		// YOU WILL NOW SEE ALL OF DATA FOR THE person3 THAT IS		// PRINTED BY THE toString METHOD.		// ******************************************************************		// Now, set person3 variable to null.person3 = null;		// Call the toString() method implicitly inside a println statement to		// to display the state of the person3 object.System.out.println(person3);		// STOP AND RUN THE PROGRAM BEFORE WRITING ANY MORE CODE!		// YOU WILL NOW SEE ALL OF DATA FOR THE person3 THAT IS PRINTED		// BY THE toString METHOD WHEN person3 REFERS TO NULL.		// ******************************************************************		// Now, call the getName accessor method with the person3 variable		// and assign the value to the variable name.		 name = person3.getName();		// VIEW THE WARNING NEXT TO THE LAST LINE OF CODE AND THEN RUN THE 		// PROGRAM AND SEE THE NULLPOINTEREXCEPTION THAT OCCURS.	} // end of main method	// Write the method getDataAndConstructPerson that receives no parameters	// but returns a Person object.  This method will ask for the person's name,	// age, address, and phone number and then construct a Person object and	// return it.			public static Person getDataAndConstructPerson()			{				Scanner reader = new Scanner(System.in);				System.out.println("Enter name:");				String personsname = reader.nextLine();				System.out.println("Enter age:");				int personAge = reader.nextInt();				reader.nextLine();				System.out.println("Enter address:");				String personsaddress = reader.nextLine();				System.out.println("Enter phone number:");				String personsPhone = reader.nextLine();				Person person2 = new Person(personsname,personAge,personsaddress,personsPhone);				return person2;															}} // end of PersonDriver.java