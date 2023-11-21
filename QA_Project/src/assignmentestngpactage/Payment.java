package assignmentestngpactage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Payment {
	WebDriver driver;
    @Test
    public void VerifyPayment() {
//2. setup the property of chromedriver to perform mutiple test case through chrome web browser.
 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
driver = new ChromeDriver();
driver.get("http://demo.itlearn360.com/");
driver.navigate().refresh();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
driver.findElement(By.id("loginlabel")).click();  	
driver.findElement(By.id("user_login")).sendKeys("Demo12");
driver.findElement(By.id("user_pass")).sendKeys("Test123456$");
driver.findElement(By.name("wp-submit")).click();
driver.findElement(By.name("search_course")).sendKeys("Manual");
driver.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button")).click();  
driver.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a")).click();
 System.out.println("open/http://demo.itlearn360.com/user-profile/Demo12/dashboard/");
 driver.findElement(By.xpath("//*[@id=\"learn-press-user-profile\"]/ul/li[3]/a")).click(); 
System.out.println("open/http://demo.itlearn360.com/user-profile/Demo12/academies/");
driver.findElement(By.xpath("//*[@id=\"tab-academies\"]/div/div/ul/li[1]/form/div/button\r\n"+ "")).click();
//    System.out.println("open/http://demo.itlearn360.com/checkout/");
//    driver.findElement(By.xpath("//*[@id=\"learn-press-payment\"]/ul/li")).click();
//    driver.findElement(By.name("learn-press-checkout-place-order")).click();
//    driver.findElement(By.name("cardnumber")).sendKeys("4242 4242 4242 4242 4240");
//    driver.findElement(By.name("cardExpiry")).sendKeys("08/28");
//    driver.findElement(By.name("cardCvc")).sendKeys("021");
//    
//    driver.findElement(By.id("payment-button")).click();
    
        }

@BeforeTest
public void beforeTest() {
    System.out.println("--@beforeTest, set the browser, maximise the window");
// 2. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
    driver = new ChromeDriver();
// 3. Initialize Webdriver object through ChromeDriver class.
    driver.manage().window().maximize();
}
// 14. @AfterTest is used to excute the test case after the test is exceuted
@AfterTest
public void afterTest() {
    System.out.println("--@afterTest, closing the browser window");
// 15. Close the web browser.   
    driver.close();
}
}