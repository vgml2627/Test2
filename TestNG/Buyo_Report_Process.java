package TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Buyo_Report_Process {
    
	//global declaration
	WebDriver driver;
	@BeforeTest
	public void open() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://panel-sandbox.buyofuel.com/auth/login");
		Thread.sleep(3000);
	}
	
	@Test(priority = 3,description= "Invalid test_case with incorrect username and password")
	public void Invalid_credential() throws InterruptedException
	{
	//user name field	
	WebElement  user_name=driver.findElement(By.id("login-form_email"));
	user_name.sendKeys("vishnu@gmail.com");
	String type_lenght=user_name.getAttribute("value");
	int lenght=type_lenght.length();
	if(lenght<=20){
		System.out.println("The username field limit is upto the requirment..."+lenght);}
	else{
		System.out.println("The username field limit is not upto the requirment..."+lenght);}
	Thread.sleep(3000);
	//password field
	WebElement pwd= driver.findElement(By.id("login-form_password"));
	pwd.sendKeys("1234567890");
	String type_lenght1=pwd.getAttribute("value");
	int lenght1=type_lenght1.length();
	if(lenght<=12){
		System.out.println("The password field limit is upto the requirment..."+lenght1);}
	else{
		System.out.println("The Password field limit is not upto the requirment..."+lenght1);}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/div/div/button")).click();
	//System.out.println(driver.getTitle());
	Thread.sleep(7000);
	String Act_Url="https://panel-sandbox.buyofuel.com/app/business";
	String Exp_Url=driver.getCurrentUrl();
	assertNotEquals(Act_Url,Exp_Url);
	System.out.println("login failed-invalid credential");
	System.out.println("The case passing URL is..."+Act_Url+" "+"But the actual URL is..."+Exp_Url);
	Reporter.log("Checking the test case with the invalid credential data for user name and password");
	}
	
	@Test(priority = 2,description ="valid test_case with correct user name and password")
	public void valid_cedential() throws InterruptedException {
		//user name field	
		driver.findElement(By.id("login-form_email")).sendKeys("tech@buyofuel.com");
		Thread.sleep(3000);
		//password field
		driver.findElement(By.id("login-form_password")).sendKeys("demo123$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/div/div/button")).click();
		Thread.sleep(5000);
		//System.out.println(driver.getTitle());
		//verifying the login...
		String act_title= "Buyofuel - Admin Panel";
		String Exp_title=driver.getTitle();
		assertEquals(act_title,Exp_title);
		System.out.println("Login success...");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/header/div/div[2]/div[2]/ul/li[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/ul/li/span/span/span[2]")).click();
		Thread.sleep(3000);
		Reporter.log("Successfull login with the valid credential");
		}
	@Test(priority = 1)
	public void validation_check() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/div/div/button")).click();
		Thread.sleep(6000);
		String Act_title="Please input your email";
		String exp_title=driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/div[2]/div[2]/div")).getText();
		//assertEquals(Act_title,exp_title);
	    System.out.println("Username should not be empty..."+exp_title);
	    String Act_title2="Please input your password";
	    String exp_title2=driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/div[2]/div[2]/div")).getText();
	    assertEquals(Act_title,exp_title);
	    System.out.println("password should not be empty..."+exp_title2);
	    driver.navigate().refresh();
	    Reporter.log("Test case validation checking  with blank data");
	    }
	
		
   @AfterTest
   public void close()
   {
	driver.quit();  
   }
}
