package WebpageTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");	
		
		//Opening browser with headless -----commands
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		
		//Passing class object "options" in the driver class object.
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Headless browser Testing----"+driver.getTitle());
		System.out.println("Succcessfully operated headless browser testing");
		}

}
