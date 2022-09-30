package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test; 

public class RrgistrationNew {

	@Test
	public void registrationprocess() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.buyofuel.com/signup");
		RegistrationNewType r_process=new RegistrationNewType(driver);
		Thread.sleep(3000);
		
		r_process.username("vishnu");
		Thread.sleep(3000);
		r_process.mail("vishnu@gmail.com");
		Thread.sleep(3000);
		r_process.pwd("998855565656");
		Thread.sleep(3000);
		r_process.numeric("8025828658");
		Thread.sleep(3000);
		driver.close();
}
	
}