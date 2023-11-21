package seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		 ChromeDriver	driver = new ChromeDriver();
	    	 driver.get("https://admin-demo.nopcommerce.com/login");
	    		
	    	 WebElement email =driver.findElement(By.name("Email"));
	    	 email.clear();
	    	 email.sendKeys("admin@yourstore.com");
	    	
	    	 WebElement pass=driver.findElement(By.name("Password"));
	    	 pass.clear();
	    	pass.sendKeys("admin");
	    	
	    	driver.findElement(By.className("login-button")).click();

	}

}
