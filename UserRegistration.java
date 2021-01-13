package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
			
		String regex ="^[A-Z]{1}[a-z]{2,}";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name :");
		String s=sc.nextLine();
		Pattern p=Pattern.compile(regex);
		Matcher matcher=p.matcher(s);
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
