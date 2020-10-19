package javaSamples;

import java.util.Scanner;

public class UsingNestedIfElse2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Salary : ");
		double sal=sc.nextDouble();
		
		double gSal=0.0;
		int comm=0;
		
		if(sal<20000)
			comm=10;
		else if(sal>=20000 && sal<=40000)
			comm=20;
		else
			comm=30;
		
		gSal=sal+(comm*sal)/100;
		
		System.out.println("Gross Salary : " + gSal);
	}

}
