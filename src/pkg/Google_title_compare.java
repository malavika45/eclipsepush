package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google_title_compare {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); // to launch chrome
		driver.get("https://www.google.com"); // to load url
		// check the google title
		String expected ="Google";
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
		driver.quit(); // quit() close the entire browser, close() close only one tab

	}

}
