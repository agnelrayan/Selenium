
package sele.seledemos;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverEx {

	public static void main(String[] args) throws InterruptedException {


	       System.setProperty("webdriver.firefox.marionette","/home/agnel/Downloads/geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.calculator.net/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath(".//*[@id='homelistdiv']/table/tbody/tr/td[3]/div[2]/a")).click();
			driver.findElement(By.linkText("Percentage Calculator")).click();
			
			driver.findElement(By.id("cpar1")).sendKeys("10");
			driver.findElement(By.id("cpar2")).sendKeys("50");
			driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]")).click();
			
			//For Result
			
			/*String result = driver.findElement(By.xpath(".//*[@id='cpar3']")).getText();
			
			System.out.println("Result is:"+result);*/
			
			
			// Get the Result Text based on its xpath
		      String result =
		         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();

		      
		      // Print a Log In message to the screen
		      System.out.println(" The Result is " + result);

	}

}
