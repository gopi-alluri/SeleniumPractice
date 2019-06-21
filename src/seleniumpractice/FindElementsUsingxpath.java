package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUsingxpath {

	public static void main(String[] args) throws InterruptedException {
		 
		// Set the system property to get xxxdriver.exe file location
		System.setProperty("webdriver.chrome.driver", "D:/Gopi/Selenium/Webdrivers/chromedriver.exe");
				 
		// Initialize web driver
		WebDriver driver=new ChromeDriver();
				 
		// Open a portal
		driver.get("https://www.spicejet.com");
		
		// Maximize browser
		driver.manage().window().maximize();
		
		// Different ways to find an element using xpath
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click(); // Using "//tagName[@Attribute='value']"
		//driver.findElement(By.xpath("//*[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).click();	// Using "[Attribute='value']"
		
		// Find an element using regular expression in xpath
		driver.findElement(By.xpath("//input[contains(@name,'ctl00_mainContent_ddl_originStation1')]")).click();
		
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
				
		Thread.sleep(2000L);
		driver.close();
		}
}
