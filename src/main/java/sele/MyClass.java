package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class MyClass {
	
	static String url ="http://newtours.demoaut.com/";
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/home/agnel/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.get(url);
		verifyHome();
		driver.quit();

	}
	
	public static void verifyHome() {
		String eTitle = "Welcome: Mercury Tours";
		String aTitle = driver.getTitle();
		
		try {
		Assert.assertEquals(aTitle, eTitle);
		System.out.println("Test Passed");
		}
		catch(Throwable e) {
			System.out.println("Test Failed");
			
		}
	}

}
