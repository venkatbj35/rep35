package testNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestDemo extends DriverFactory
{
  @Test(dependsOnMethods="checkTitle")
  public void Search()
  {
	  driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
	  
	  Actions a=new Actions(driver);
	  a.sendKeys(Keys.ENTER).build().perform();
  }
  @Test
  public void checkTitle()
  {
	  String actTitle=driver.getTitle();
	  
	  Assert.assertEquals(actTitle, "Bing");
		  
  }
}
