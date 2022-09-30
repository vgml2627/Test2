package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclickActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		WebElement right_btn=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		act.contextClick(right_btn).click().build().perform();
		//this command  is used for right click on the web element.
		driver.findElement(By.xpath("/html/body/ul/li[4]/span")).click();
		Thread.sleep(3000);
		String alert=driver.switchTo().alert().getText();
		System.out.println("The content displayed from the alert is:...."+alert);
		driver.switchTo().alert().accept();
		//this command is used to accept the alert and close it.
		Thread.sleep(3000);
		driver.quit();
		

	}

}
