package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_pgm {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://www.facebook.com";
	@Before
	public void setUp()
	{
		driver.get(baseurl);
	}
	@Test
	public void fblogin()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dfhjd");
		driver.findElement(By.xpath("//button[@name='login']")).click();

		
		
	}


}
