package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DragDropEx3 {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("http://jqueryui.com/droppable/");
		//Wait for the frame to be available and switch to it
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		WebElement Sourcelocator = driver.findElement(By.cssSelector(".ui-draggable"));
		WebElement Destinationlocator = driver.findElement(By.cssSelector(".ui-droppable"));
		
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(Sourcelocator,Destinationlocator);
		String actualText=driver.findElement(By.cssSelector("#droppable>p")).getText();
		//Assert.assertEquals(actualText, "Dropped!");
	}

}
