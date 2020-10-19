package javaSamples;

import java.util.Scanner;

public class Ex_SwitchRepeat 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String rep;
		do
		{
			System.out.print("Enter Number1 : ");
			int n1=sc.nextInt();
			System.out.print("Enter Number2 : ");
			int n2=sc.nextInt();
			System.out.print("Enter choice of operation(+/-/*) : ");
			String choice=sc.next();

			int result=0;
			boolean isValid=true;


			switch(choice)
			{
			case "+":
				result=n1+n2;
				break;
			case "-":
				result=n1-n2;
				break;
			case "*":
				result=n1*n2;
				break;
			default:
				isValid=false;
				break;			
			}

			if(isValid==true)
			{
				System.out.println("The arithmetic operation " + choice + " on " + n1 + " with " + n2 + " is : " + result );
			}
			else
			{
				System.out.println("Invalid choice entered...");
			}
			
			System.out.print("Do you want to Continue (y/n) ? ");
			rep=sc.next();
		}while(!rep.equals("n"));
	}

}
