package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Search {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/home/agnel/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		WebElement element=driver.findElement(By.name("q"));
		element.sendKeys("Expertzlab");
		element.submit();
	    String title=driver.getTitle();
	    System.out.println("Title of :"+title);
		driver.close();

	}

}
