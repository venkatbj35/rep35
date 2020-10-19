package testNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AmazonTest 
{
	@Test
	public void aSearch() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("LG");
		driver.findElement(By.className("nav-input")).click();

		Reporter.log("Amazon Search Test is Successful...",true);
	}
}
