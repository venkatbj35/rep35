package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://vodafone.com");
		
		driver.findElement(By.xpath("(//*[@class='navigation-item-title strudel-init'])[2]")).click();
	}
}
