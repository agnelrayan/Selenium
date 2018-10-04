package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {

	public static void main(String[] args) {
     
		System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("http://jsbin.com/usidix/1");
		
		String alertMsg="";
		
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		
		driver.switchTo().alert().accept();
		
		System.out.println(alertMsg);

	}

}
