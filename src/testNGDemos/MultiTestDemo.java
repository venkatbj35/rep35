package testNGDemos;

import org.testng.annotations.Test;

public class MultiTestDemo
{
  @Test
  public void Login() 
  {
	  System.out.println("Login Test Script...");
  }
  
  @Test
  public void SignOut() 
  {
	  System.out.println("SignOut Test Script...");
  }
  
  @Test
  public void Deposit() 
  {
	  System.out.println("Deposit Test Script...");
  }
  
  @Test
  public void Withdraw() 
  {
	  System.out.println("Withdraw Test Script...");
  }
}
