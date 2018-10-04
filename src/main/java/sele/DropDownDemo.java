package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {
     
		System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		String baseUrl="http://demo.guru99.com/test/newtours/register.php";
		
		driver.get(baseUrl);
		
		Select dd = new Select(driver.findElement(By.name("country")));
		dd.selectByVisibleText("INDIA");
		
		driver.get("http://jsbin.com/osebed/2");
		
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Apple");
		fruits.selectByIndex(3);
		
		

	}

}
