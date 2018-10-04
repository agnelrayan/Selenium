package parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamDPNew {
	
	WebDriver driver;
	String driverPath = "/home/agnel/Downloads/geckodriver.exe";
	
	@BeforeTest
	public void setUp() {
		//Create firefox driver object
        System.setProperty("webdriver.firefox.marionette", driverPath);
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
		
	}
	
	@Test(dataProvider="SearchProvider")
	public void testMethod(String author, String key) throws InterruptedException {
		
		WebElement searchText = driver.findElement(By.name("q"));
		searchText.sendKeys(key);
		System.out.println("Welcome: "+author+"Key:"+key);
		
		Thread.sleep(3000);
        String testValue = searchText.getAttribute("value");
        System.out.println(testValue +"::::"+key);
        searchText.clear();
		
	}
	
	@DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "Ag", "India" },
            { "JOe", "UK" },
            { "Khalid", "USA" }
        };

    }
	

}
