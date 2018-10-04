package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement el = driver.findElement(By.name("country"));
		
		Select country = new Select(el);
		
		//country.selectByValue("INDIA");
		
		country.selectByVisibleText("INDIA");
		
		//driver.close();
		
		driver.get("http://jsbin.com/osebed/2");
		
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		
			//fruits.selectByIndex(2);
			//fruits.selectByValue("Apple");
			fruits.selectByVisibleText("Banana");
			//fruits.deselectAll();
			
			
		
		
		

	}

}
