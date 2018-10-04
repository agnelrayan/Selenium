package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/home/agnel/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"demo\"]")));
		
		boolean status=element.isDisplayed();
		
		if(status)
			System.out.println("WebDriver is visible");
		else
			System.out.println("WebDriver is not visible");

	}

}
