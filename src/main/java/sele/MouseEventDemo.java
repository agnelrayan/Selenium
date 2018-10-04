package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseEventDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		//driver.manage().window().maximize();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		driver.get(baseUrl);
		
		WebElement link_home=driver.findElement(By.linkText("Home"));
		//link_home.click();
		
		WebElement td_Home = driver
                .findElement(By.xpath("//html/body/div"+ "/table/tbody/tr/td"+ "/table/tbody/tr/td"
                + "/table/tbody/tr/td" + "/table/tbody/tr"));    
         
        Actions builder = new Actions(driver);
        Action mouseOverHome = builder.moveToElement(link_home).build();
		

	}

}
