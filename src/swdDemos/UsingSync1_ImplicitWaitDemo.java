package swdDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingSync1_ImplicitWaitDemo 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("venkatbj@yahoo.com");
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
		driver.findElement(By.xpath("//*[@id='login-passwd']")).sendKeys("abc");

		
	}

}
