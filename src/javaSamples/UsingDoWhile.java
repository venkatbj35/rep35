package javaSamples;

import java.util.Scanner;

public class UsingDoWhile
{
	public static void main(String[] args) 
	{
		String uid,pwd;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.print("Enter Username : ");
			uid=sc.next();
			System.out.print("Enter Password : ");
			pwd=sc.next();
		}while(!uid.equals("java") || !pwd.equals("programs"));
	}
}
