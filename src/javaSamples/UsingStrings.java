package javaSamples;

import java.util.Scanner;

public class UsingStrings 
{
	public static void main(String[] args) 
	{
//		* charAt() - used to get  character at the specified index position
//		String str="javaPrograms";
//		System.out.println(str.charAt(5));
		
//		* indexOf() - used to get index position of specified character
//		String str="javaPrograms";
//		System.out.println(str.indexOf('r'));
//		System.out.println(str.indexOf('x'));
		
//		* equals() - used to compare two string to check whether they are equal or not
//		* equalsIgnoreCase() - similare to the above method but it don't consider the case
//		String str1="java";
//		String str2="java";
//		String str3="JAVA";
//		String str4="programs";
//		
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equals(str3));
//		System.out.println(str1.equalsIgnoreCase(str3));
//		System.out.println(str1.equals(str4));
				
//		* endsWith() - used to verify whether given string is ending with specific character sequence or not
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter email : ");
//		String email=sc.next();
//		
//		if(email.endsWith("@gmail.com") || email.endsWith("@yahoo.com"))
//		{
//			System.out.println("You entered Valid Email...");
//		}
//		else
//		{
//			System.out.println("You entered InValid Email...");
//		}
		
//		* contains() - used to verify whether the string contains specified character sequence or not
//		String str="javaPrograms";
//		System.out.println(str.contains("r"));
//		System.out.println(str.contains("x"));
//		System.out.println(str.contains("gr"));
//		System.out.println(str.contains("vr"));
		
//		* length() - returns no.of chars in the specified string
//		String str1="javaPrograms";
//		String str2="java Programs";
//		System.out.println(str1.length());
//		System.out.println(str2.length());
		
		
//		* concat() - used to combine two strings as a unit
//		String str1="java";
//		String str2=" Programs";
//		System.out.println(str1.concat(str2));
		
		
//		* split() - used to divide a string into different parts based on some expression
//		String str="Java Program Demos";
//		String[] words=str.split(" ");
//		
//		System.out.println("No of words : " + words.length);
//		
//		System.out.println("The words are : ");
//		for(String w : words)
//		{
//			System.out.println(w);
//		}
		
		
//		* substring() - used to get a part of the string from main string
		//substring(beginIndex) - returns a substring start with beginIndex upto the end
		//substring(beginIndex,endIndex) -returns a substring start with beginIndex and upto endIndex
		
		String str="javaPrograms";
		System.out.println(str.substring(4));
		System.out.println(str.substring(0,4));
	}
}




































