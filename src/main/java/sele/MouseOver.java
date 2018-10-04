package sele;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
	       
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 



		 driver.manage().window().maximize();

		 driver.get("http://www.learncertification.com/");

		 WebElement parent=driver.findElement(By.linkText("Agile Certification"));

		 Actions builder = new Actions(driver);

		 Action mouseOver = builder.moveToElement(parent).build();

		mouseOver.perform();
		 
		 String bColor = parent.getCssValue("background-color");
	        System.out.println("Before Mouse hover: " + bColor );        
	        //mouseOver.perform();        
	        bColor = parent.getCssValue("background-color");
	        System.out.println("After Mouse hover: " + bColor );
	        //driver.quit();

	}

}
