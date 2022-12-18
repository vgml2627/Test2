package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Report {

	WebDriver driver;
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://panel-sandbox.buyofuel.com/auth/login");

	}
	
	@Test
	    public void Buyo_admin() throws InterruptedException 
	 {
		driver.findElement(By.id("login-form_email")).sendKeys("geethan@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("login-form_password")).sendKeys("789456");
		Thread.sleep(3000);
		Reporter.log("Succcessfully passed the value");
		
	}
	
	@AfterTest
	public void close() {
		driver.quit();
		
	}
	
}