package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); // to launch chrome
		driver.get("https://www.google.com"); // to load url
		// check the google title
		String expected="Google";
		String actual= driver.getTitle();
		System.out.println(actual);
		System.out.println(expected.equals(actual));
		;
	}

}
