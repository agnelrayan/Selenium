package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		//driver.get("http://demo.guru99.com/selenium/deprecated.html");
	
		//driver.switchTo().frame("classFrame");

		//driver.switchTo().frame(0);
		
		//driver.findElement(By.linkText("Deprecated")).click();
		
		//driver.switchTo().frame(1);
		
		
		//driver.switchTo().frame("packageFrame");
		//driver.findElement(By.linkText("Deprecated")).click();
		//driver.findElement(By.linkText("Deprecated")).click();
		
		
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		 
		//Switch by Index
		driver.switchTo().defaultContent();
		driver.quit();
		
        driver.close(); 

	}

}
