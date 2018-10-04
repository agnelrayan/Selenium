package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Form {

	public static void main(String[] args) {
     
		System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		String baseUrl="http://demo.guru99.com/test/login.html";
		driver.get(baseUrl);
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("9159767562");
		WebElement password=driver.findElement(By.name("passwd"));
		password.sendKeys("9159767562");
		
		System.out.println("Text Field Set..");
		email.clear();
		password.clear();
		System.out.println("Text Field Cleared");
		
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		email.sendKeys("9159767562");
		password.sendKeys("9159767562");
		login.click();
		System.out.println("Login Done with Click");
		
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement r1 = driver.findElement(By.id("vfb-7-1"));
		WebElement r2 = driver.findElement(By.id("vfb-7-2"));
		WebElement r3 = driver.findElement(By.id("vfb-7-3"));
		
		r1.click();
		System.out.println("Radio Button 1 is Selected");
		
		r2.click();
		System.out.println("Radio Button 2 is Selected");
		
		WebElement chk1 = driver.findElement(By.id("vfb-6-0"));
		//chk1.click();
		
		WebElement chk2 = driver.findElement(By.id("vfb-6-1"));
		chk2.click();
		
		if(chk1.isSelected()) {
			System.out.println("CheckBox 1 is Toggled on");
		}
		else
			System.out.println("CheckBox 1 is Toggled off");
		
		driver.get("http://demo.guru99.com/test/facebook.html");
		
		WebElement chkP = driver.findElement(By.id("persist_box"));
		
		chkP.click();
		//System.out.println("Facebook Persists Checkbox status is"+chkP.isSelected());
		
		for(int i=0;i<2;i++) {
			chkP.click();
			System.out.println("Facebook Persists Checkbox status is:"+chkP.isSelected());
		}
		
		driver.close();
		
		
		
		
		
	}

}
