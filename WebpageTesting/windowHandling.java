package WebpageTesting;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.epfindia.gov.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("umang_panel_1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("pb_panel_1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ecr_panel_1")).click();
		Thread.sleep(3000);
		//System.out.println(driver.getTitle());
		Thread.sleep(2000);
		Set <String>index=driver.getWindowHandles();
		 //get window-handle return how many windows are opened and stores thier id's
		 //set is predefined class in java where it can store multiple things/values. 
		 //here index store the id of windows.
		for(String i:index)
		{
			//System.out.println(index);
			//printing the window id 
			String titles=driver.switchTo().window(i).getTitle();
			System.out.println(titles);
			
			Thread.sleep(3000);
			
			//closing the windows
			if(titles.contains("EPFO | Member Passbook & Claim Status"))
		      {
				driver.close();
			}
			if(titles.contains("Employees' Provident Fund Organisation"))
	      {
			driver.close();
		}
			
		
	}

	}
}
