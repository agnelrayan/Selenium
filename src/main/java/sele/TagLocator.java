package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class TagLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.calculator.net");
		List <WebElement> el=driver.findElements(By.tagName("a"));
		
		//WebElement ele=driver.findElement(By.id("cpar1"));
		
		System.out.println("List:"+el);
				
		
		for(int i=0;i<el.size();i++) {
			
		System.out.println(el.get(i).getText());	
		}

	}

}
