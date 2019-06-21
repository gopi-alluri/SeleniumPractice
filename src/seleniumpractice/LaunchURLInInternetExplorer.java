package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchURLInInternetExplorer {

public static void main(String[] args) {
		
		// Set the system property to get chromedriver.exe file location
		System.setProperty("webdriver.ie.driver", "D:/Gopi/Selenium/Webdrivers/IEDriverServer.exe");
		
		// Initialize web driver
		WebDriver driver=new InternetExplorerDriver();
				 
		// Open a portal
		driver.get("https://www.spicejet.com");

		//Maximize browser
		driver.manage().window().maximize();
	}
}
