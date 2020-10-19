package javaSamples;

import java.util.Scanner;

public class UsingNestedIfElse1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Salary : ");
		int sal=sc.nextInt();
		char Grade;
		
		if(sal<20000)
			Grade='C';
		else if(sal>=20000 && sal<=40000)
			Grade='B';
		else
			Grade='A';
		
		System.out.println("Grade : " + Grade);
	}

}
