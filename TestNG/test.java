package TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class test {
	public void task1() {
		

		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.buyofuel.com/signup");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("name")).sendKeys("Dipak Deore");//email
		driver.findElement(By.name("email")).sendKeys("dipa1234@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("123456789");
		
		driver.findElement(By.name("mobile")).sendKeys("9960588874");
        WebElement dropdown = driver.findElement(By.name("account"));
           Select ss=new Select(dropdown);
           ss.selectByVisibleText("Trader");
           
           driver.navigate().refresh();
		
	
           driver.findElement(By.xpath("//button[@type='submit']")).click();
   		
      	 String resul_actual = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).getText();
      	 
      	 
      	 System.out.println(resul_actual);
      	 
             //assert.equals(resul_actual.contains("Please enter or choose a value for Name"));
              
              driver.findElement(By.name("name")).sendKeys("Dipak Deore");
              driver.findElement(By.xpath("//button[@type='submit']")).click();
              
              
              
	
              
		
	}

}
