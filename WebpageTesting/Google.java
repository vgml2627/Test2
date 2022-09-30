package WebpageTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.browserstack.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.close();
	System.out.println("Webpage opening is successfull");
	
   
}
}
