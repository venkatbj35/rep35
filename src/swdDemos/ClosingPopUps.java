package swdDemos;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingPopUps
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://naukri.com");
		
		String mainWindow=driver.getWindowHandle();
		String mainTitle=driver.getTitle();
		
		Set<String> winIds=driver.getWindowHandles();
		
		for(String id : winIds)
		{
			driver.switchTo().window(id);
			if(!driver.getTitle().equals(mainTitle))
			{
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
	}

}
