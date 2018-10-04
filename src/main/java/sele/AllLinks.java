package sele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinks {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";	
		
		String under = "Under Construction: Mercury Tours";
		
		driver.get(baseUrl);
		
		List <WebElement> le = driver.findElements(By.tagName("a"));
		
		int i2=le.size();
		
		String[] link = new String[i2];
		
		int i=0;
		
		for(WebElement e:le) {
			
		}
		
	for(WebElement e:le) {
			link[i]=e.getText();
			
			System.out.println("Links in the website:"+link[i]);
			
			i++;
			//System.out.println("WebElements:"+e);
			
		}
		
		
		
		for(String t:link) {
			driver.findElement(By.linkText(t)).click();
			if(driver.getTitle().equals(under)) {
				//System.out.println("is under construction"+t);
			}
			
			else {
				//System.out.println("is working" +t);
			}
			driver.navigate().back();
			
			
		}
		driver.quit();
		
		
		
	}

}
