package firsttestngpackage;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class Grid_2 {
	WebDriver driver;
	String baseUrl, nodeURL;
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		baseUrl = "http://newtours.demoaut.com/";
		nodeURL = "http://";
		DesiredCapabilities capability = DesiredCapabilities.edge();
		capability.setBrowserName("edge");
		capability.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL(nodeURL), capability);
		
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
  @Test
  public void simpleTest() {
	  driver.get(baseUrl);
	  Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
  }
}
