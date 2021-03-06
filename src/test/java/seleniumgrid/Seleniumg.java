package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Seleniumg {
	 WebDriver driver;
     String baseURL, nodeURL;

     @BeforeTest
     public void setUp() throws MalformedURLException {
    	 System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
         baseURL = "http://demo.guru99.com/test/guru99home/";
         nodeURL = "http://192.168.1.27:4444/wd/hub";
         DesiredCapabilities capability = DesiredCapabilities.firefox();
         capability.setBrowserName("firefox");
         capability.setPlatform(Platform.LINUX);
         driver = new RemoteWebDriver(new URL(nodeURL), capability);
     }

     @AfterTest
     public void afterTest() {
         driver.quit();
     }
     public void sampleTest() {
         driver.get(baseURL);
         driver.get(baseURL);

         if (driver.getPageSource().contains("MOBILE TESTING")) {
             Assert.assertTrue(true, "Mobile Testing Link Found");
         } else {
             Assert.assertTrue(false, "Failed: Link not found");
         }

     }

}
