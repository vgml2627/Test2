package WebpageTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blog.hubspot.com/blog/tabid/6307/bid/34143/12-inspiring-examples-of-beautiful-blog-homepage-designs.aspx");
		Thread.sleep(5000);
		
		//here we are doing type cast or type conversion for driver to java script executor
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//1.scroll by pixel
		js.executeScript("window.scrollBy(0,6000)"," ");
		
		//2.scroll by finding element
		//WebElement content= driver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_post_body\"]/h3[1]/a[1]"));
		//js.executeScript("argument[0].scrollIntoView();",content);
		//......(issue in scrolling)
		
		
        //3.scroll till end of page
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight");
		//......(issue in scrolling)
		
		
	}

}
