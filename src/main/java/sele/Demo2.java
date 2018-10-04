package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
	
/*	Marionette is the new driver that is shipped/included with Firefox. This driver has it's own protocol which is not directly compatible with the Selenium/WebDriver protocol.*/

	/*The Gecko driver (previously named wires) is an application server implementing the Selenium/WebDriver protocol. It translates the Selenium commands and forwards them to the Marionette driver.*/

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/");
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath(".//*/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("9159767562");
		//driver.findElement(By.xpath(".//*/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("9159767562");
		
		driver.findElement(By.xpath(".//*/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("9159767562");
		//driver.findElement(By.name("userName")).sendKeys("9159767562");
		driver.findElement(By.name("password")).sendKeys("9159767562");
		
		driver.findElement(By.name("submit")).click();
		
		String str=driver.getTitle();
		System.out.println("Title is"+str);
		
		String url=driver.getCurrentUrl();
		System.out.println("Current Url is:"+url);
		
		Class strClass=driver.getClass();
		System.out.println("GetClass()"+strClass.toString());
		
		
		
		driver.quit();
	

	}

}
