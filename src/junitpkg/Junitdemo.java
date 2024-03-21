package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	String baseurl="https://facebook.com";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void titleverification()
	{
		String exp="Facebook";
		System.out.println("Expected title:"+exp);
		String actual=driver.getTitle();
		System.out.println("Actual title:"+actual);
		if(exp.equals(actual))
		{
			System.out.println("Pass");	
		}
		else
		{
			System.out.println("Fail");
		}
		
		
	}
   @After
   public void tearDown()
   {
	   driver.quit();
   }

}
