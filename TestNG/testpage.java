package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testpage {
	WebDriver driver;
	@BeforeTest
	public void open() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://panel-sandbox.buyofuel.com/auth/login");
		Thread.sleep(3000);
	}
	
	@Test
	public void demo() throws InterruptedException {
		String act_url=driver.getCurrentUrl();
		System.out.print(act_url);
		Thread.sleep(3000);
	}
	
	@AfterTest
	   public void close()
	   {
		driver.quit();  
	   }

}
