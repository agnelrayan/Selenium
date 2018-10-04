package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverEx {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","/home/agnel/Downloads/geckodriver");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	
	 driver.get("http://store.demoqa.com/");
	 
     WebElement element = driver.findElement(By.linkText("Product Category"));

     Actions action = new Actions(driver);
     
     action.moveToElement(element).moveToElement(driver.findElement(By.linkText("iPads"))).click().build().perform();
     //action.moveToElement(element).moveToElement(driver.findElement(By.linkText("iPads"))).click().build().perform();
     //action.doubleClick(element).perform();

    // action.moveToElement(element).build().perform();

    // driver.findElement(By.linkText("iPads")).click();
	}
	

}
