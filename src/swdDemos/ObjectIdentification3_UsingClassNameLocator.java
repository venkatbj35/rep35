package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentification3_UsingClassNameLocator
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("LG");
		driver.findElement(By.className("nav-input")).click();
	}

}
