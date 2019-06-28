package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJetFlightSearch {
 
	public static void main(String[] args) throws InterruptedException {
	 
		// Set the system property to get xxxdriver.exe file location
		System.setProperty("webdriver.chrome.driver", "D:/Gopi/Selenium/Webdrivers/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "D:/Gopi/Selenium/Webdrivers/geckodriver.exe");
		// System.setProperty("webdriver.ie.driver", "D:/Gopi/Selenium/Webdrivers/IEDriverServer.exe");
		
		// Initialize web driver
		WebDriver driver=new ChromeDriver();
		// WebDriver driver=new FirefoxDriver();
		// WebDriver driver=new InternetExplorerDriver();
		 
		// Open a portal
		driver.get("https://www.spicejet.com");
		
		// Maximize browser
		driver.manage().window().maximize();
		
		// Select trip type
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		
		// Select Origin station
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		
		// Select destination station
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		
		// select current depart date 
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(2000L);
		
		// select passengers field
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000L);
		
		// Add number of passengers
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		
		// Click on Done button
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		// Select Currency
		Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByVisibleText("USD");
		Thread.sleep(2000L);
		
		// select family and friends check box
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		// Click on Search button
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(5000L);
		
		// Close the current window
		driver.close();
	}
}