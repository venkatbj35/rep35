package testNGDemos;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsingAssertions 
{
  @Test
  public void myTest()
  {
//	  //HardAssertion(Assert)
//	  System.out.println("Begining...");
//	  Assert.assertTrue(true);
//	  System.out.println("Test1 is passed");
//	  Assert.assertTrue(false);
//	  System.out.println("Test2 is failed");
//	  Assert.assertTrue(false);
//	  System.out.println("Test3 is failed");
//	  System.out.println("Ending..");
	  
	  //SoftAssertion(Verify)
	  System.out.println("Begining...");
	  SoftAssert sa=new SoftAssert();
	  sa.assertTrue(true);
	  System.out.println("Test1 is passed");
	  sa.assertTrue(false,"Test2 is Failed");
	  System.out.println("Test2 is failed");
	  sa.assertTrue(false,"Test3 is failed");
	  System.out.println("Test3 is failed");
	  System.out.println("Ending..");
      sa.assertAll();
  }
}
