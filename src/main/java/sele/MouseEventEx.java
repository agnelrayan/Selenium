package sele;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventEx {

	public static void main(String[] args) {
		
       System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
       
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("http://www.learncertification.com/study-material/handle-keyboard-mouse-events-in-selenium-webdriver");
		       		
		WebElement el = driver.findElement(By.linkText("Sending Inputs in Selenium Webdriver"));
		
		Actions builder = new Actions(driver);
		
		org.openqa.selenium.interactions.Action mouseover = builder.moveToElement(el).build();
		builder.perform();
		
	}

}
