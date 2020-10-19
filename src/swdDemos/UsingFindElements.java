package swdDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFindElements
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("No of links in the page : " + links.size());
		
		System.out.println("The links are : ");
		
		for(WebElement link : links)
		{
			System.out.println(link.getText());
		}
	}
}
