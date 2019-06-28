package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

public static void main(String[] args) throws InterruptedException{
		
		// Set the system property to get chromedriver.exe file location
		System.setProperty("webdriver.chrome.driver", "D:/Gopi/Selenium/Webdrivers/chromedriver.exe");
		
		// Initialize web driver
		WebDriver driver=new ChromeDriver();
				 
		// Open a portal
		driver.get("https://www.spicejet.com");

		//Maximize browser
		driver.manage().window().maximize();
		
		// Handle drop down field
		Select s = new Select( driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		Thread.sleep(2000L);
		//s.selectByVisibleText("USD");
		//s.selectByValue("USD");
		s.selectByIndex(3);
		
		Thread.sleep(5000L);
		driver.close();
		
		
	}

}
