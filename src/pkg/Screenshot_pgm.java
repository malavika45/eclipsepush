package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_pgm {
	ChromeDriver driver=new ChromeDriver();
	String baseurl="https://www.facebook.com/";
	@Before
	public void setup()
	{
		driver.get(baseurl);
		
	}
	@Test
	public void scrensht() throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D://screenshot/fbscreenshot.png"));
		WebElement loginbutton=driver.findElement(By.name("login"));
		File src1=loginbutton.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./Scrensht/loginbutton.png"));
		
		
		
		
	}

}
