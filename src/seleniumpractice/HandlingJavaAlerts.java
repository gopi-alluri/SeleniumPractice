package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingJavaAlerts {

public static void main(String[] args) throws InterruptedException{
		
		// Set the system property to get chromedriver.exe file location
		System.setProperty("webdriver.chrome.driver", "D:/Gopi/Selenium/Webdrivers/chromedriver.exe");
		
		// Initialize web driver
		WebDriver driver=new ChromeDriver();
				 
		// Open a portal
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

		// Maximize browser
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
			
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000L);
		driver.switchTo().alert().accept();
		
		// driver.switchTo().alert().sendKeys("xyz");
		// driver.switchTo().alert().dismiss();
		
		Thread.sleep(10000L);
		driver.close();
		
	}

}
