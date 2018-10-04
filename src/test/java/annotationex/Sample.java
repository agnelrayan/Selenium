package annotationex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Sample {
	

	public static WebDriver driver;
	public static String url;
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/home/agnel/Downloads/geckodriver");
		driver= new FirefoxDriver();
		url= "http://newtours.demoaut.com/";
		driver.get(url);
		verifyHome();
		driver.close();
	}
	
	public static void verifyHome() {
		
		String expected = "Welcome: Mercury Tours";
		String actual = driver.getTitle();
		try {
		Assert.assertEquals(actual, expected);
		System.out.println("Test Passed..");
		}
		catch(Exception e) {
			System.out.println("TEst Failed..");
		}
	}

}
