package firsttestngpackage;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser {

	public static WebDriver getChromeDriver()
	{
		//test
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("google.com");
	    return driver;
	}
	
}
