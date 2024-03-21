package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox_auto {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="file:///C:/Users/User/Desktop/alert.html";
	@Before
	public void setup()
	{
		driver.get(baseurl);
	}
	@Test
	public void alertauto()
	{
		driver.findElement(By.xpath("//html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println("alerttext=+alerttext");
		a.accept();
		//a.dismiss();// to cancel alert
		driver.findElement(By.xpath("//html/body/input[2]")).sendKeys("Malavika");
		driver.findElement(By.xpath("//html/body/input[3]")).sendKeys("Aji");
		driver.findElement(By.xpath("//html/body/input[4]")).click();
		
		
		
	}
	

}
