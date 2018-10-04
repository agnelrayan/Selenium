package sele;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDropEx2 {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		   driver.get("http://demo.guru99.com/test/drag_drop.html");					
	         
			//Element which needs to drag.    		
	        	WebElement From=driver.findElement(By.xpath(".//*[@id='fourth']/a"));	
	         
	         //Element on which need to drop.		
	         WebElement To=driver.findElement(By.xpath(".//*[@id='loan']/li"));					
	         		
	         //Using Action class for drag and drop.		
	         Actions act=new Actions(driver);					

		//Dragged and dropped.		
	         act.dragAndDrop(From, To).build().perform();	
	}

}
