package parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParamDP {
	WebDriver driver;
    String driverPath = "/home/agnel/Downloads/geckodriver.exe";
    
    
    @BeforeTest
    public void setup(){
        //Create firefox driver object
         System.setProperty("webdriver.firefox.marionette", driverPath);
         driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("https://google.com");
    }
    
   @Test(dataProvider="getDataFromDataprovider",dataProviderClass=ParamDPMain.class)
    //@Test
    public void testMethod(String author,String searchKey) throws InterruptedException{
    
        WebElement searchText = driver.findElement(By.name("q"));
        //search value in google searchbox
        searchText.sendKeys(searchKey);
        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
        Thread.sleep(3000);
        String testValue = searchText.getAttribute("value");
        //System.out.println("TEst Value:"+testValue);
        System.out.println(testValue +"::::"+searchKey);
        searchText.clear();
        //Verify if the value in google search box is correct
        Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
    
    }
   
   @Test(dataProvider="getDataFromDataprovider2",dataProviderClass=ParamDPMain.class)
   //@Test
   public void testMethod2(String author,String searchKey) throws InterruptedException{
   
       WebElement searchText = driver.findElement(By.name("q"));
       //search value in google searchbox
       searchText.sendKeys(searchKey);
       System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
       Thread.sleep(3000);
       String testValue = searchText.getAttribute("value");
       //System.out.println("TEst Value:"+testValue);
       System.out.println(testValue +"::::"+searchKey);
       searchText.clear();
       //Verify if the value in google search box is correct
       Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
   
   }
   
   @AfterTest
   
   public void afterTest() {
   	driver.close();
   	
   }

}
