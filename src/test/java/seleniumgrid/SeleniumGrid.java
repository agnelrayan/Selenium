package seleniumgrid;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumGrid {

    WebDriver driver;
    String baseURL, nodeURL;

    @BeforeTest
    public void setUp() throws MalformedURLException {
    	System.setProperty("webdriver.gecko.driver","/home/agnel/Downloads/geckodriver.exe");
    	
    	//File firefoxfile = new File(PropertyReader.getProperty("/home/agnel/Downloads/geckodriver"));
    	// System.setProperty("webdriver.gecko.driver", firefoxfile.getPath());
    	
        baseURL = "http://demo.guru99.com/test/guru99home/";
        nodeURL = "http://192.168.0.23:4444/wd/hub";
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        capability.setBrowserName("firefox");
        capability.setPlatform(Platform.LINUX);
        driver = new RemoteWebDriver(new URL(nodeURL), capability);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
    @Test
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