package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameDemo {

	public static void main(String[] args) {
		
         System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		  WebDriver driver = new FirefoxDriver();
		  
		  
		 
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		    String url = "http://www.londonfreelance.org/courses/frames/index.html";
	    
	        //Navigate to URL
	        driver.manage().window().maximize();
	        driver.navigate().to(url);
	 
	        //Switch to main frame with its index (top.html)
	        //top.html is in 3rd frame so its index is 2
	        driver.switchTo().frame(2);
	 
	        //Check the H2 tag's text is "Title bar (top.html)
	        WebElement h2Tag = driver.findElement(By.cssSelector("html>body>h2"));
	        //assertThat("Title bar (top.html)", is(h2Tag.getText()));
	    
	 
	        driver.quit();
	}

}
