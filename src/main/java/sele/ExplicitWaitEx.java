package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/home/agnel/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		String eTitle = "Demo Guru99 Page";
		String aTitle="";
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		aTitle = driver.getTitle();
		
		if(eTitle.contentEquals(aTitle)) {
			System.out.println("Test is Passed");
		}
		
		else
			System.out.println("Test is Failed");
		
		//WebElement wel= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
		//WebElement wel=wait.until(ExpectedConditions.visibilityOfElementsLocated(By.xpath("//*[@id='navbar-brand-centered']/ul/li[1]/a"))).click();
		
		//WebElement wel= wait.until(ExpectedConditions.elementToBeClickable((By.xpath( ".//*[@id='navbar-brand-centered']/ul/li[1]/a"));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='navbar-brand-centered']/ul/li[1]/a")));
		element.click();
		
		driver.close();
		//wel.click();
		//wel.click();
		

	}

}
