package testng_ex;


	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.*;
	//@Test
	public class Firsttestngfile {
	    public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "/home/agnel/Downloads/geckodriver.exe";
	    public WebDriver driver;
	    public String expected = null;
	    public String actual = null;
	   // System.setProperty("webdriver.firefox.marionette", driverPath);
     
	    
	        @BeforeTest
	      public void launchBrowser() {
	          System.out.println("launching firefox browser"); 
	          System.setProperty("webdriver.firefox.marionette", driverPath);
	          driver= new FirefoxDriver();
	          driver.get(baseUrl);
	      }
	      
	      @BeforeMethod
	      public void verifyHomepageTitle() {
	    	  System.out.println("Before Method.....");
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	      }
	          @Test(priority=-1)
	      public void register(){
	        	  System.out.println("Test1.....");
	          driver.findElement(By.linkText("REGISTER")).click() ;
	          expected = "Register: Mercury Tours";
	          actual = driver.getTitle();
	          Assert.assertEquals(actual, expected);
	          samtest();
	          
	      }
	          
	         
	          public void samtest() {
	        	  System.out.println("Sample..test");
	          }
	          @Test(priority = 1)
	      public void support() {
	        	  System.out.println("TEst2......");
	            driver.findElement(By.linkText("SUPPORT")).click() ;
	            expected = "Under Construction: Mercury Tours";
	            actual = driver.getTitle();
	            Assert.assertEquals(actual, expected);
	      }
	      @AfterMethod
	      public void goBackToHomepage ( ) {
	    	  System.out.println("After Method....");
	            driver.findElement(By.linkText("Home")).click() ;
	      }
	       
	      @AfterTest
	      public void terminateBrowser(){
	    	  System.out.println("aFter Test.....");
	          driver.close();
	      }
	}


