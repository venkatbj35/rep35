package javaSamples;

import java.util.Scanner;

public class UsingBreak 
{
	public static void main(String[] args) 
	{
		String uid,pwd;
		int count=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			if(count==3)
			{
				System.out.println("Your 3 choices are over.Exiting the application...");
				break;
			}
			if(count>0)
			{
				System.out.println("Invalid Login details.Try Again...");
			}
			System.out.print("Enter Username : ");
			uid=sc.next();
			System.out.print("Enter Password : ");
			pwd=sc.next();
			count=count+1;
		}while(!uid.equals("java") || !pwd.equals("programs"));
	}

}
