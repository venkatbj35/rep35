package javaSamples;

import java.util.Scanner;

public class UsingIfElse2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Salary : ");
		int sal=sc.nextInt();
		
		int aSal=0;
		
		if(sal>=20000)
		{
			aSal=12*sal;
			System.out.println("Annual Salary : " + aSal);
		}
		else
			System.out.println("Salary must be more than 20000 to get annual salary...");
		
	}

}
