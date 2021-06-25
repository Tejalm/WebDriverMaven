import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest {
	
	public static WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void login()
	{
		driver.get("https://www.flipkart.com/");
		System.out.println("Title of page is :" + driver.getTitle());
	}
	
	
	@AfterTest 
	public void teardown()
	{
		driver.quit();
	}

}
