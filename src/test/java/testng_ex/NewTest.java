package testng_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
@Test
public class NewTest {
  String url ="http://demo.guru99.com/test/newtours/";
  String path = "/home/agnel/Downloads/geckodriver.exe";
  WebDriver driver;
  String expected=null;
  String actual=null;
  
  @BeforeTest
  void startBrowser() {
	  System.out.println("Launching the browser....");
	  System.setProperty("webdriver.firefox.marionette", path);
	  driver= new FirefoxDriver();
	  driver.get(url);
	  
  }
  
  @BeforeMethod
  void verifyHome() {
	  
	  String expect="Welcome: Mercury Tours";
	  String act = driver.getTitle();
	  Assert.assertEquals(act, expected);
	  
  }
  
  @Test
  void register() {
	  
	  driver.findElement(By.linkText("REGISTER")).click();
	  expected ="Register: Mercury Tours";
	  actual = driver.getTitle();
	  Assert.assertEquals(actual,expected);
	  
  }
  
  @AfterMethod
  void goBack() {
	  driver.findElement(By.linkText("Home")).click();
  }
  
  @AfterTest
  void terminate() {
	  driver.close();
	  
  }
  

}
