package assignmentestngpactage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dashboard {
	
		 WebDriver driver;
		    @Test
		    public void VerifySearch() {
		//2. setup the property of chromedriver to perform mutiple test case through chrome web browser.
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.itlearn360.com/");
		driver.findElement(By.id("loginlabel")).click();  	
		driver.findElement(By.id("user_login")).sendKeys("Demo12");
	 	driver.findElement(By.id("user_pass")).sendKeys("Test123456$");
		driver.findElement(By.name("wp-submit")).click();
		driver.findElement(By.name("search_course")).sendKeys("Manual");
		driver.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button")).click();  
		driver.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a")).click();
		    System.out.println("open/http://demo.itlearn360.com/user-profile/Demo12/dashboard/");
		    }
	}

