package oopsDemos;

import java.util.Scanner;

public class UsingExceptionHandling 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.print("Enter Number1 : ");
			int n1=sc.nextInt();

			System.out.print("Enter Number2 : ");
			int n2=sc.nextInt();

			int result=n1/n2;

			System.out.println("The division of " + n1 + " With " + n2 + " is : " + result);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("you can't divide a number with zero...");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			sc.close();
		}
	}
}
