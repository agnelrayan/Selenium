package testng_ex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class CrossWebBrowser {
	WebDriver driver;
	

	@Test
	@Parameters({"browser"})
	public void verifypageTitle(String browser) {
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else
			driver = new SafariDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.getTitle();
		driver.close();
				
	}

}
