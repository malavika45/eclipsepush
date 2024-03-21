package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_insta {
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
		driver.findElement(By.xpath("//input[@aria-label=''Phone number,username, or email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dfhjd");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		/*driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("abc@gmail.com");
		  //driver.findElement(By.xpath("form[@id='loginForm']/div/div[2]/div/label/input")).sendKeys("abc@gmail.com");

		*/
		
	}


}
