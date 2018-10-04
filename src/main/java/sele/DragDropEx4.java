package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDropEx4 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver", "/home/agnel/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 driver.get("http://www.keenthemes.com/preview/metronic/templates/admin/ui_tree.html");
		 
	     driver.manage().window().maximize();
		 
		 js.executeScript("window.scrollBy(0,500)");
		 
		 Thread.sleep(3000);
		 
	
		 
		 WebElement from=driver.findElement(By.xpath("//*[@id=\"j3_7_anchor\"]"));
		 WebElement to=driver.findElement(By.xpath("//*[@id=\"j3_2_anchor\"]"));
		 
		 Actions builder = new Actions(driver);
		  //Action ddrop=builder.clickAndHold(from).moveToElement(to).release(to).build();
		    // ddrop.perform();
		     
		     //builder.dragAndDrop(from, to).build().perform();
		     
		   //  builder.dragAndDrop(from, to).build().perform();
			 builder.clickAndHold(from).moveToElement(to).release(to).build().perform();

	}

}
