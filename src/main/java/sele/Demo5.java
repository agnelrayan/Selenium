package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.navigate().to("http://www.calculator.net/");
		
		driver.manage().window().maximize();
		

		//driver.findElement(By.linkText("Math Calculators")).click();
		driver.findElement(By.partialLinkText("Math")).click();
		//driver.findElement(By.xpath(".//*[@id='homelistdiv']/table/tbody/tr/td[3]/div[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='content']/ul[1]/li[3]/a")).click();
		
		driver.findElement(By.id("cpar1")).sendKeys("10");
		driver.findElement(By.id("cpar2")).sendKeys("20");
		
		driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]")).click();
		
		//driver.findElement(By.tagName("input")).click();
		
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/input")).click();
		String result = driver.findElement(By.xpath(".//*[@id='cpar3']")).getAttribute("value");
		System.out.println("Result"+result);
		
		
	}

}
