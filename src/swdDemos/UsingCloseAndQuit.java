package swdDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCloseAndQuit 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://naukri.com");
		
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		
		System.out.println(url + "==>" + title);
		
		//driver.close();
		driver.quit();
	}
}
