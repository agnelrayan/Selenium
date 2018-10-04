package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateDemo {

	public static void main(String[] args) throws InterruptedException {
				
        System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String webpage = "http://www.google.com";
		
		driver.navigate().to("http://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().to(webpage);
		
		driver.findElement(By.linkText("Sign in")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.close();
		

	}

}
