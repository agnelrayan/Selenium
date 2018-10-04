package sele;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandleDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		
		
		String MainWindow = driver.getWindowHandle();
		
		//System.out.println("Get Window Handles:"+MainWindow);
		
		Set<String> set = driver.getWindowHandles();
		//System.out.println(set);
		
		
		
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			String ChildWindow = itr.next();
			
			System.out.println("Print Child Windows"+ChildWindow);
			Thread.sleep(3000);
			
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.name("emailid")).sendKeys("agnelrayan@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				driver.close();
			}
			
			
		}
		
		
		driver.switchTo().window(MainWindow);
		driver.close();

	}

}
