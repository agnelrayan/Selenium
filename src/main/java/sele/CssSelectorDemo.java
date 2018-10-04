package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.cssSelector("input.inputtext[tabindex='1']")).sendKeys("9159767562");
		driver.findElement(By.cssSelector("input.inputtext[tabindex='2']")).sendKeys("9159767562");
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("9159767562");
		//driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("9159767562");
		driver.findElement(By.linkText("Log In")).click();

	}

}
