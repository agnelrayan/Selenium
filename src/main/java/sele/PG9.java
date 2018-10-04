package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG9 {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			 String baseUrl = "http://demo.guru99.com/test/upload/";
		        

		        driver.get(baseUrl);
		        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

		        // enter the file path onto the file-selection input field
		        uploadElement.sendKeys("/home/agnel/jesus");

		        // check the "I accept the terms of service" check box
		        driver.findElement(By.id("terms")).click();

		        // click the "UploadFile" button
		        driver.findElement(By.name("send")).click();
	}

}
