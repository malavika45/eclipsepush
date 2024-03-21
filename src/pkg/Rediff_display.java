package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_display {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@Before
	public void setup()
	{
		driver.get(baseurl);
		
	}
	@Test
	public void rediffdisplay()
	{
		 boolean value=driver.findElement(By.xpath("//div[@id='wrapper']/table/tbody/tr/td[1]/img")).isDisplayed();
		if(value)
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.err.println("Logo is not displayed");
		}
	}

}
