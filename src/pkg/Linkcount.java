package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://www.facebook.com";
	@Before
	public void setUp()
	{
		driver.get(baseurl);
	}
	@Test
	public void linkcount()
	{
		List<WebElement> linklist =driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
	}
	

}