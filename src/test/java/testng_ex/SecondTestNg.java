package testng_ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class SecondTestNg {
	public static String url;
	public WebDriver driver;
	
	@BeforeTest
	public void setBaseUrl() {
		System.setProperty("webdriver.gecko.driver","/home/agnel/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
	}
	
	@Test
	public void verifyHome() {
		
		String exp = "Welcome: Mercury Tours";
		String act = driver.getTitle();
		Assert.assertEquals(act,exp);
		
	}
	
	@AfterTest
	
	public void endSession() {
		driver.quit();
	}

}
