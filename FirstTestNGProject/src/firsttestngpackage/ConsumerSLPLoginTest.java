package firsttestngpackage;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class ConsumerSLPLoginTest {
	public String baseUrl = "http://therapy.staging.aphasia.com";
	public static WebDriver driver = Browser.getChromeDriver();
	
  @Test
  public void ConsumerSLPLogin() {
	  driver.get(baseUrl);
	  driver.findElement(By.cssSelector("img[alt=\"Sign_in_button\"]")).click();
	  driver.findElement(By.id("user_login")).sendKeys("slp@example.com");
	  driver.findElement(By.id("user_password")).sendKeys("letmein");
	  driver.findElement(By.name("commit")).click();
  }
  
  public WebDriver chromeDriverPass(){
	  
	  return driver;
  }
}
