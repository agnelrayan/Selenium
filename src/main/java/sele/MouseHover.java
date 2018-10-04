package sele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		WebElement el = driver.findElement(By.xpath(".//*[@id='post-body-4229879368008023176']/div[1]/div[2]/button"));
		

		Actions act = new Actions(driver);
		act.moveToElement(el).perform();
		
		List<WebElement> links = driver.findElements(By.xpath(".//*[@id='post-body-4229879368008023176']/div[1]/div[2]/button"));
		
		int total_count=links.size();
		
		for(int i=0;i<total_count;i++) {
			WebElement e= links.get(i);
			String text = e.getAttribute("innerHTML");
			System.out.println("Link name is"+text);
			
			if(text.equalsIgnoreCase("Appium")){
				e.click();
				break;
			}
			
		}
	}

}
