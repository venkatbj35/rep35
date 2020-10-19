package swdDemos;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenShotDemo 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		
		File fSource=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File fDest=new File("D:\\Google Drive\\QA @6.30PM IST\\Selenium\\Programs\\errorPic.png");
		
		FileHandler.copy(fSource, fDest);
	}

}
