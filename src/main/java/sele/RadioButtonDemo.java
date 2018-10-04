package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonDemo {

	public static void main(String[] args) {
		  System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			
			driver.navigate().to("http://www.calculator.net/mortgage-payoff-calculator.html");
			
			driver.manage().window().maximize();
			
			//click on Radio Button
			
			System.out.println("The output of IsSelected"+driver.findElement(By.id("cpayoff1")).isSelected());
			System.out.println("The output of IsEnabled"+driver.findElement(By.id("cpayoff1")).isEnabled());
			System.out.println("The output of IsDisplayed"+driver.findElement(By.id("cpayoff1")).isDisplayed());

	}

}
