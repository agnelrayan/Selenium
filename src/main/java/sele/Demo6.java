package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo6 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("http://demo.guru99.com/test/facebook.html");
		
		driver.findElement(By.className("input.inputtext")).sendKeys("9159767562");

	}

}
