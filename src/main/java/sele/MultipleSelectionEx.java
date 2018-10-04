package sele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionEx {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver","/home/agnel/Downloads/geckodriver");
			
			WebDriver driver = new FirefoxDriver();
			
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
             
             driver.get("http://toolsqa.wpengine.com/automation-practice-form");
             
             Select oSelect = new Select(driver.findElement(By.id("continents")));
             oSelect.selectByVisibleText("Europe");
             
             Thread.sleep(2000);
             
             oSelect.selectByIndex(2);
             
             Thread.sleep(2000);
             
             List<WebElement> el=oSelect.getOptions();
             
             int size=el.size();
             
             System.out.println("Size is:"+size);
             
	}
}
             
           /*  for(int i=0;i<size;i++) {
            	 
            	 String country=oSelect.getOptions().get(i).getText();
            	 System.out.println(country);
            	 
            	 if(country.equals("africa")) {
            		 oSelect.selectByIndex(i);
            		// System.out.println(country);
            		 break;
            		 
            		 
            	 }
             }
             
             

	}

}*/
