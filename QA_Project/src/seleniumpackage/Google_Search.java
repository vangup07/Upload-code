package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
				// 2. Initialize Webdriver object through ChromeDriver class. 
			        WebDriver browserObject = new ChromeDriver();
				// 3. Open the http://www.amazon.com/ link using get method.
			        browserObject.get("https://www.google.com/");
			        browserObject.findElement(By.name("q")).sendKeys("selenium python");
			        
			        browserObject.findElement(By.name("btnK")).click();
	}

}
