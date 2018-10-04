package sele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllLinks {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.gecko.driver","/home/agnel/Downloads/geckodriver");
		
	 WebDriver driver = new FirefoxDriver();
		
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	 
	 driver.navigate().to("http://www.calculator.net");
	 
	 List<WebElement> links = driver.findElements(By.tagName("a"));
	 
	 System.out.println("No. Of Links:"+ links.size());
	 
	

	}

}
