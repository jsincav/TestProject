package firsttestngpackage;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.*;


public class FirstTestNGFile {
	public String baseUrl = "https://therapy.staging.aphasia.com/?auth_token&uuid=0bb42948-41d0-46e8-8691-4f835c071bdd";
	
  @Test(priority = 0)
  public void addToPlan() {
	
	  ConsumerSLPLoginTest SLPLogin = new ConsumerSLPLoginTest();
	  SLPLogin.ConsumerSLPLogin();
	  WebDriver driver = SLPLogin.chromeDriverPass();
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(
			  ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/slps/plan/810']")));
	  driver.findElement(By.xpath("//a[@href='/slps/plan/810']")).click();
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/ul/li[1]/span")).click();;
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/ul/li[2]/span")).click();
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/ul/li[3]/a")).click();
	  if(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/ul/li[4]/span/img")).isDisplayed() == true){
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/ul/li[4]/span/img")).click();
	  }
	  changeSetting(driver);
  }
  
  @Test (priority = 1)
  public void changeSetting(WebDriver driver) {
	
	  driver.findElement(By.cssSelector("a[href='/users/settings'")).click();
	  
	  
  }
}
