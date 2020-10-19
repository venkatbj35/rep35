package testNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DriverFactory 
{
	public WebDriver driver;
	@BeforeTest
	public void StartUp() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
	}

	@AfterTest
	public void ShutDown() 
	{
		//driver.close();
	}

}
