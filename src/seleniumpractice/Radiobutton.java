package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radiobutton {

public static void main(String[] args) throws InterruptedException{
		
		// Set the system property to get chromedriver.exe file location
		System.setProperty("webdriver.chrome.driver", "D:/Gopi/Selenium/Webdrivers/chromedriver.exe");
		
		// Initialize web driver
		WebDriver driver=new ChromeDriver();
				 
		// Open a portal
		driver.get("https://www.spicejet.com");

		// Maximize browser
		driver.manage().window().maximize();
		
		// Approach 1
		// driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		// Approach 2
		int count = driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size();
		System.out.println(count);
		for(int i =0; i<count; i++) {
			String value = driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).getAttribute("value");
			System.out.println(value);
			if(value.equals("RoundTrip")) {
				driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();
			}
		}
		
		Thread.sleep(10000L);
		driver.close();
		
	}

}
