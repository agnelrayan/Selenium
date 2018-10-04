package sele;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.gecko.driver","/home/agnel/Downloads/geckodriver");
	
	
	//System.setProperty("webdriver.gecko.driver", "/home/agnel/Downloads/geckodriver");
	 
	System.setProperty("webdriver.firefox.marionette", "/home/agnel/Downloads/geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
     
     
     String baseUrl = "http://demo.guru99.com/selenium/newtours/";
     String expectedTitle = "Welcome: Mercury Tours";
     String actualTitle = "";
     
     driver.get(baseUrl);
   
     actualTitle = driver.getTitle();
     System.out.println("Title is:"+actualTitle);
     
     /*if(actualTitle.contentEquals(expectedTitle)) {
   	  System.out.println("Test Passed");
     }
     else {
   	  System.out.println("Test Failed");
     }
     //driver.close();
	}*/
	}
}
