package annotationex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowser {
	
	public WebDriver driver;
	
	
	@Test
	@Parameters({"browser"})
	public void beforeTest(String browser) {
		
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver","/home/agnel/Downloads/geckodriver");
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","/home/agnel/chrome/chromedriver");
			driver = new ChromeDriver();
		}
		
		else
		{
			driver= new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("Title is:"+title);
		driver.close();
		
		
	}
	
	

}
