package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		// Alert Message handling
		
        driver.get("http://demo.guru99.com/test/delete_customer.php");
                            		
     	driver.findElement(By.name("cusid")).sendKeys("53920");		
     	
        driver.findElement(By.name("submit")).submit();
        
        Alert alert = driver.switchTo().alert();
        
        String alertmsg=driver.switchTo().alert().getText();
        
        System.out.println(alertmsg);
        
        alert.accept();
        
        //Thread.sleep(3000);
        
        
        
        //alert.dismiss();
        
        driver.close();
        

	}

}
