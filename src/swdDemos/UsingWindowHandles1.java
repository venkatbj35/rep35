package swdDemos;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWindowHandles1 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://naukri.com");
		
		//getting currently focused window information
//		String title=driver.getTitle();
//		String winId=driver.getWindowHandle();
//		
//		System.out.println(winId + "==>" + title);
		
		//getting all windows information
		Set<String> winIds=driver.getWindowHandles();
		
		for(String id : winIds)
		{
			driver.switchTo().window(id);
			System.out.println(id + "==>" + driver.getTitle());
		}
	}

}
