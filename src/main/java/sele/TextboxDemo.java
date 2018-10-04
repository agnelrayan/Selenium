package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextboxDemo {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.navigate().to("http://www.calculator.net/percent-calculator.html");
		
		driver.manage().window().maximize();
		
		WebElement el=driver.findElement(By.id("cpar1"));
		el.sendKeys("10");
		
		String result=driver.findElement(By.id("cpar1")).getAttribute("value");
		// Get the text box from the application
		//String result = driver.findElement(By.id("cpar1")).getAttribute("value");
		// Print a Log In message to the screen
		System.out.println(" The Result is " + result);
		// Close the Browser
		//driver.close();
		
		

	}

}
