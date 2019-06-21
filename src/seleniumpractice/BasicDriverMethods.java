package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		 
		// Set the system property to get driver.exe file location
		System.setProperty("webdriver.chrome.driver", "D:/Gopi/Selenium/Webdrivers/chromedriver.exe");
				 
		// Initialize web driver
		WebDriver driver=new ChromeDriver();
				 
		// Open a portal
		driver.get("https://www.spicejet.com");
		
		// Maximize browser
		driver.manage().window().maximize();
		
		// Get title of the web page
		System.out.println(driver.getTitle());
		
		// Get	URL of the current tab	
		System.out.println(driver.getCurrentUrl());
		
		// Launch another web page
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000L); // Wait for 2 seconds
		driver.navigate().back(); // Navigate to previous URL/web page
		
		Thread.sleep(3000L);
		driver.navigate().forward(); // Navigate to forward URL/web page
		
		Thread.sleep(3000L);
		driver.navigate().refresh(); // Reload/refresh the current web page
		
		// driver.switchTo().window(arg0);
		
		// Get source code of the web page
		System.out.println(driver.getPageSource());
		
		driver.close(); // Close the current window
		
		Thread.sleep(3000L);
		//driver.quit(); // Close the browser
		
		}
}
