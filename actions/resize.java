package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		Thread.sleep(3000);
        Actions act=new Actions(driver);
        WebElement resize= driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
        act.moveToElement(resize).dragAndDropBy(resize, 150, 150).build().perform();
        Thread.sleep(4000);
        driver.close();
        
        //git test
        
	}

}
