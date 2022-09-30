package WebpageTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	
	//getting title of page and comparing
	String act_title="OrangeHRM";
	String exp_title=driver.getTitle();
	if(act_title.equals(exp_title))
	{
		System.out.println("Page opened is correct");
	}
	else
	{
		System.out.println("Page opened is not-correct");
	}
	
	//Passing values to the demo page
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	Thread.sleep(5000);
	System.out.println("Succcessfully operated");
	driver.close();
	}

}
