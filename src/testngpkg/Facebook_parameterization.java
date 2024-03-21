package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook_parameterization {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com/";
	@BeforeTest
	public void setup() {
		driver =new ChromeDriver();
		driver.get(baseurl);
		
	}
	
	@Parameters({"username","password"})
	@Test
	public void login(String username,String password)
	{
		System.out.println("value="+username);
		driver.findElement(By.id("email")).sendKeys(username);
		System.out.println("value="+username);
		driver.findElement(By.name("pass")).sendKeys(password);
		
		
		}
}
	//@Parameters({"password"})
	//@Test
	//