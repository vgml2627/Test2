package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.epfindia.gov.in/");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
        WebElement service=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
        WebElement emp= driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[2]"));
        // act.moveToElement(service).build().perform();
        //build().perform() this command is used for complete the action of the element.
        // act.moveToElement(emp).click().build().perform(); //here we have used multiple line commands
        
        //single line commands.....
        act.moveToElement(service).moveToElement(emp).click().build().perform();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.quit();
        System.out.println("mouse over action completed successfully");
        
        //mouse over action example....
}
}
