package maven.fisrtgit;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;;


public class AppTest 
    
{
	 WebDriver driver;
    @BeforeMethod
    public void setup()
    {
    	driver= new SafariDriver();
    	driver.get("https://google.com");
    	
    }
    
   @Test
    public void testApp()
    {
        String actual1 = driver.getTitle();
        AssertJUnit.assertEquals("Title doesnt match", "Google",actual1);
    }
   
   @AfterMethod
   public void tear()
   {
	   driver.quit();
   }
}
