package swdDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebTable1
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//1. Identifying all the rows collection in the webtable
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		
		//2. Iterating b/w each row
		for(int i=2;i<=rows.size();i++)
		{

			//3. Identifying all the columns collection in a specific row
			List<WebElement> cols=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td"));
			
			//4. Iterating b/w each
			for(int j=1;j<=cols.size();j++)
			{
				//5. fetch the cell data at the intersection of row and column
				WebElement cell=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]"));
				System.out.print(cell.getText() + " || ");
			}
			System.out.println();
		}
		
		driver.close();
	}

}
