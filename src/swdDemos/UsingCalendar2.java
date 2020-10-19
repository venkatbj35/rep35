package swdDemos;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCalendar2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Month to be selected : ");
		String month=sc.next();
		month=month.substring(0,3);	//taking only first 3 chars in the specified month
		
		System.out.print("Enter Day to be selected : ");
		String day=sc.next();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		
		//click on date field
		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();
		
		//Month Selection
		while(!driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText().substring(0,3).equalsIgnoreCase(month)) 
		{
			driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
		}
		
		//Day selection
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
		
		for(int i=3;i<=rows.size();i++)
		{
			List<WebElement> cols=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[" + i + "]/td"));
			
			for(int j=1;j<=cols.size();j++)
			{
				WebElement cell=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[" + i + "]/td[" + j + "]"));
				
				if(cell.getText().equals(day))
				{
					cell.click();
					break;
				}
			}
		}
	}
}




















