package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drag_drop {
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/drag_drop.html";
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void drgdrp()
	{
		WebElement account1=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	    WebElement accountplaceholder=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	    WebElement amount1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	    WebElement amountplaceholder=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	    Actions act=new Actions(driver);
	    act.dragAndDrop(account1,accountplaceholder);
	    act.dragAndDrop(amount1,amountplaceholder);
	    act.perform();
	    
	    
	    WebElement account2=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	    WebElement accountplchldr=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	    WebElement amount2=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	    WebElement amountplchldr=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	    
	    act.dragAndDrop(account2, accountplchldr);
	    act.dragAndDrop(amount2, amountplchldr);
	    act.perform();
	}
   
	@Test
	public void perfect()
	{
		boolean perfect=driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).isDisplayed();
		if(perfect)
		{
			System.out.println("perfect is displayed");
		}
		else
		{
			System.out.println("perfect is not displayed");
		}
	}
	
		
}
