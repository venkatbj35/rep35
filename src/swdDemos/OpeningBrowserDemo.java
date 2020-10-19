package swdDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningBrowserDemo 
{
	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Selenium sw\\BrowserDrivers84\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium sw\\BrowserDrivers84\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	}
}
