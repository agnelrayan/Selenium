package parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ParameterByDataprovider2 {
	
	WebDriver driver;
	String driverPath = "/home/agnel/Downloads/geckodriver";
	
	 //System.setProperty("webdriver.gecko.driver","/home/agnel/Downloads/geckodriver");
	
	@BeforeTest
	public void setup() {
	System.setProperty("webdriver.gecko.driver", driverPath);
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/");
		
	}
	
	@Test(dataProvider="searchProvider",dataProviderClass=DataproviderClass.class)
	public void testMethod(String username,String password) throws InterruptedException {
		
		WebElement userName=driver.findElement(By.name("userName"));
		userName.sendKeys(username);
		
		WebElement passWord=driver.findElement(By.name("password"));
		passWord.sendKeys(password);
		
		Thread.sleep(2000);
		
		//System.out.println("Welcome Author:"+"->"+author+" Your Search Key is"+"->"+searchKey);
		/*System.out.println("Your Search Key is"+"->"+searchKey);
		Thread.sleep(2000);
		
		String testValue = searchText.getAttribute("value");
		System.out.println(testValue+"::::"+searchKey);
		searchText.clear();
		
		Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
		*/
		userName.clear();
		passWord.clear();
		
	}
	/*@DataProvider(name="searchProvider")
    public Object[][] getData(){
	return new Object[][]{
		
		{"9159767562","91597677562"},
		{"9159767562","91597677562"},
		{"9159767562","91597677562"}
		
	
		
		
		
	}
	
}*/
}
