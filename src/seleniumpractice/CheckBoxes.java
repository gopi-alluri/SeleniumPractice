package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxes {

public static void main(String[] args) throws InterruptedException{
		
		// Set the system property to get chromedriver.exe file location
		System.setProperty("webdriver.chrome.driver", "D:/Gopi/Selenium/Webdrivers/chromedriver.exe");
		
		// Initialize web driver
		WebDriver driver=new ChromeDriver();
				 
		// Open a portal
		driver.get("https://www.spicejet.com");

		// Maximize browser
		driver.manage().window().maximize();
		
		boolean isSelected = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		System.out.println(isSelected);
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		isSelected = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		System.out.print(isSelected);		
		
		Thread.sleep(10000L);
		driver.close();
		
	}

}
