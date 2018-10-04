package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		// This step will result in an alert on screen
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
 
		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		simpleAlert.accept();
		System.out.println("Alert text is " + alertText);
		//Thread.sleep(3000);
		//simpleAlert.accept();

	}

}
