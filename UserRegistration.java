package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
			
		String regex ="^[A-Z]{1}[a-z]{2,}";
		String email="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		String phone="^[0-9]{1,3}[ ][6-9]{1}[0-9]{9}$";
		String pass="[a-z]*[A-Z]+[0-9]*$";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name :");
		String s1=sc.nextLine();
		System.out.println("Enter Last Name :");
		String s2=sc	.nextLine();
		System.out.println("Enter Email :");
		String s3=sc.nextLine();
		System.out.println("Enter phone number :");
		String s4=sc.nextLine();
		System.out.println("Enter Password :");
		String s5=sc.nextLine();
		Pattern p=Pattern.compile(regex);
		Pattern p1=Pattern.compile(email);
		Pattern p2=Pattern.compile(phone);
		Pattern p3=Pattern.compile(pass);
		System.out.println("First Name :");
		pattern(s1,p);
		System.out.println("Last Name :");
		pattern(s2,p);
		System.out.println("Email :");
		pattern(s3,p1);
		System.out.println("phone :");
		pattern(s4,p2);
		System.out.println("password :");
		pattern(s5,p3);
	}
	public static void pattern(String str,Pattern pat)
	{
		
		Matcher matcher=pat.matcher(str);
		if (matcher.matches()) 
		{
			System.out.println("valid");
		}
		else 
		{
			System.out.println("Not valid");
		}
	}
				
}
