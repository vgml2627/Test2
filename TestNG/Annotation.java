package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation {
    WebDriver driver;
	@BeforeSuite
	public void open() {
		long start_time=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		long end_time=System.currentTimeMillis();
		long total_time= start_time - end_time;
		System.out.println("Starting Time taken is....."+total_time);

	}
	@Test(priority =1)
	
	public void buyofuel() throws InterruptedException
	{
		driver.get("https://buyofuel.com/");
		Thread.sleep(2000);
		System.out.println("successfully opened buyofuel webpage...");
	}
	@Test(priority =2)
	public void flipkart() throws InterruptedException
	{
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(2000);
	    System.out.println("Successfully opened flipkart webpage...");
	}
	@Test(priority =3)
	public void amazon() throws InterruptedException
	{
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		System.out.println("Successfully opened amazon webpage...");
	}
    
	@AfterSuite
	public void close()
	{
		long start_time=System.currentTimeMillis();
		driver.close();
		long end_time=System.currentTimeMillis();
		long total_time= start_time - end_time;
		System.out.println("Closing Time taken is....."+total_time);
	}
	

}
