package swdDemos;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
public class UsingSync3_FluentWaitDemo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Day to select " );
		String day=sc.next();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");

		String beforeSel=driver.findElement(By.xpath(
  "//*[@id='ctl00_ContentPlaceholder1_ctl00_ContentPlaceholder1_Label1Panel']")).getText();
		
		System.out.println("Before Date Selection : " + beforeSel);
		
		driver.findElement(By.linkText(day)).click();
		
		FluentWait w=new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv")));
		
		String afterSel=driver.findElement(By.xpath(
 "//*[@id='ctl00_ContentPlaceholder1_ctl00_ContentPlaceholder1_Label1Panel']")).getText();
		System.out.println("After Date Selection : " + afterSel);
	}

}
