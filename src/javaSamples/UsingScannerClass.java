package javaSamples;

import java.util.Scanner;

public class UsingScannerClass 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter Number1 : ");
		int n1=sc.nextInt();
		
		System.out.print("Enter Number2 : ");
		int n2=sc.nextInt();
		
		int result=n1/n2;
		
		System.out.println("The division of " + n1 + " with " + n2 + " is : " + result);
	}
}
