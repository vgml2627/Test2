package WebpageTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Get-Command
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//-----getURL
		String URL=driver.getCurrentUrl();
		System.out.println("The page URL IS:..."+URL);
		
		//----getTitle
		String title=driver.getTitle();
		System.out.println("The page Title is:..."+title);
		
		//----getText
		WebElement Text=driver.findElement(By.xpath("//*[name='login'"));
	    Text.getText();
	    System.out.println("The page Text is:..."+Text);
		
		/*//----getPageSource
		String pageSource=driver.getPageSource();
		System.out.println("The page source is:..."+pageSource);*/
	
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
	}

}
