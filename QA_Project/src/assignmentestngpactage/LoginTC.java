package assignmentestngpactage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTC {

    WebDriver driver;
    @SuppressWarnings("deprecation")
	@Test
    public void VerifyLoginURL() {
    	//2. setup the property of chromedriver to perform mutiple test case through chrome web browser.
    	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
    	driver = new ChromeDriver();
    	driver.get("http://demo.itlearn360.com/");
    	driver.navigate().refresh();
    	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
    	driver.findElement(By.id("loginlabel")).click();  	
    	driver.findElement(By.name("log")).sendKeys("Demo12");
      	driver.findElement(By.name("pwd")).sendKeys("Test123456$");
    	driver.findElement(By.name("wp-submit")).click();
    	    
    }
}
