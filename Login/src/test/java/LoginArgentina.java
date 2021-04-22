import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;



public class LoginArgentina {

    private WebDriver driver;
    
    
    
    @Before
    public void setUp() throws Exception {

    	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ingri\\\\Desktop\\\\CHROME\\\\chromedriver.exe");
    	driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);

    }
    
    @After
    public void tearDown() throws Exception {

        driver.quit();
    }

	 

    @Test
    public void Ingreso1() throws InterruptedException {

  
    		  
      driver.findElement(By.name("user-name")).sendKeys("standard_user");
      Thread.sleep(2000);
      
      driver.findElement(By.name("password")).sendKeys("secret_sauce");
      Thread.sleep(2000);
      
      driver.findElement(By.id("login-button")).click();
      Thread.sleep(5000);
     
      
    }
      
      
      @Test
      public void Ingreso2() throws InterruptedException
      
      {
    	 
           
    	      driver.findElement(By.name("user-name")).sendKeys("standard_user");
    	      Thread.sleep(2000);
    	      
    	      driver.findElement(By.name("password")).sendKeys("ecr_sauce");
    	      Thread.sleep(2000);
    	      
    	      driver.findElement(By.id("login-button")).click();
    	      Thread.sleep(5000);
    	      
    	      assertTrue("Epic sadface: Username and password do not match any user in this service" , false);
      }
        	  
    }
          
      
  

    	
    
   



