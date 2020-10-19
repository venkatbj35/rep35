package testNGDemos;

import org.testng.annotations.Test;

public class PrioritizedTestingDemo 
{
	@Test(priority=1)
	public void Login() 
	{
		System.out.println("Login Test Script...");
	}

	@Test(priority=4)
	public void SignOut() 
	{
		System.out.println("SignOut Test Script...");
	}

	@Test(priority=2)
	public void Deposit() 
	{
		System.out.println("Deposit Test Script...");
	}

	@Test(priority=3)
	public void Withdraw() 
	{
		System.out.println("Withdraw Test Script...");
	}
}
