package javapractice;

import java.util.Scanner;

public class Scanner_practice {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Scanner s2=new Scanner(System.in);
	System.out.println("Enter your Name");
	String name = s.next();
	System.out.println("Enter your phone number");
	long phonenumber = s.nextLong();
	System.out.println("Enter your City");
	String city = s.next();
	System.out.println("Enter Your Address:");
	String address = s2.nextLine();
	System.out.println("Enter your Salary");
	s.nextFloat();
	System.out.println("Enter your Gender");
	char gender = s.next().charAt(0);
	System.out.println("Name:"+name);
	System.out.println("Phonenumber:"+phonenumber);
	System.out.println("City:"+city);
	System.out.println("Address:"+address);
	System.out.println("Gender:"+gender);
	
}
}
