package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExpertZlab {

	public static void main(String[] args) {
      System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("http://www.expertzlab.com");
		
		String baseUrl="http://demo.guru99.com/test/newtours/";
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle="";
		
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		System.out.println("Actual Title:"+actualTitle);
		
		String tagName="";
		tagName=driver.findElement(By.name("userName")).getTagName();
		
		/*String strText=driver.findElement(By.cssSelector("font:contains('Password')")).getText();
		System.out.println("GetText"+strText);
		
		System.out.println("TagName"+tagName);*/
		
	/*	if(actualTitle.contentEquals(expectedTitle))
			System.out.println("Test Passed");
		
		else
			System.out.println("Test Failed");*/
		
		driver.quit();
		
		

	}

}
