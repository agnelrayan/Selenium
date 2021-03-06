package seleniumgrid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.*;

public class GridEx2 {

	WebDriver driver;
	String baseUrl, nodeUrl;
	
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		baseUrl = "http://newtours.demoaut.com/";
		nodeUrl = "http://192.168.0.24:5566/wd/hub";
		
		DesiredCapabilities c = DesiredCapabilities.firefox();
		c.setBrowserName("firefox");
		c.setPlatform(Platform.LINUX);
		driver = new RemoteWebDriver(new URL(nodeUrl), c);
		
		
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
