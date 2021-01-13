package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
			
		String regex ="^[A-Z]{1}[a-z]{2,}";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name :");
		String s1=sc.nextLine();
		System.out.println("Enter Last Name :");
		String s2=sc.nextLine();
		Pattern p=Pattern.compile(regex);
		System.out.println("First Name :");
		pattern(s1,p);
		System.out.println("Last Name :");
		pattern(s2,p);
	}
	public static void pattern(String str,Pattern p1)
	{
		
		Matcher matcher=p1.matcher(str);
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
