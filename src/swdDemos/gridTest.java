package swdDemos;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class gridTest 
{
  @Test
  public void f() throws Exception
  {
	    //DesiredCapabilities cap=DesiredCapabilities.chrome();	//browser
		
	  	DesiredCapabilities cap=DesiredCapabilities.firefox();	//browser
		cap.setPlatform(Platform.WINDOWS);			//set the platform
		
		URL url=new URL("http://localhost:4444/wd/hub");
		
		WebDriver driver=new RemoteWebDriver(url,cap);
		
		driver.get("http://ebay.com");
		
		driver.findElement(By.id("gh-ac")).sendKeys("LG");
		driver.findElement(By.id("gh-btn")).click();
  }
}
