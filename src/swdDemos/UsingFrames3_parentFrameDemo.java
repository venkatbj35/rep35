package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFrames3_parentFrameDemo
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Google%20Drive/QA%20@6.30PM%20IST/Selenium/Programs/frames/main1.htm");
		
		driver.switchTo().frame("f1");
		driver.switchTo().frame("f2");
		
		driver.findElement(By.id("txtUid")).sendKeys("admin");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("txtPwd")).sendKeys("admin");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("btnSignIn")).click();
		System.out.println("LoggedIn Successfully...");

	}

}
