package selegridex;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridExample {
	
	@Test
	@Parameters({"browserType"})
    public void mailTest(String browserType) throws MalformedURLException{
		
		 System.setProperty("webdriver.gecko.driver","/home/agnel/Downloads/geckodriver");
			
		//	WebDriver driver = new FirefoxDriver();
			
		//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//String browserType=null;
             DesiredCapabilities dr=null;
             if(browserType.equals("firefox")){
             dr=DesiredCapabilities.firefox();
             dr.setBrowserName("firefox");
             dr.setPlatform(Platform.WINDOWS);
             }else{
                      dr=DesiredCapabilities.internetExplorer();
                      dr.setBrowserName("iexplore");
                      dr.setPlatform(Platform.WINDOWS);
             }
             RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dr);
             driver.navigate().to("http://gmail.com");
             driver.findElement(By.xpath("//input[@id='Email']")) .sendKeys("username");
             driver.findElement(By.xpath("//input[@id='Passwd']")) .sendKeys("password");
             driver.close();

}
}