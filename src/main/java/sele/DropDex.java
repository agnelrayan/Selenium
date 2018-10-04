package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDex {

	public static void main(String[] args) {
		  System.setProperty("webdriver.gecko.driver","/home/agnel/Downloads/geckodriver");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			// Open webpage
			driver.get("http://www.calculator.net/interest-calculator.html");
			
			driver.manage().window().maximize();
			
			Select dd = new Select(driver.findElement(By.id("ccompound")));
			dd.selectByVisibleText("annually");
			System.out.println(driver.findElement(By.id("ccompound")).isSelected());
			
			 
	}

}
