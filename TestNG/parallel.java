package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel {

	@Test
	public void buyo()
	{
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://buyofuel.com/");
		//driver.quit();
	}
	@Test
	public void buyo_admin()
	{
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://panel-sandbox.buyofuel.com/auth/login");
		//driver.quit();
	}
	@Test
	public void monday()
	{
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://buyofuel.monday.com/boards/3388413966");
		//driver.quit();	
	}
}
