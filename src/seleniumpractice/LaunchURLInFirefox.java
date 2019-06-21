package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchURLInFirefox {

public static void main(String[] args) {
		
		// Set the system property to get chromedriver.exe file location
		System.setProperty("webdriver.gecko.driver", "D:/Gopi/Selenium/Webdrivers/geckodriver.exe");
		
		// Initialize web driver
		WebDriver driver=new FirefoxDriver();
				 
		// Open a portal
		driver.get("https://www.spicejet.com");

		//Maximize browser
		driver.manage().window().maximize();
	}
}
