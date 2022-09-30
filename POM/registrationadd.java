package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class registrationadd {
	
	@Test
	public void registrationprocess() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Registration r_process=new Registration(driver);
		Thread.sleep(3000);
		
		r_process.firstname("vishnu");
		Thread.sleep(3000);
		r_process.lastname("geethan");
		Thread.sleep(3000);
		r_process.address("krg nagar,ganaapthy,cbe-06");
		Thread.sleep(3000);
		r_process.email("vishnu@gmail.com");
		Thread.sleep(3000);
		r_process.phone("97545464655");
		Thread.sleep(3000);
		r_process.hobby();
		Thread.sleep(3000);
		r_process.gender_male();
		Thread.sleep(3000);
		r_process.gender_female();
		Thread.sleep(3000);
		//r_process.language();
		//Thread.sleep(3000);
		r_process.skill();
		Thread.sleep(3000);
	    r_process.password("123456789");
		Thread.sleep(3000);
		r_process.c_password("123456789");
		Thread.sleep(3000);
		r_process.submit();
		
		
		
		
		
	}
	

}
