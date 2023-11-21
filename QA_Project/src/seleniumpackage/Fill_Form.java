package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fill_Form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class. 
	        WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
	        
	        browserObject.findElement(By.name("name")).sendKeys("Vadna Gupta");
	        browserObject.findElement(By.name("email")).sendKeys("gupta.vanu@gmail.com");
	        browserObject.findElement(By.name("website")).sendKeys("http://training.qaonlinetraining.com/testPage.php");
	        browserObject.findElement(By.name("comment")).sendKeys("Happy Friday");
	        
	        
	        // Radio Button
	        browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
	        Thread.sleep(4000);
	        browserObject.findElement(By.xpath("//input[@value='male']")).click();
	        
	        browserObject.findElement(By.name("bike")).click();
	        
	        Select country= new Select(browserObject.findElement(By.name("country")));
	        country.selectByVisibleText("Ethiopia");
	        Thread.sleep(5000);
	        
	        Select skil= new Select(browserObject.findElement(By.name("skill")));
	        skil.selectByVisibleText("Database");
	        skil.selectByVisibleText("Programming");
	        
	        
	        browserObject.findElement(By.name("submit")).click();
	        
	}

}
