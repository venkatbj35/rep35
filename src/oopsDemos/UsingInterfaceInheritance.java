package oopsDemos;

import java.util.Scanner;

interface IBankAccount
{
	double getBalance();
	void Deposit(double amt);
	boolean Withdraw(double amt);
}

class SavingsAccount implements IBankAccount
{
	private double lBalance;
	
	@Override
	public double getBalance() 
	{
		return lBalance;
	}

	@Override
	public void Deposit(double amt)
	{
		lBalance=lBalance+amt;		
	}

	@Override
	public boolean Withdraw(double amt) 
	{
		if(amt<=lBalance)
		{
			lBalance=lBalance-amt;
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

public class UsingInterfaceInheritance
{
	public static void main(String[] args) 
	{
		SavingsAccount sObj=new SavingsAccount();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Initial Balance : " + sObj.getBalance());
		
		System.out.print("Enter amount to Deposit : ");
		double dAmt=sc.nextDouble();
		sObj.Deposit(dAmt);
		System.out.println("After Depositing, Balance : " + sObj.getBalance());
		
		System.out.print("Enter amount to Withdraw : ");
		double wAmt=sc.nextDouble();
		boolean result=sObj.Withdraw(wAmt);
		
		if(result==true)
		{
			System.out.println("After Withdrawing, Balance : " + sObj.getBalance());			
		}
		else
		{
			System.out.println("Insufficient Funds.Withdraw Failed...");
		}
	}
}
