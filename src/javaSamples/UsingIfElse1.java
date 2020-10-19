package javaSamples;

import java.util.Scanner;

public class UsingIfElse1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("You entered EVEN Number...");
		}
		else
		{
			System.out.println("You entered ODD Number...");
		}
	}

}
