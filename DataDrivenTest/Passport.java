package DataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Passport {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","F:\\eclipse\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		Thread.sleep(3000);
		//boolean btn=driver.findElement(By.id("cpvLocation13")).isEnabled();
		//System.out.print(btn);
	    //driver.findElement(By.id("cpvLocationPO")).isEnabled();
		
		//working on excel sheet
		FileInputStream file=new FileInputStream("F:\\passport.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheetAt(0);
	    int row=sheet.getLastRowNum();
	    int col=sheet.getRow(0).getLastCellNum();
	    
	    for(int i=1;i<=row;i++)
	    {
	    	//Working on first row
	    	XSSFRow current_row=sheet.getRow(i);
	    	
	    	//Working on cell in selected row in loop
	    	//office
	    	XSSFCell poffice=current_row.getCell(0);
	    	String office=poffice.toString();
	    	
	    	//pname
	    	XSSFCell pname=current_row.getCell(1);
	    	String naem=pname.toString();
	    	
	    	//name
	    	XSSFCell name =current_row.getCell(2);
	    	String sur=name.toString();
	    	
	    	/*//Month
	    	XSSFCell month =current_row.getCell(3);
	    	String mon=month.toString();
	    	
	    	//year
	    	XSSFCell year =current_row.getCell(4);
	    	String yr=year.toString();*/
	    	
	    	//address
	    	XSSFCell address=current_row.getCell(3);
	    	String add=address.toString();
	    	
	    	//email
	    	XSSFCell email=current_row.getCell(4);
	    	String mail=email.toString();
	    	
	    	//login
	    	XSSFCell login=current_row.getCell(5);
	    	String log=login.toString();
	    	
	    	//password
	    	XSSFCell pass=current_row.getCell(6);
	    	
	    	//c_password
	    	XSSFCell cpass=current_row.getCell(7);
	    	String confirm=cpass.toString();
	    	
	    	//hint
	    	XSSFCell hint=current_row.getCell(8);
	    	String hques=hint.toString();
	    	
	    	//answer
	    	XSSFCell ans=current_row.getCell(9);
	    	String answer=ans.toString();
	    	
	    	driver.findElement(By.id("cpvLocation13")).click();
	    	Thread.sleep(3000);
	    	
	    	driver.findElement(By.id("cpvLocationPO")).click();
	    	Thread.sleep(3000);
	    	
	    	Select btn=new Select(driver.findElement(By.id("dcdrLocation")));
	    	btn.selectByVisibleText(office);
	    	
	    	driver.findElement(By.id("givenName")).sendKeys(naem);
	    	
	    	driver.findElement(By.id("surname")).sendKeys(sur);
	    	Thread.sleep(5000);
	    	
	    	/*driver.findElement(By.xpath("//*[@id=\"frmSample\"]/table/tbody/tr[6]/td[2]/img")).click();
	    	Select btn1=new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
	    	btn1.selectByVisibleText(mon);
	    	Thread.sleep(2000);
	    	Select btn2=new Select( driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));
	    	btn2.selectByVisibleText(yr);*/
	    	
	    	driver.findElement(By.id("email")).sendKeys(mail);
	    	Thread.sleep(5000);
	    	
	    	driver.findElement(By.id("loginId")).sendKeys(log);
	    	
	    	driver.findElement(By.id("pwd")).sendKeys(String.valueOf(pass));
	    	//here "String.valueof command is used for convert numeric values to string because sendkeys do not accept/take numeric
	    	
	    	driver.findElement(By.id("confirmPwd")).sendKeys(String.valueOf(confirm));
	    	
	    	Select btn3=new Select (driver.findElement(By.id("hintQues")));
	    	btn3.selectByVisibleText(hques);
	    	
	    	driver.findElement(By.id("hintAns")).sendKeys(answer);
	    	
	    	driver.findElement(By.id("frmSample_register")).click();
	    	//Thread.sleep(3000);
	    	driver.navigate().to("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
	    	
	 }
		   System.out.println("Successfull done Data Driven-Testing");
		   driver.close();
		
		

	}

}
