package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutosuggestiveDropdown {

public static void main(String[] args) throws InterruptedException{
		
		// Set the system property to get chromedriver.exe file location
		System.setProperty("webdriver.chrome.driver", "D:/Gopi/Selenium/Webdrivers/chromedriver.exe");
		
		// Initialize web driver
		WebDriver driver=new ChromeDriver();
				 
		// Open a portal
		driver.get("https://www.makemytrip.com/");

		//Maximize browser
		driver.manage().window().maximize();
		
		// Select Origin station
		driver.findElement(By.id("fromCity")).click();
		WebElement source =driver.findElement(By.cssSelector("input.react-autosuggest__input.react-autosuggest__input--open"));
		source.sendKeys("mumb");
		//Thread.sleep(2000L);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);	
		
		// Select destination station
		WebElement destination =driver.findElement(By.cssSelector("input.react-autosuggest__input.react-autosuggest__input--open"));
		destination.sendKeys("delhi");
		//Thread.sleep(2000L);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
		
		Thread.sleep(10000L);
		driver.close();
		
	}

}
