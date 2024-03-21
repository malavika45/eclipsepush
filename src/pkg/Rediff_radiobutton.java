package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_radiobutton {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@Before
	public void setup()
	{
		driver.get(baseurl);
		
	}
	@Test
	public void radiobutton_verification()
	{
		boolean radio=driver.findElement(By.xpath("//table[@id=\'tblcrtac']/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(radio)
		{
			System.out.println("Radio button is selected");
		}
		else
		{
			System.out.println("Radio button is not displayed");
		}

}
}
