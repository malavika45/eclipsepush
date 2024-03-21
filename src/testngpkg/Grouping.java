package testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
@BeforeTest
public void setup() {
	driver=new ChromeDriver();
	driver.get(baseurl);
}
//@BeforeMethod
///public void urlset() {
	//driver.get(baseurl);
//}
@Test
public void titleverification()
{
	String expected ="rediff.com";
	System.out.println("Expected Title:"+expected);
	String actual= driver.getTitle();
	System.out.println("Actual Title:"+actual);
	if(expected.equals(actual))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
@Test
public void logodisplay()
{
	WebElement value=driver.findElement(By.xpath("//div[@id='wrapper']/table/tbody/tr/td[1]/img"));
	boolean v=value.isDisplayed();
	if(v)
	{
		System.out.println("Logo is displayed");
	}
	else
	{
		System.err.println("Logo is not displayed");
	}
}
@Test
public void labelverification()
	{
		String src=driver.getPageSource();
		String wrd="Full Name";
		
		//boolean value=fullname.isDisplayed();
		if(src.contains(wrd))
		{
			System.out.println("Fullname is present");
		}
		else
		{
			System.err.println("Fullname is not present");
		}
	}

@Test
public void buttonverification()
{
WebElement button=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[34]/td[2]/input[6]"));
boolean value=button.isEnabled();
if(value)
{
	System.out.println("Button is present");
}
else
{
	System.err.println("Button is not present");
}
}
@Test
public void buttontextverification()
{
	WebElement text=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[34]/td[2]/input[6]"));
	String st=text.getAttribute("value");
	String s="Create my account >>";
	if(st.contains(s))
	{
		System.out.println("Buttontext is present");
	}
	else
	{
		System.out.println("Buttontext is not present");
	}
}


}

	
	



