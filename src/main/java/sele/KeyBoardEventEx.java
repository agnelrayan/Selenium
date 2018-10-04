package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEventEx {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("http://www.google.com/");
		
		WebElement text = driver.findElement(By.name("q"));
		
		 Actions make  = new Actions(driver);
		 
		 Action kbEvents = make.keyDown(text, Keys.SHIFT).sendKeys("Java Code Geeks")
				 
				 	        .keyUp(text, Keys.SHIFT).contextClick().build();
				 
				 	        kbEvents.perform();
				 	        
				 	        Thread.sleep(3000);
				 	        
				 	        driver.close();
		
				 	        
				 	        
		 
		 
	}

}
