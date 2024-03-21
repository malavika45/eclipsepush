package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasaya_pgm {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https.//janasya.com";
	@Before
	public void setup()
	{
		driver.get(baseurl);
	}
		@Test
		public void janasy1() 
		{
			String expected ="Janasya";
			System.out.println("Expected Title:"+expected);
			String actual= driver.getTitle();
			System.out.println("Actual Title:"+actual);
			if(expected.equals(actual))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
			driver.findElement(By.xpath("//div[@class='header-navigation header-nav-plain']/div/div/div[1]/div/nav/ul/li[1]/a/span")).click();
			driver.findElement(By.xpath("//div[@class='collection-default']/div/div[1]/div/div[2]/div[1]/div/h3")).click();
			driver.findElement(By.xpath("div[@id='halo-sidebar']/div[2]/div[1]/div[2]/div/ul/li[1]/a/span")).click();
		//div[@class='collection-default']/div/div[1]/div/div[2]/div/div[2]/div/ul/li[1]/a/span	
	}
}
