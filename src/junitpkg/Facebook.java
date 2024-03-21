package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
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
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("dfhjd");
		driver.findElement(By.name("login")).click();

		
		
	}

}
