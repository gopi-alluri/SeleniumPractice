package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURLInChrome {

	public static void main(String[] args) {
		
		// Set the system property to get chromedriver.exe file location
		System.setProperty("webdriver.chrome.driver", "D:/Gopi/Selenium/Webdrivers/chromedriver.exe");
		
		// Initialize web driver
		WebDriver driver=new ChromeDriver();
				 
		// Open a portal
		driver.get("https://www.spicejet.com");

		//Maximize browser
		driver.manage().window().maximize();
	}
}
