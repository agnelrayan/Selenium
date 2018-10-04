package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DDropEx4 {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			// Open webpage
			driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
			 
			// Add 5 seconds wait
			Thread.sleep(3000);
			 
			// Create object of actions class
			Actions act=new Actions(driver);
			 
			// find element which we need to drag
			WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
			 
			// find element which we need to drop
			WebElement drop=driver.findElement(By.xpath(".//*[@id='droppable']"));
			 
			// this will drag element to destination
			act.dragAndDrop(drag, drop).build().perform();
			//act.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
			
	}

}
