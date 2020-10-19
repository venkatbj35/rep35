package swdDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCalendar1
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		
		//click on date field
		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();
		
		//selecting 20th day from the calendar
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
		
		for(int i=3;i<=rows.size();i++)
		{
			List<WebElement> cols=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[" + i + "]/td"));
			
			for(int j=1;j<=cols.size();j++)
			{
				WebElement cell=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[" + i + "]/td[" + j + "]"));
				
				if(cell.getText().equals("20"))
				{
					cell.click();
					break;
				}
			}
		}
	}

}














