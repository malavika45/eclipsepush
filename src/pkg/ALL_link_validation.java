package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALL_link_validation {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://www.google.com";
	@Before
	public void setup()
	{
		driver.get(baseurl);
		
	}
	@Test
	public void linkvalidation()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total link count="+li.size());
		for(WebElement ele:li)
		{
			String link=ele.getAttribute("href");
			verify(link);
		}
	}
	private void verify(String link)
	{
		try {
			URL u=new URL(link);
			  HttpURLConnection con=(HttpURLConnection)u.openConnection();
			  con.connect();
			  if(con.getResponseCode()==200)
			  {
				  System.out.println("Respone code is 200 succesful");
			  }
			  else if(con.getResponseCode()==404){
				  System.out.println("Response code is 404 broken link");
		
	}
              else
              {
            	  System.out.println("not response");
              }
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
			  
		


